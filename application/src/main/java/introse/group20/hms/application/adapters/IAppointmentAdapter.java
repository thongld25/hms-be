package introse.group20.hms.application.adapters;

import introse.group20.hms.core.entities.Appointment;
import introse.group20.hms.core.entities.enums.AppointmentStatus;
import introse.group20.hms.core.exceptions.BadRequestException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IAppointmentAdapter {
    List<Appointment> getAppointmentByDoctorAdapter(UUID doctorId);
    List<Appointment> getAppointmentByPatientAdapter(UUID patientId);
    Appointment addAppointmentAdapter(UUID doctorId, UUID patientId, Appointment apm);
    void updateAppointmentAdapter(Appointment appointment);
    void deleteAppointmentAdapter(UUID id);
}
