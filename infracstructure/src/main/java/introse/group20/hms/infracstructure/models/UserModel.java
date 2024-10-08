package introse.group20.hms.infracstructure.models;




import introse.group20.hms.infracstructure.models.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserModel {
    @Id
    private UUID id;
    @Column(unique = true)
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    public UserModel(String username, String password, Role role)
    {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private DoctorModel doctor;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private PatientModel patient;
}
