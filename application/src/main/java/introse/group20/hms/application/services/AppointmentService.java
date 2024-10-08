package introse.group20.hms.application.services;

import introse.group20.hms.application.services.interfaces.IAppointmentService;
import introse.group20.hms.core.entities.Appointment;
import introse.group20.hms.core.entities.enums.AppointmentStatus;

import java.util.List;
import java.util.UUID;

public class AppointmentService implements IAppointmentService {
    @Override
    public List<Appointment> getAppointmentByDoctor(UUID doctorId) {
        return null;
    }

    @Override
    public List<Appointment> getAppointmentByPatient(UUID patientId) {
        return null;
    }

    @Override
    public Appointment addAppointment(UUID doctorId, UUID patientId, Appointment apm) {
        return null;
    }

    @Override
    public void updateAppointment(Appointment appointment) {

    }

    @Override
    public void deleteAppointment(UUID id) {

    }
}
