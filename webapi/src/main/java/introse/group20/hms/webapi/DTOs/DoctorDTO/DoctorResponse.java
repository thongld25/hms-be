package introse.group20.hms.webapi.DTOs.DoctorDTO;

import lombok.Data;

import java.util.Date;
import java.util.UUID;
@Data
public class DoctorResponse {
    private UUID departmentId;
    private String departmentName;
    private UUID id;
    private String name;
    private String address;
    private Date birthday;
    private String phoneNumber;
    private String gender;
    private String image;
    private float rating;
}
