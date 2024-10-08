package introse.group20.hms.infracstructure.repositories;

import introse.group20.hms.infracstructure.models.SurgeryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ISurgeryRepository extends JpaRepository<SurgeryModel, UUID> {
}
