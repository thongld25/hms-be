package introse.group20.hms.infracstructure.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.Doc;
import java.util.Date;
import java.util.UUID;
@Entity
@Table(name = "surgeries")
@Data
@NoArgsConstructor
public class SurgeryModel {
    @Id
    @GeneratedValue
    private UUID id;
    private Date time;
    private String content;
    private Date expectedTime;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorModel doctor;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientModel patient;
}
