package introse.group20.hms.infracstructure.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;
@Entity
@Data
@Table(name = "messages")
@NoArgsConstructor
public class MessageModel {
    @Id
    @GeneratedValue
    private UUID id;
    private Date time;
    @Column(length = 500)
    private String content;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientModel patient;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorModel doctor;
}
