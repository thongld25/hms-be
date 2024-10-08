package introse.group20.hms.webapi.DTOs.SurgeryDTO;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class SurgeryResponse {
    private UUID id;
    private UUID doctorId;
    private String doctorName;
    private UUID patientId;
    private String patientName;
    private Date time;
    private String content;
    private Date expectedTime;
}
