package introse.group20.hms.application.services;

import introse.group20.hms.application.adapters.ISurgeryAdapter;
import introse.group20.hms.application.services.interfaces.ISurgeryService;
import introse.group20.hms.core.entities.Surgery;

import java.util.List;
import java.util.UUID;

public class SurgeryService implements ISurgeryService {
    private ISurgeryAdapter surgeryAdapter;
    public SurgeryService(ISurgeryAdapter surgeryAdapter)
    {
        this.surgeryAdapter = surgeryAdapter;
    }
    @Override
    public List<Surgery> getAll()
    {
        return surgeryAdapter.getAllAdapter();
    }

    @Override
    public List<Surgery> getSurgeryForDoctor(UUID doctorId) {
        return null;
    }

    @Override
    public Surgery addSurgery(UUID doctorId, UUID patientId, Surgery surgery) {
        return null;
    }

    @Override
    public void updateSurgery(Surgery surgery) {

    }

    @Override
    public void deleteSurge(UUID surgeryId) {

    }
}
