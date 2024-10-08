package introse.group20.hms.application.adapters;

import introse.group20.hms.core.entities.Doctor;
import introse.group20.hms.core.entities.User;
import introse.group20.hms.core.exceptions.BadRequestException;
import introse.group20.hms.core.exceptions.NotFoundException;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IDoctorAdapter {
    List<Doctor> getAllDoctorsAdapter();
    List<Doctor> getByDepartmentIdAdapter(UUID departmentId);
    Optional<Doctor> getByIdAdapter(UUID id) ;
    User addDoctorAdapter(UUID departmentId, Doctor doctor) throws BadRequestException;
    void updateDoctorAdapter(Doctor doctor);
    void deleteDoctorAdapter(UUID doctorId);
    void test();
}
