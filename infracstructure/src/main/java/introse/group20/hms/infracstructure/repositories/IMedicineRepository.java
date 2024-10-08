package introse.group20.hms.infracstructure.repositories;

import introse.group20.hms.infracstructure.models.MedicineModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IMedicineRepository extends JpaRepository<MedicineModel, UUID> {
}
