package introse.group20.hms.application.services.interfaces;

import introse.group20.hms.core.entities.Prescription;

import java.util.List;
import java.util.UUID;

public interface IPrescriptionService {
    List<Prescription> getByPatient(UUID patientId);
    Prescription getById(UUID presId);
    Prescription addPrescription(UUID doctorId, UUID patientId, Prescription prescription);
    void updatePrescription(Prescription prescription);
    void deletePrescription(UUID presId);
}
