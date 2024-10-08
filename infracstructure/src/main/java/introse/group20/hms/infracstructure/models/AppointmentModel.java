package introse.group20.hms.infracstructure.models;




import introse.group20.hms.infracstructure.models.enums.AppointmentStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;
@Entity
@Table(name= "appointments")
@Data
@NoArgsConstructor
public class AppointmentModel {
    @Id
    @GeneratedValue
    private UUID id;
    private Date time;
    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;
    @Column(length = 500)
    private String note;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientModel patient;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorModel doctor;
}
