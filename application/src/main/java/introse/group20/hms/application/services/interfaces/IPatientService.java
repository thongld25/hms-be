package introse.group20.hms.application.services.interfaces;

import introse.group20.hms.core.entities.Patient;
import introse.group20.hms.core.entities.User;

import java.util.List;
import java.util.UUID;

public interface IPatientService {
    List<Patient> getPatientByType(String type);
    Patient getPatientById(UUID id);
    List<Patient> getPatientOfDoctor(UUID doctorId);
    List<Patient> getPatientInWeek();
    User addPatient(Patient patient);
    void updatePatient(Patient patient);
}
