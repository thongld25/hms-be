package introse.group20.hms.application.services.interfaces;

import introse.group20.hms.core.entities.Appointment;
import introse.group20.hms.core.entities.enums.AppointmentStatus;

import java.util.List;
import java.util.UUID;

public interface IAppointmentService {
    List<Appointment> getAppointmentByDoctor(UUID doctorId);
    List<Appointment> getAppointmentByPatient(UUID patientId);
    Appointment addAppointment(UUID doctorId, UUID patientId, Appointment apm);
    void updateAppointment(Appointment appointment);
    void deleteAppointment(UUID id);
}
