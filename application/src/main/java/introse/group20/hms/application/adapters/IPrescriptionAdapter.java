package introse.group20.hms.application.adapters;

import introse.group20.hms.core.entities.Prescription;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IPrescriptionAdapter {
    List<Prescription> getByPatientAdapter(UUID patientId);
    Optional<Prescription> getByIdAdapter(UUID presId);
    Prescription addPrescriptionAdapter(UUID doctorId, UUID patientId, Prescription prescription);
    void updatePrescriptionAdapter(Prescription prescription);
    void deletePrescriptionAdapter(UUID presId);
}
