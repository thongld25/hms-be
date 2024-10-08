package introse.group20.hms.application.adapters;

import introse.group20.hms.core.entities.Patient;
import introse.group20.hms.core.entities.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IPatientAdapter {
    List<Patient> getPatientByTypeAdapter(String type);
    Optional<Patient> getPatientByIdAdapter(UUID id);
    List<Patient> getPatientOfDoctorAdapter(UUID doctorId);
    List<Patient> getPatientInWeek();
    User addPatientAdapter(Patient patient);
    void updatePatientAdapter(Patient patient);
}
