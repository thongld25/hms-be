package introse.group20.hms.infracstructure.repositories;

import introse.group20.hms.infracstructure.models.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IPatientRepository extends JpaRepository<PatientModel, UUID> {
}
