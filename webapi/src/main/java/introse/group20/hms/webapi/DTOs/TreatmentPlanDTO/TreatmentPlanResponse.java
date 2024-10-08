package introse.group20.hms.webapi.DTOs.TreatmentPlanDTO;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class TreatmentPlanResponse {
    private UUID id;
    private UUID doctorId;
    private String doctorName;
    private UUID patientId;
    private String patientName;
    private String treatmentMethod;
    private Date lastExaminationDay;
    private Date nextExpectedExaminationDay;
    private String note;
}