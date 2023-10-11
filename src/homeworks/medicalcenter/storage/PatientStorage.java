package homeworks.medicalcenter.storage;

import homeworks.medicalcenter.model.Doctor;
import homeworks.medicalcenter.model.Patient;

public class PatientStorage {

    private Patient[] patients = new Patient[10];
    private int size = 0;

    public void add(Patient patient) {
        if (size == patients.length - 1) {
            extend();
        }
        patients[size++] = patient;
    }


    public void searchPatientByDoctor(Doctor doctorFromStorage) {
        for (int i = 0; i < size; i++) {

            if (patients[i].getDoctor().equals(doctorFromStorage)) {
                System.out.println(patients[i]);
            }

        }

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }
    }

    public void deletePatientByDoctor(Doctor doctorFromStorage) {
        for (int i = 0; i <= size; i++) {
            if (patients[i].getDoctor().equals(doctorFromStorage)) {
                for (int j = i; j < size; j++) {
                    patients[i] = patients[i + 1];
                }
                size--;
            }
        }
    }

    private void extend() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, patients.length);
        patients = tmp;
    }
}
