package introse.group20.hms.webapi.DTOs.PostDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Data
public class PostRequest {
    @NotNull
    private UUID categoryId;
    @NotBlank
    private String title;
    @NotBlank
    private String content;
    @NotBlank
    private String summary;
    private MultipartFile cover;
    private String coverContent;
}