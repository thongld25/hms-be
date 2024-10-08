package introse.group20.hms.application.services.interfaces;

import introse.group20.hms.core.entities.Doctor;
import introse.group20.hms.core.entities.User;
import introse.group20.hms.core.exceptions.BadRequestException;
import introse.group20.hms.core.exceptions.NotFoundException;

import java.util.List;
import java.util.UUID;

public interface IDoctorService {
    List<Doctor> getAll();
    List<Doctor> getByDepartment(UUID departmentId);
    Doctor getById(UUID id) throws NotFoundException;
    User addDoctor(UUID departmentId, Doctor doctor) throws BadRequestException;
    void updateDoctor(Doctor doctor);
    void deleteDoctor(UUID doctorId);
    void test();
}
