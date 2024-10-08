package introse.group20.hms.webapi.DTOs.MessageDTO;

import java.util.Date;
import java.util.UUID;
import lombok.Data;

@Data
public class MessageReponse {
    private UUID id;
    private UUID doctorId;
    private String doctorName;
    private String patientName;
    private UUID patientId;
    private Date time;
    private String content;
}
