package introse.group20.hms.infracstructure.adapters;

import introse.group20.hms.application.adapters.IDoctorAdapter;
import introse.group20.hms.core.entities.Doctor;
import introse.group20.hms.core.entities.User;
import introse.group20.hms.core.exceptions.BadRequestException;
import introse.group20.hms.infracstructure.mappers.DoctorMapperInfra;
import introse.group20.hms.infracstructure.models.DepartmentModel;
import introse.group20.hms.infracstructure.models.DoctorModel;
import introse.group20.hms.infracstructure.models.UserModel;
import introse.group20.hms.infracstructure.models.enums.Role;
import introse.group20.hms.infracstructure.repositories.IDepartmentRepository;
import introse.group20.hms.infracstructure.repositories.IDoctorRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
@Component
public class DoctorAdapter implements IDoctorAdapter {
    @Autowired
    private IDoctorRepository doctorRepository;
    @Autowired
    private DoctorMapperInfra doctorMapperInfra;
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private IDepartmentRepository departmentRepository;
    @Autowired
    private PasswordEncoder encoder;
    @Override
    public List<Doctor> getAllDoctorsAdapter() {
        List<DoctorModel> list = doctorRepository.findAll();
        return list.stream()
                .map(doctorModel -> doctorMapperInfra.mapToDoctor(doctorModel))
                .collect(Collectors.toList());
    }

    @Override
    public List<Doctor> getByDepartmentIdAdapter(UUID departmentId)
    {
        List<DoctorModel> doctors = doctorRepository.findByDepartmentId(departmentId);
        return doctors.stream()
                .map(doctorModel -> doctorMapperInfra.mapToDoctor(doctorModel))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Doctor> getByIdAdapter(UUID id)
    {
        Optional<DoctorModel> doctorModel = doctorRepository.findById(id);
        if (doctorModel.isPresent())
        {
            Doctor doctor = doctorMapperInfra.mapToDoctor(doctorModel.get());
            return Optional.of(doctor);
        }
        else return Optional.empty();

    }

    @Override
    @Transactional
    public User addDoctorAdapter(UUID departmentId, Doctor doctor) throws BadRequestException {
        Optional<DepartmentModel> departmentModel = departmentRepository.findById(departmentId);
        if (departmentModel.isPresent())
        {
            DepartmentModel department = departmentModel.get();
            DoctorModel doctorModel = modelMapper.map(doctor, DoctorModel.class);
            doctorModel.setDepartment(department);
            String password = PasswordGenerator.generatePassword(10);
            UserModel userModel = new UserModel(doctorModel.getPhoneNumber(), encoder.encode(password), Role.DOCTOR);
            UUID id = UUID.randomUUID();
            doctorModel.setId(id);
            userModel.setId(id);
            doctorModel.setUser(userModel);
            userModel.setDoctor(doctorModel);
            entityManager.persist(userModel);
            User user = new User();
            modelMapper.map(userModel, user);
            user.setPassword(password);
            return user;
        }
        else throw new BadRequestException("Bad request!");
    }

    @Override
    public void updateDoctorAdapter(Doctor doctor)
    {
        DoctorModel doctorModel = modelMapper.map(doctor, DoctorModel.class);
        doctorRepository.save(doctorModel);
    }

    @Override
    public void deleteDoctorAdapter(UUID doctorId) {

    }
    @Override
    @Transactional
    public void test()
    {
        UUID id = UUID.randomUUID();
        DoctorModel doctorModel = new DoctorModel();
        doctorModel.setId(id);
        DepartmentModel departmentModel = departmentRepository.findAll().get(0);
        doctorModel.setDepartment(departmentModel);
        doctorModel.setBirthday(new Date());
        UserModel userModel = new UserModel();
        userModel.setId(id);
        userModel.setRole(Role.ADMIN);
        userModel.setUsername("12345");
        userModel.setPassword("123456");
        userModel.setDoctor(doctorModel);
        doctorModel.setUser(userModel);
        entityManager.persist(doctorModel);
        entityManager.persist(userModel);
    }
}
