package introse.group20.hms.infracstructure.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;
@Entity
@Table(name = "treatment_plans")
@Data
@NoArgsConstructor
public class TreatmentPlanModel {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(length = 500)
    private String treatmentMethod;
    private Date lastExaminationDay;
    private Date nextExpectedExaminationDay;
    @Column(length = 500)
    private String note;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientModel patient;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorModel doctor;
}
