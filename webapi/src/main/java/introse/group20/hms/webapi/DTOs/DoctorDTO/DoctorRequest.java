package introse.group20.hms.webapi.DTOs.DoctorDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.UUID;
@Data
public class DoctorRequest {
    @NotNull
    private UUID departmentId;
    @NotBlank
    private String name;
    @NotBlank
    private String address;
    @NotNull
    private Date birthday;
    @NotBlank
    private String phoneNumber;
    @NotBlank
    private String gender;
    private MultipartFile image;
}
