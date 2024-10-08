package introse.group20.hms.webapi.DTOs.AppointmentDTO;

import introse.group20.hms.webapi.DTOs.enums.AppointmentStatus;

import java.util.Date;
import java.util.UUID;

public class AppointmentResponse {
    private UUID id;
    private UUID doctorId;
    private UUID patientId;
    private String doctorName;
    private String patientName;
    private Date time;
    private AppointmentStatus status;
    private  String note;
}
