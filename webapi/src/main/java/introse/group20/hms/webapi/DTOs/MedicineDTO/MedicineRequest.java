package introse.group20.hms.webapi.DTOs.MedicineDTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MedicineRequest {
    @NotBlank
    private String name;
    @Min(value = 1)
    private int quantity;
    private int breakfast;
    private int lunch;
    private int dinner;
    private boolean beforeBreakfast;
    private boolean beforeLunch;
    private boolean beforeDinner;
}
