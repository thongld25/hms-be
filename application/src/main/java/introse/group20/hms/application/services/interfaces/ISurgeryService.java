package introse.group20.hms.application.services.interfaces;

import introse.group20.hms.core.entities.Surgery;

import java.util.List;
import java.util.UUID;

public interface ISurgeryService {
    List<Surgery> getAll();
    List<Surgery> getSurgeryForDoctor(UUID doctorId);
    Surgery addSurgery(UUID doctorId, UUID patientId, Surgery surgery);
    void updateSurgery(Surgery surgery);
    void deleteSurge(UUID surgeryId);
}
