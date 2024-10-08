package introse.group20.hms.webapi.controllers;

import introse.group20.hms.application.services.interfaces.IPatientService;
import introse.group20.hms.core.entities.Patient;
import introse.group20.hms.core.entities.User;
import introse.group20.hms.core.entities.enums.Gender;
import introse.group20.hms.webapi.DTOs.AuthDTO.UserDTO;
import introse.group20.hms.webapi.DTOs.PatientDTO.PatientRequest;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    @Autowired
    private IPatientService patientService;
    @Autowired
    private ModelMapper modelMapper;
    @RequestMapping(method = POST, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    @Secured("DOCTOR")
    @Transactional
    public ResponseEntity<UserDTO> createDoctor(@Valid @ModelAttribute PatientRequest patientRequest)  {
        Patient patient = new Patient();
        modelMapper.map(patientRequest, patient);
        patient.setGender(Gender.valueOf(patientRequest.getGender()));
        User user = patientService.addPatient(patient);
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return new ResponseEntity<UserDTO>(userDTO, HttpStatus.CREATED);
    }
}
