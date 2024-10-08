package introse.group20.hms.infracstructure.models;


import introse.group20.hms.infracstructure.models.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;
@Entity
@Data
@Table(name = "patients")
@NoArgsConstructor
public class PatientModel {
    @Id
    private UUID id;
    private String name;
    private String address;
    private Date birthday;
    private String job;
    private String phoneNumber;
    private String nation;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private UserModel user;
}
