package introse.group20.hms.infracstructure.repositories;

import introse.group20.hms.infracstructure.models.DepartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IDepartmentRepository extends JpaRepository<DepartmentModel, UUID> {
}
