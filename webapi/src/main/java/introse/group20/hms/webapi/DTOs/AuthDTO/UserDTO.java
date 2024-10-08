package introse.group20.hms.webapi.DTOs.AuthDTO;

import introse.group20.hms.core.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserDTO {
    private UUID id;
    private String username;
    private String password;
    private Role role;
    public UserDTO(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
}
