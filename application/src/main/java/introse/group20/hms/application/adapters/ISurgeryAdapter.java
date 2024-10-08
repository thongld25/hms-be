package introse.group20.hms.application.adapters;

import introse.group20.hms.core.entities.Surgery;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ISurgeryAdapter {
    List<Surgery> getAllAdapter();
    List<Surgery> getSurgeryForDoctorAdapter(UUID doctorId);
    Surgery addSurgeryAdapter(UUID doctorId, UUID patientId, Surgery surgery);
    void updateSurgeryAdapter(Surgery surgery);
    void deleteSurgeAdapter(UUID surgeryId);
}
