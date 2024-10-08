package introse.group20.hms.application.services;

import introse.group20.hms.application.services.interfaces.IPrescriptionService;
import introse.group20.hms.core.entities.Prescription;

import java.util.List;
import java.util.UUID;

public class PrescriptionService implements IPrescriptionService {
    @Override
    public List<Prescription> getByPatient(UUID patientId) {
        return null;
    }

    @Override
    public Prescription getById(UUID presId) {
        return null;
    }

    @Override
    public Prescription addPrescription(UUID doctorId, UUID patientId, Prescription prescription) {
        return null;
    }

    @Override
    public void updatePrescription(Prescription prescription) {

    }

    @Override
    public void deletePrescription(UUID presId) {

    }
}
