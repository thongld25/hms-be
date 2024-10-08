package introse.group20.hms.webapi.DTOs.DepartmentDTO;

import lombok.Data;

import java.util.UUID;

@Data
public class DepartmentResponse {
    private UUID id;
    private String name;
}