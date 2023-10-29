package homeworks.medicalcenter.model;

import homeworks.medicalcenter.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {

    private Date registerDate;

    private Date dateOfBirth;
    private Date researchTime;
    private Doctor doctor;

    public Patient(String id, String name, String surname, String phone, Date registerDate, Date dateOfBirth,Date researchTime, Doctor doctor) {
        super(id, name, surname, phone);
        this.registerDate = registerDate;
        this.dateOfBirth = dateOfBirth;
        this.doctor = doctor;
    }

    public Patient() {
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getResearchTime() {
        return researchTime;
    }

    public void setResearchTime(Date researchTime) {
        this.researchTime = researchTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Patient patient = (Patient) o;

        if (!Objects.equals(registerDate, patient.registerDate))
            return false;
        if (!Objects.equals(dateOfBirth, patient.dateOfBirth)) return false;
        if (!Objects.equals(researchTime, patient.researchTime))
            return false;
        return Objects.equals(doctor, patient.doctor);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (researchTime != null ? researchTime.hashCode() : 0);
        result = 31 * result + (doctor != null ? doctor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " Patient{" +
                "registerDate=" + DateUtil.dateToString(registerDate) +
                ", dateOfBirth=" + DateUtil.dateToString(dateOfBirth) +
                ", doctor=" + doctor +
                "} ";
    }
}
