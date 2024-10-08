package introse.group20.hms.infracstructure.repositories;

import introse.group20.hms.infracstructure.models.TreatmentPlanModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ITreatmentPlanRepository extends JpaRepository<TreatmentPlanModel, UUID> {
    List<TreatmentPlanModel> findByPatientId(UUID patientId);
}
