package introse.group20.hms.webapi.DTOs.AppointmentDTO;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;
import java.util.UUID;
@Data
public class AppointmentRequest {
    @NotNull(message = "doctorId can not be null")
    private UUID doctorId;
    @NotNull(message = "Date can not be null")
    private Date time;
    private  String note;
}
