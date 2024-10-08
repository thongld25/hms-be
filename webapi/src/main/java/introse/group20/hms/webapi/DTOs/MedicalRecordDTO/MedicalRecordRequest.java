package introse.group20.hms.webapi.DTOs.MedicalRecordDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class MedicalRecordRequest {
    @NotNull
    private UUID patientId;
    @NotNull
    private UUID departmentId;
    @NotBlank
    private String BHYTCode;
    @NotNull
    private Date inDay;
    @NotNull
    private Date outDay;
    @NotBlank
    private String inDayDiagnose;
    @NotBlank
    private String outDayDiagnose;
    @NotBlank
    private String medicalHistory;
    @NotBlank
    private String diseaseProgress;
    @NotBlank
    private String testResults;
    @NotBlank
    private String hospitalDischargeStatus;
    @NotBlank
    @Pattern(regexp = "^(STAY|NOT_STAY|DAYTIME_STAY)$")
    private String stayType;
    private String note;
}
