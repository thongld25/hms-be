package introse.group20.hms.webapi.DTOs.PatientDTO;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class PatientResponse {
    private UUID id;
    private String name;
    private String address;
    private Date birthday;
    private String job;
    private String phoneNumber;
    private String nation;
    private String gender;
}
