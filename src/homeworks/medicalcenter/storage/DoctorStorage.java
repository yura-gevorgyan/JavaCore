package homeworks.medicalcenter.storage;

import homeworks.medicalcenter.model.Doctor;

public class DoctorStorage {

    private Doctor[] doctors = new Doctor[10];
    private int size = 0;

    public void add(Doctor doctor) {
        if (size == doctors.length - 1) {
            extend();
        }
        doctors[size++] = doctor;
    }


    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().toLowerCase().contains(profession.toLowerCase())) {
                System.out.println(doctors[i]);
            }
        }
    }

    public Doctor getByID(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return doctors[i];
            }
        }
        return null;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }

    public void deleteDoctor(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                for (int j = i; j < size - 1; j++) {
                    doctors[i] = doctors[i + 1];
                }
                size--;
            }
        }
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
        doctors = tmp;
    }
}
