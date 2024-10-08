package introse.group20.hms.application.services.interfaces;

import introse.group20.hms.core.entities.MedicalRecord;

import java.util.List;
import java.util.UUID;

public interface IMedicalRecordService {
    List<MedicalRecord> getByPatientId(UUID patientId);
    MedicalRecord getById(UUID mrId);
    MedicalRecord addMedicalRecord(UUID patientId, UUID departmentId, UUID doctorId, MedicalRecord medicalRecord);
    void updateMedicalRecord(MedicalRecord medicalRecord);
    void deleteMedicalRecord(UUID mrId);
}
