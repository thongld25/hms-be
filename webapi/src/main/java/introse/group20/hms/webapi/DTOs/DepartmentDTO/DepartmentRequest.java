package introse.group20.hms.webapi.DTOs.DepartmentDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class DepartmentRequest {
    @NotBlank(message = "department name can not be blank")
    @Size(max = 255)
    private String name;
}