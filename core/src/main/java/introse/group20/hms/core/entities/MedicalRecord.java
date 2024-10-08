package introse.group20.hms.core.entities;

import introse.group20.hms.core.entities.enums.StayType;

import java.util.Date;
import java.util.UUID;

public class MedicalRecord {
    private UUID id;
    private String BHYTCode;
    private Date inDay;
    private Date outDay;
    private String inDayDiagnose;
    private String outDayDiagnose;
    private String medicalHistory;
    private String diseaseProgress;
    private String testResults;
    private String hospitalDischargeStatus;
    private StayType stayType;
    private String note;
    private Doctor doctor;
    private Patient patient;
    private Department department;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBHYTCode() {
        return BHYTCode;
    }

    public void setBHYTCode(String BHYTCode) {
        this.BHYTCode = BHYTCode;
    }

    public Date getInDay() {
        return inDay;
    }

    public void setInDay(Date inDay) {
        this.inDay = inDay;
    }

    public Date getOutDay() {
        return outDay;
    }

    public void setOutDay(Date outDay) {
        this.outDay = outDay;
    }

    public String getInDayDiagnose() {
        return inDayDiagnose;
    }

    public void setInDayDiagnose(String inDayDiagnose) {
        this.inDayDiagnose = inDayDiagnose;
    }

    public String getOutDayDiagnose() {
        return outDayDiagnose;
    }

    public void setOutDayDiagnose(String outDayDiagnose) {
        this.outDayDiagnose = outDayDiagnose;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getDiseaseProgress() {
        return diseaseProgress;
    }

    public void setDiseaseProgress(String diseaseProgress) {
        this.diseaseProgress = diseaseProgress;
    }

    public String getTestResults() {
        return testResults;
    }

    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }

    public String getHospitalDischargeStatus() {
        return hospitalDischargeStatus;
    }

    public void setHospitalDischargeStatus(String hospitalDischargeStatus) {
        this.hospitalDischargeStatus = hospitalDischargeStatus;
    }

    public StayType getStayType() {
        return stayType;
    }

    public void setStayType(StayType stayType) {
        this.stayType = stayType;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
