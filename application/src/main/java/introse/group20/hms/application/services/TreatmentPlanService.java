package introse.group20.hms.application.services;

import introse.group20.hms.application.adapters.ITreatmentPlanAdapter;
import introse.group20.hms.application.services.interfaces.ITreatmentPlanService;
import introse.group20.hms.core.entities.TreatmentPlan;
import introse.group20.hms.core.exceptions.BadRequestException;

import java.util.List;
import java.util.UUID;

public class TreatmentPlanService implements ITreatmentPlanService {
    private ITreatmentPlanAdapter iTreatmentPlanAdapter;
    public TreatmentPlanService(ITreatmentPlanAdapter iTreatmentPlanAdapter)
    {
        this.iTreatmentPlanAdapter = iTreatmentPlanAdapter;
    }
    @Override
    public List<TreatmentPlan> getForUser(UUID userId)
    {
        return iTreatmentPlanAdapter.getForUserAdapter(userId);
    }

    @Override
    public TreatmentPlan getById(UUID id) {
        return null;
    }

    @Override
    public void createTreatmentPlan(UUID patientId, UUID doctorId, TreatmentPlan treatmentPlan) throws BadRequestException {
        iTreatmentPlanAdapter.createTreatmentPlanAdapter(patientId, doctorId, treatmentPlan);
    }

    @Override
    public void deleteTreatmentPlan(UUID id) {

    }

    @Override
    public void updateTreatmentPlan(TreatmentPlan treatmentPlan) {

    }
}
