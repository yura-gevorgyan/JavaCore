package homeworks.medicalcenter;

import homeworks.medicalcenter.model.Doctor;
import homeworks.medicalcenter.model.Patient;
import homeworks.medicalcenter.storage.DoctorStorage;
import homeworks.medicalcenter.storage.PatientStorage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class MedicalCenterTest {

    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addDoctor();
                    break;
                case "2":
                    searchDoctorByProfession();
                    break;
                case "3":
                    deleteDoctorById();
                    break;
                case "4":
                    changeDoctorById();
                    break;
                case "5":
                    addPatient();
                    break;
                case "6":
                    searchPatientByDoctor();
                    break;
                case "7":
                    patientStorage.print();
                    break;
                default:
                    System.out.println("Invalid command PLEASE TRY AGAIN");
            }
        }
    }

    private static void searchPatientByDoctor() {
        doctorStorage.print();
        System.out.println("Please choose DOCTOR ID");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByID(doctorId);

        if (doctorFromStorage == null) {
            System.out.println("Doctor with " + doctorId + " ID have not");
            return;
        }

        patientStorage.searchPatientByDoctor(doctorFromStorage);
    }

    private static void addPatient() {
        doctorStorage.print();
        System.out.println("Please choose DOCTOR ID");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByID(doctorId);

        if (doctorFromStorage == null) {
            System.out.println("Doctor with " + doctorId + " ID have not");
            return;
        }

        System.out.println("Please input PATIENT ID");
        String patientId = scanner.nextLine();
        System.out.println("Please input PATIENT NAME");
        String patientName = scanner.nextLine();
        System.out.println("Please input PATIENT SURNAME");
        String patientSurname = scanner.nextLine();
        System.out.println("Please input PATIENT PHONE NUMBER");
        String phoneNumber = scanner.nextLine();

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String format = sdf.format(date);

        Patient patient = new Patient(patientId,patientName,patientSurname,phoneNumber,format,doctorFromStorage);
        patientStorage.add(patient);

        System.out.println("Patient with " + patientId + " ID is added");


    }

    private static void changeDoctorById() {
        doctorStorage.print();
        System.out.println("Please choose DOCTOR ID");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByID(doctorId);

        if (doctorFromStorage == null) {
            System.out.println("Doctor with " + doctorId + " ID have not");
            return;
        }

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

        System.out.println("Doctor is updated !!!");
    }

    private static void deleteDoctorById() {
        doctorStorage.print();
        System.out.println("Please choose DOCTOR ID");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getByID(doctorId);

        if (doctorFromStorage == null) {
            System.out.println("Doctor with " + doctorId + " ID have not");
            return;
        }

        patientStorage.deletePatientByDoctor(doctorFromStorage);
        doctorStorage.deleteDoctor(doctorId);

        System.out.println("Doctor id deleted !!!");
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input PROFESSION");
        String doctorProfession = scanner.nextLine();
        doctorStorage.searchDoctorByProfession(doctorProfession);
    }

    private static void addDoctor() {

        System.out.println("Please input ID");
        String doctorId = scanner.nextLine();

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
        doctorStorage.add(doctor);

        System.out.println("Doctor with " + doctorId + " ID is added");

    }

    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD DOCTOR");
        System.out.println("Please input 2 for SEARCH DOCTOR BY PROFESSION");
        System.out.println("Please input 3 for DELETE DOCTOR BY ID");
        System.out.println("Please input 4 for CHANGE DOCTOR BY ID");
        System.out.println("Please input 5 for ADD PATIENT");
        System.out.println("Please input 6 for PRINT ALL PATIENTS BY DOCTOR");
        System.out.println("Please input 7 for PRINT ALL PATIENTS");
    }
}
