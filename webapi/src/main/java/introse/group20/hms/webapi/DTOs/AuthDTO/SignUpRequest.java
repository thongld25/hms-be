package introse.group20.hms.webapi.DTOs.AuthDTO;

import lombok.Data;

@Data
public class SignUpRequest {
    private String username;
    private String role;
}
