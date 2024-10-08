package introse.group20.hms.webapi.DTOs.PrescriptionDTO;

import introse.group20.hms.webapi.DTOs.MedicineDTO.MedicineRequest;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class PrescriptionRequest {
    @NotNull
    private UUID patientId;
    @NotNull
    private Date createdDay;
    private String note;
    @NotNull
    private List<MedicineRequest> medicines;
}
