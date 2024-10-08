package introse.group20.hms.application.services;

import introse.group20.hms.application.adapters.IPatientAdapter;
import introse.group20.hms.application.services.interfaces.IPatientService;
import introse.group20.hms.core.entities.Patient;
import introse.group20.hms.core.entities.User;

import java.util.List;
import java.util.UUID;

public class PatientService implements IPatientService {
    private IPatientAdapter patientAdapter;
    public PatientService(IPatientAdapter patientAdapter)
    {
        this.patientAdapter = patientAdapter;
    }
    @Override
    public List<Patient> getPatientByType(String type) {
        return null;
    }

    @Override
    public Patient getPatientById(UUID id) {
        return null;
    }

    @Override
    public List<Patient> getPatientOfDoctor(UUID doctorId) {
        return null;
    }

    @Override
    public List<Patient> getPatientInWeek() {
        return null;
    }

    @Override
    public User addPatient(Patient patient)
    {
        return patientAdapter.addPatientAdapter(patient);
    }

    @Override
    public void updatePatient(Patient patient) {

    }
}
