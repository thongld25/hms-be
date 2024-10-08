package introse.group20.hms.webapi.DTOs.MedicineDTO;

import lombok.Data;

import java.util.UUID;

@Data
public class MedicineResponse {
    private UUID id;
    private UUID prescriptionId;
    private String name;
    private int quantity;
    private int breakfast;
    private int lunch;
    private int dinner;
    private boolean beforeBreakfast;
    private boolean beforeLunch;
    private boolean beforeDinner;
}