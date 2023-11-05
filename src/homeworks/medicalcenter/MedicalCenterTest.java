package homeworks.medicalcenter;

import homeworks.medicalcenter.model.Doctor;
import homeworks.medicalcenter.model.Patient;
import homeworks.medicalcenter.storage.PersonStorage;
import homeworks.medicalcenter.util.DateUtil;
import homeworks.medicalcenter.util.StorageSerializeUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;


public class MedicalCenterTest implements Command {

    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = StorageSerializeUtil.deserializePersonStorage();

    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        while (isRun) {
            Command.printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    searchPatientByDoctor();
                    break;
                case PRINT_ALL_PATIENTS:
                    personStorage.printPatient();
                    break;
                default:
                    System.out.println("Invalid command PLEASE TRY AGAIN");
            }
        }
    }

    private static void searchPatientByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose DOCTOR ID");
        String doctorId = scanner.nextLine();
        if (personStorage.getByID(doctorId) instanceof Doctor doctorFromStorage) {
            personStorage.searchPatientByDoctor(doctorFromStorage);
        } else {
            System.out.println("Doctor with " + doctorId + " ID have not");
        }


    }

    private static void addPatient() throws ParseException {
        personStorage.printDoctors();
        System.out.println("Please choose DOCTOR ID");
        String doctorId = scanner.nextLine();
        if (personStorage.getByID(doctorId) instanceof Doctor doctorFromStorage) {

            System.out.println("Please input PATIENT ID");
            String patientId = scanner.nextLine();

            if (personStorage.getByID(patientId) instanceof Patient) {
                System.out.println("Patient with " + patientId + " have already added");
                return;
            }


            System.out.println("Please input PATIENT NAME");
            String patientName = scanner.nextLine();

            System.out.println("Please input PATIENT SURNAME");
            String patientSurname = scanner.nextLine();

            System.out.println("Please input PATIENT PHONE NUMBER");
            String phoneNumber = scanner.nextLine();

            System.out.println("Please input DATE OF BIRTHDAY (dd/MM/yyyy)");
            String dateOfBirthdayStr = scanner.nextLine();
            Date dateOfBirthday = DateUtil.stringToDate(dateOfBirthdayStr);

            Date date = new Date();


            System.out.println("Please input RESEARCH DAY (dd/MM/yyyy HH:mm)");
            String researchDayStr = scanner.nextLine();
            Date researchDay = DateUtil.stringToDateTime(researchDayStr);

            if (personStorage.researchTime(doctorFromStorage, researchDay)) {

                Patient patient = new Patient(patientId, patientName, patientSurname, phoneNumber, researchDay, dateOfBirthday, researchDay, doctorFromStorage);
                personStorage.add(patient);
            }


        }
    }

    private static void changeDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose DOCTOR ID");
        String doctorId = scanner.nextLine();
        if (personStorage.getByID(doctorId) instanceof Doctor doctorFromStorage) {

            System.out.println("Please input DOCTOR NEW NAME");
            String doctorName = scanner.nextLine();

            System.out.println("Please input DOCTOR NEW SURNAME");
            String doctorSurname = scanner.nextLine();

            System.out.println("Please input DOCTOR NEW PHONE NUMBER");
            String phoneNumber = scanner.nextLine();

            System.out.println("Please input DOCTOR NEW E-MAIL");
            String email = scanner.nextLine();

            System.out.println("Please input DOCTOR NEW PROFESSION");
            String profession = scanner.nextLine();

            doctorFromStorage.setName(doctorName);

            doctorFromStorage.setSurname(doctorSurname);

            doctorFromStorage.setPhone(phoneNumber);

            doctorFromStorage.setEmail(email);

            doctorFromStorage.setProfession(profession);

            StorageSerializeUtil.serializePersonStorage(personStorage);

            System.out.println("Doctor is updated !!!");

        } else {
            System.out.println("Doctor with " + doctorId + " ID have not");
        }
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose DOCTOR ID");
        String doctorId = scanner.nextLine();
        if (personStorage.getByID(doctorId) instanceof Doctor) {

            Doctor doctorFromStorage = (Doctor) personStorage.getByID(doctorId);
            String profession = doctorFromStorage.getProfession();

            personStorage.deletePerson(doctorFromStorage);

            if (personStorage.searchDoctorByProfession(profession) == null) {
                System.out.println("Sorry we have not another Doctor with this profession");
                personStorage.deletePatientByDoctor(doctorFromStorage);

            } else {
                personStorage.printDoctorByProfession(profession);
                System.out.println("Please choose another Doctor by ID");
                String id = scanner.nextLine();
                if (personStorage.getByID(id) instanceof Doctor) {
                    Doctor doctor = (Doctor) personStorage.getByID(id);
                    personStorage.changeDoctorForPatient(doctor, profession);
                    StorageSerializeUtil.serializePersonStorage(personStorage);
                }
            }


            System.out.println("Doctor id deleted !!!");
        } else {
            System.out.println("Doctor with " + doctorId + " ID have not");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input PROFESSION");
        String doctorProfession = scanner.nextLine();
        personStorage.printDoctorByProfession(doctorProfession);
    }

    private static void addDoctor() {
        System.out.println("Please input ID");
        String doctorId = scanner.nextLine();

        if (personStorage.getByID(doctorId) instanceof Doctor) {
            System.out.println("Doctor with " + doctorId + " ID have already added");
            return;
        }

        System.out.println("Please input NAME");
        String doctorName = scanner.nextLine();

        System.out.println("Please input SURNAME");
        String doctorSurname = scanner.nextLine();

        System.out.println("Please input PHONE NUMBER");
        String phoneNumber = scanner.nextLine();

        System.out.println("Please input E-MAIL");
        String email = scanner.nextLine();

        System.out.println("Please input PROFESSION");
        String profession = scanner.nextLine();

        Doctor doctor = new Doctor(doctorId, doctorName, doctorSurname, phoneNumber, email, profession);
        personStorage.add(doctor);

        System.out.println("Doctor with " + doctorId + " ID is added");
    }
}
