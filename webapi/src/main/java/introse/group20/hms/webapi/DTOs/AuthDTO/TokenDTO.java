package introse.group20.hms.webapi.DTOs.AuthDTO;

import lombok.Data;

@Data
public class TokenDTO {
    private String accessToken;
    private String refreshToken;
    private String Role;
}
