package introse.group20.hms.webapi.DTOs.VoteDTO;

import lombok.Data;

import java.util.UUID;

@Data
public class VoteResponse {
    private UUID id;
    private UUID patientId;
    private String patientName;
    private int rating;
    private String content;
}