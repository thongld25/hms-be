package introse.group20.hms.infracstructure.repositories;

import introse.group20.hms.infracstructure.models.MedicalRecordModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IMedicalRecordRepository extends JpaRepository<MedicalRecordModel, UUID> {
}
