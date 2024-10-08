package introse.group20.hms.infracstructure.models;

import introse.group20.hms.core.entities.Prescription;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;


import java.util.UUID;
@Entity
@Table(name = "medicines")
@Data
@NoArgsConstructor
public class MedicineModel {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @Column(columnDefinition = "INT")
    private int quantity;

    @Column(columnDefinition = "INT")
    private int breakfast;

    @Column(columnDefinition = "INT")
    private int lunch;

    @Column(columnDefinition = "INT")
    private int dinner;

    private boolean beforeBreakfast;
    private boolean beforeLunch;
    private boolean beforeDinner;
    @ManyToOne
    @JoinColumn(name = "prescription_id")
    private PrescriptionModel prescription;
}
