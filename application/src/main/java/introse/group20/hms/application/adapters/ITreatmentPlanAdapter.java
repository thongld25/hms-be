package introse.group20.hms.application.adapters;

import introse.group20.hms.core.entities.TreatmentPlan;
import introse.group20.hms.core.exceptions.BadRequestException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ITreatmentPlanAdapter {
    List<TreatmentPlan> getForUserAdapter(UUID userId);
    Optional<TreatmentPlan> getByIdAdapter(UUID id);
    void createTreatmentPlanAdapter(UUID patientId, UUID doctorId, TreatmentPlan treatmentPlan) throws BadRequestException;
    void updateTreatmentPlanAdapter(TreatmentPlan treatmentPlan);
    void deleteTreatmentPlanAdapter(UUID id);
}
