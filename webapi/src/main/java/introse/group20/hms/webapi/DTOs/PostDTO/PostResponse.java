package introse.group20.hms.webapi.DTOs.PostDTO;

import lombok.Data;

import java.util.UUID;

@Data
public class PostResponse {
    private UUID doctorId;
    private String doctorName;
    private UUID id;
    private String title;
    private String content;
    private String summary;
    private String cover;
    private String coverContent;
    private UUID categoryId;
    private String category;
}
