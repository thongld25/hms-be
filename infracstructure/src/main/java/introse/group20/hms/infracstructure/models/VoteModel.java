package introse.group20.hms.infracstructure.models;


import introse.group20.hms.infracstructure.models.enums.Rating;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.UUID;
@Entity
@Table(name = "votes")
@Data
@NoArgsConstructor
public class VoteModel {
    @Id
    @GeneratedValue
    private UUID id;
    private Rating rating;
    @Column(length = 500)
    private String content;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientModel patient;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorModel doctor;
}
