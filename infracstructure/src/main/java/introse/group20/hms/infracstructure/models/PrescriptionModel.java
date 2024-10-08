package introse.group20.hms.infracstructure.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;
@Entity
@Data
@Table(name = "prescriptions")
@NoArgsConstructor
public class PrescriptionModel {
    @Id
    @GeneratedValue
    private UUID id;
    private Date createdDay;
    @Column(length = 500)
    private String note;
    @OneToMany(mappedBy = "prescription", cascade = CascadeType.ALL)
    private List<MedicineModel> medicines;
}
