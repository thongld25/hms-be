package introse.group20.hms.webapi.DTOs.VoteDTO;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class VoteRequest {
    @NotNull
    private UUID doctorId;
    @Min(value = 1)
    @Max(value = 5)
    private int rating;
    private String content;
}