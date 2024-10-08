package introse.group20.hms.application.services;

import introse.group20.hms.application.adapters.IDepartmentAdapter;
import introse.group20.hms.application.adapters.IDoctorAdapter;
import introse.group20.hms.application.services.interfaces.IDoctorService;
import introse.group20.hms.core.entities.Doctor;
import introse.group20.hms.core.entities.User;
import introse.group20.hms.core.exceptions.BadRequestException;
import introse.group20.hms.core.exceptions.NotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DoctorService implements IDoctorService {
    private IDoctorAdapter doctorAdapter;
    private IDepartmentAdapter departmentAdapter;
    public DoctorService(IDoctorAdapter doctorAdapter)
    {
        this.doctorAdapter = doctorAdapter;
    }
    @Override
    public List<Doctor> getAll() {
        return doctorAdapter.getAllDoctorsAdapter();
    }

    @Override
    public List<Doctor> getByDepartment(UUID departmentId)
    {
        return doctorAdapter.getByDepartmentIdAdapter(departmentId);
    }

    @Override
    public Doctor getById(UUID id) throws NotFoundException {
        Optional<Doctor> doctor = doctorAdapter.getByIdAdapter(id);
        if (doctor.isPresent())
        {
            return doctor.get();
        }
        else throw new NotFoundException(String.format("Doctor with id: %s not exist", id));
    }

    @Override
    public User addDoctor(UUID departmentId, Doctor doctor) throws BadRequestException {
       return  doctorAdapter.addDoctorAdapter(departmentId, doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor)
    {
        doctorAdapter.updateDoctorAdapter(doctor);
    }

    @Override
    public void deleteDoctor(UUID doctorId) {

    }
    @Override
    public void test()
    {
        doctorAdapter.test();
    }
}
