package introse.group20.hms.webapi.controllers;

import introse.group20.hms.application.services.interfaces.IDoctorService;
import introse.group20.hms.application.services.interfaces.IUserService;
import introse.group20.hms.application.services.uploads.IUploadService;
import introse.group20.hms.core.entities.Doctor;
import introse.group20.hms.core.entities.User;
import introse.group20.hms.core.entities.enums.Gender;
import introse.group20.hms.core.entities.enums.Role;
import introse.group20.hms.core.exceptions.BadRequestException;
import introse.group20.hms.core.exceptions.NotFoundException;
import introse.group20.hms.webapi.DTOs.AuthDTO.UserDTO;
import introse.group20.hms.webapi.DTOs.DoctorDTO.DoctorRequest;
import introse.group20.hms.webapi.DTOs.DoctorDTO.DoctorResponse;
import introse.group20.hms.webapi.DTOs.constants.DefaultImage;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@Validated
public class DoctorController {
    @Autowired
    private IDoctorService doctorService;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private IUploadService uploadService;
    @Autowired
    private IUserService userService;
    @Autowired
    private PasswordEncoder encoder;
    @RequestMapping(path = "/api/doctors/", method = POST, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    @Secured("ADMIN")
    @Transactional
    public ResponseEntity<UserDTO> createDoctor(@Valid  @ModelAttribute DoctorRequest doctorRequest) throws IOException, BadRequestException {
        String url;
        if (doctorRequest.getImage().isEmpty())
        {
            url = Gender.valueOf(doctorRequest.getGender()) == Gender.MALE ? DefaultImage.MALE : DefaultImage.FEMALE;
        }
        else url = uploadService.upload(doctorRequest.getImage().getBytes(), doctorRequest.getImage().getOriginalFilename(), "avatars");
        Doctor doctor = new Doctor();
        doctor.setImage(url);
        doctor.setGender(Gender.valueOf(doctorRequest.getGender()));
        modelMapper.map(doctorRequest, doctor);
        User user = doctorService.addDoctor(doctorRequest.getDepartmentId(), doctor);
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return new ResponseEntity<UserDTO>(userDTO, HttpStatus.CREATED);
    }
    @GetMapping("/doctors")
    public ResponseEntity<List<DoctorResponse>> getDoctors()
    {
        List<Doctor> doctors = doctorService.getAll();
        List<DoctorResponse> doctorDTOS = doctors.stream()
            .map(doctor -> modelMapper.map(doctor, DoctorResponse.class))
            .collect(Collectors.toList());
        return new ResponseEntity<List<DoctorResponse>>(doctorDTOS,HttpStatus.OK);

    }
    @GetMapping("/doctors/{doctorId}")
    public ResponseEntity<DoctorResponse> getDoctor(@PathVariable UUID doctorId) throws NotFoundException {
        Doctor doctor = doctorService.getById(doctorId);
        DoctorResponse doctorResponse = modelMapper.map(doctor, DoctorResponse.class);
        return new ResponseEntity<DoctorResponse>(doctorResponse, HttpStatus.OK);
    }
    @GetMapping("/doctors/byDepartment")
    public ResponseEntity<List<DoctorResponse>> getDoctorByDepartment(@RequestParam UUID departmentId)
    {
        List<Doctor> doctors = doctorService.getByDepartment(departmentId);
        List<DoctorResponse> doctorResponses = doctors.stream()
                .map(doctor -> modelMapper.map(doctor, DoctorResponse.class))
                .collect(Collectors.toList());
        return new ResponseEntity<List<DoctorResponse>>(doctorResponses, HttpStatus.OK);
    }
    @DeleteMapping("/api/doctors/{doctorId}")
    @Secured("ADMIN")
    public ResponseEntity<HttpStatus> deleteDoctor(@PathVariable UUID doctorId)
    {
        doctorService.deleteDoctor(doctorId);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }
    @PutMapping("/api/doctors/{doctorId}")
    @Secured("ADMIN")
    public ResponseEntity<HttpStatus> updateDoctor(@PathVariable UUID doctorId,@Valid @RequestBody DoctorRequest doctorRequest)
    {
        Doctor doctor = modelMapper.map(doctorRequest, Doctor.class);
        doctor.setId(doctorId);
        doctorService.updateDoctor(doctor);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }
}
