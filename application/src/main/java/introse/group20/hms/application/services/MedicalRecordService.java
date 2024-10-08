package introse.group20.hms.application.services;

import introse.group20.hms.application.services.interfaces.IMedicalRecordService;
import introse.group20.hms.core.entities.MedicalRecord;

import java.util.List;
import java.util.UUID;

public class MedicalRecordService implements IMedicalRecordService {
    @Override
    public List<MedicalRecord> getByPatientId(UUID patientId) {
        return null;
    }

    @Override
    public MedicalRecord getById(UUID mrId) {
        return null;
    }

    @Override
    public MedicalRecord addMedicalRecord(UUID patientId, UUID departmentId, UUID doctorId, MedicalRecord medicalRecord) {
        return null;
    }

    @Override
    public void updateMedicalRecord(MedicalRecord medicalRecord) {

    }

    @Override
    public void deleteMedicalRecord(UUID mrId) {

    }
}
