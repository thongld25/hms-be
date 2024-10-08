package introse.group20.hms.infracstructure.adapters;

import introse.group20.hms.application.adapters.IPatientAdapter;
import introse.group20.hms.core.entities.Patient;
import introse.group20.hms.core.entities.User;
import introse.group20.hms.infracstructure.models.PatientModel;
import introse.group20.hms.infracstructure.models.UserModel;
import introse.group20.hms.infracstructure.models.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Component
public class PatientAdapter implements IPatientAdapter {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private PasswordEncoder encoder;
    @Override
    public List<Patient> getPatientByTypeAdapter(String type) {
        return null;
    }

    @Override
    public Optional<Patient> getPatientByIdAdapter(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<Patient> getPatientOfDoctorAdapter(UUID doctorId) {
        return null;
    }

    @Override
    public List<Patient> getPatientInWeek() {
        return null;
    }

    @Override
    @Transactional
    public User addPatientAdapter(Patient patient) {
        PatientModel patientModel = modelMapper.map(patient, PatientModel.class);
        String password = PasswordGenerator.generatePassword(10);
        UserModel userModel = new UserModel(patientModel.getPhoneNumber(), encoder.encode(password), Role.PATIENT);
        UUID id = UUID.randomUUID();
        patientModel.setId(id);
        userModel.setId(id);
        patientModel.setUser(userModel);
        userModel.setPatient(patientModel);
        entityManager.persist(userModel);
        entityManager.persist(patientModel);
        User user = new User();
        modelMapper.map(userModel, user);
        user.setPassword(password);
        return user;
    }

    @Override
    public void updatePatientAdapter(Patient patient) {

    }
}
