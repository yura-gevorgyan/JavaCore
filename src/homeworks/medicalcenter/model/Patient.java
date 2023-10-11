package homeworks.medicalcenter.model;

import java.util.Objects;

public class Patient extends Person{

    private String registerDate;
    private Doctor doctor;

    public Patient(String id, String name, String surname, String phone, String registerDate, Doctor doctor) {
        super(id, name, surname, phone);
        this.registerDate = registerDate;
        this.doctor = doctor;
    }

    public Patient() {
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (!Objects.equals(registerDate, patient.registerDate))
            return false;
        return Objects.equals(doctor, patient.doctor);
    }

    @Override
    public int hashCode() {
        int result = registerDate != null ? registerDate.hashCode() : 0;
        result = 31 * result + (doctor != null ? doctor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "registerDate='" + registerDate + '\'' +
                ", doctor=" + doctor +
                "} " + super.toString();
    }
}
