package introse.group20.hms.webapi.DTOs.PatientDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.Date;

@Data
public class PatientRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String address;
    @NotNull
    private Date birthday;
    @NotBlank
    private String job;
    @NotBlank
    private String phoneNumber;
    @NotBlank
    private String nation;
    @NotBlank
    @Pattern(regexp = "^(MALE|FEMALE)$")
    private String gender;
}
