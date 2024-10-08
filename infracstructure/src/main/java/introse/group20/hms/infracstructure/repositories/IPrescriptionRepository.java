package introse.group20.hms.infracstructure.repositories;

import introse.group20.hms.infracstructure.models.PrescriptionModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IPrescriptionRepository extends JpaRepository<PrescriptionModel, UUID> {
}
