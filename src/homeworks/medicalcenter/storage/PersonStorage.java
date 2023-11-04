package homeworks.medicalcenter.storage;

import classwork.chapter8.callingconsdemo.C;
import homeworks.medicalcenter.model.Doctor;
import homeworks.medicalcenter.model.Patient;
import homeworks.medicalcenter.model.Person;
import homeworks.medicalcenter.util.DateUtil;

import java.util.Calendar;
import java.util.Date;

public class PersonStorage {

    private Person[] people = new Person[10];
    private int size = 0;

    public void add(Person person) {
        if (size == people.length - 1) {
            extend();
        }
        people[size++] = person;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor) {
                System.out.println(people[i]);
            }
        }
    }

    public void printPatient() {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                System.out.println(people[i]);
            }
        }
    }

    private void extend() {
        Person[] tmp = new Person[people.length + 10];
        System.arraycopy(people, 0, tmp, 0, people.length);
        people = tmp;
    }

    public Person getByID(String id) {
        for (int i = 0; i < size; i++) {
            if (people[i].getId().equals(id)) {
                return people[i];
            }
        }
        return null;
    }

    public void searchPatientByDoctor(Doctor doctorFromStorage) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient && ((Patient) people[i]).getDoctor().equals(doctorFromStorage)) {
                System.out.println(people[i]);
            }
        }
    }

    public void deletePerson(Person person) {
        for (int i = 0; i < size; i++) {
            if (people[i].equals(person)) {
                for (int j = i; j < size; j++) {
                    people[j] = people[j + 1];
                }
                size--;
                break;
            }
        }
    }

    public void deletePatientByDoctor(Doctor doctorFromStorage) {
        for (int i = 0; i <= size; i++) {
            if (people[i] instanceof Patient && ((Patient) people[i]).getDoctor().equals(doctorFromStorage)) {
                for (int j = i; j < size; j++) {
                    people[j] = people[j + 1];
                }
                size--;
            }
        }
    }

    public void changeDoctorForPatient(Doctor doctor, String profession) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient && ((Patient) people[i]).getDoctor().getProfession().contains(profession)) {
                ((Patient) people[i]).setDoctor(doctor);
            }
        }
    }

    public void printDoctorByProfession(String doctorProfession) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor && ((Doctor) people[i]).getProfession().contains(doctorProfession)) {
                System.out.println(people[i]);
            }
        }
    }

    public Person searchDoctorByProfession(String doctorProfession) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor && ((Doctor) people[i]).getProfession().contains(doctorProfession)) {
                return people[i];
            }
        }
        return null;
    }

    public boolean researchTime(Doctor doctorFromStorage, Date researchDay) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient patient) {
                if (patient.getDoctor().equals(doctorFromStorage)) {

                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(patient.getResearchTime());
                    calendar.add(Calendar.MINUTE, 30);
                    Date researchDateTime30Plus = calendar.getTime();

                    if (researchDateTime30Plus.after(researchDay)) {
                        return true;
                    }

                }
            }
        }
        return false;
    }
}
