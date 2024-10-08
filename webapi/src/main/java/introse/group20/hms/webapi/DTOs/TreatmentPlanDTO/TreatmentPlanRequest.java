package introse.group20.hms.webapi.DTOs.TreatmentPlanDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class TreatmentPlanRequest {
    @NotNull
    private UUID patientId;
    @NotBlank
    private String treatmentMethod;
    @NotNull
    private Date lastExaminationDay;
    @NotNull
    private Date nextExpectedExaminationDay;
    private String note;
}
