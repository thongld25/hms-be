package introse.group20.hms.webapi.DTOs.MessageDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class MessageRequest {
    @NotNull
    private UUID doctorId;
    @NotNull
    private UUID patientId;
    @NotNull
    private Date time;
    @NotBlank
    private String content;
}