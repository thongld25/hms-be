package introse.group20.hms.core.entities;

import java.util.Date;
import java.util.UUID;

public class TreatmentPlan {
    private UUID id;
    private String treatmentMethod;
    private Date lastExaminationDay;
    private Date nextExpectedExaminationDay;
    private String note;
    private Doctor doctor;
    private Patient patient;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTreatmentMethod() {
        return treatmentMethod;
    }

    public void setTreatmentMethod(String treatmentMethod) {
        this.treatmentMethod = treatmentMethod;
    }

    public Date getLastExaminationDay() {
        return lastExaminationDay;
    }

    public void setLastExaminationDay(Date lastExaminationDay) {
        this.lastExaminationDay = lastExaminationDay;
    }

    public Date getNextExpectedExaminationDay() {
        return nextExpectedExaminationDay;
    }

    public void setNextExpectedExaminationDay(Date nextExpectedExaminationDay) {
        this.nextExpectedExaminationDay = nextExpectedExaminationDay;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
