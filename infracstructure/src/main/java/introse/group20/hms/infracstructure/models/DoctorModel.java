package introse.group20.hms.infracstructure.models;

import introse.group20.hms.infracstructure.models.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "doctors")
@Data
@NoArgsConstructor
public class DoctorModel {
    @Id
    private UUID id;
    private String name;
    private String address;
    private Date birthday;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String image;
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<VoteModel> votes;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentModel department;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private UserModel user;
}
