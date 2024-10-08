package introse.group20.hms.webapi.DTOs.PrescriptionDTO;

import introse.group20.hms.webapi.DTOs.MedicineDTO.MedicineResponse;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class PrescriptionResponse {
    private UUID id;
    private UUID doctorId;
    private String doctorName;
    private UUID patientId;
    private String patientName;
    private Date createdDay;
    private String note;
    private List<MedicineResponse> medicines;
}