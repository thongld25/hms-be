package introse.group20.hms.application.adapters;

import introse.group20.hms.core.entities.MedicalRecord;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IMedicalRecordAdapter {
    List<MedicalRecord> getByPatientIdAdapter(UUID patientId);
    Optional<MedicalRecord> getByIdAdapter(UUID mrId);
    MedicalRecord addMedicalRecordAdapter(UUID doctorId, UUID departmentId, UUID patientId, MedicalRecord medicalRecord);
    void updateMedicalRecordAdapter(MedicalRecord medicalRecord);
    void deleteMedicalRecordAdapter(UUID mrId);
}
