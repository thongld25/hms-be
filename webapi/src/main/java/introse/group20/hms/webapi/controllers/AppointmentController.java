package introse.group20.hms.webapi.controllers;

import introse.group20.hms.application.services.interfaces.IAppointmentService;
import introse.group20.hms.webapi.DTOs.AppointmentDTO.AppointmentRequest;
import introse.group20.hms.webapi.DTOs.AppointmentDTO.AppointmentResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/appointments")
@Validated
public class AppointmentController {
//    @GetMapping(value = "/doctor", name = "getForDoctor")
//    @Secured("DOCTOR")
//    //route" /api/appointments/doctor
//    public ResponseEntity<List<AppointmentResponse>> getAppointmentsOfDoctor(){
//
//    }

//    @GetMapping(value = "/patient", name = "getForPatient")
//    @Secured("PATIENT")
//        //route" /api/appointments/patient
//    public ResponseEntity<List<AppointmentResponse>> getAppointmentsOfPatient(){
//
//    }
//
//    @PostMapping("/")
//    @Secured("PATIENT")
//    public ResponseEntity<HttpStatus> createAppointment(@Valid @RequestBody AppointmentRequest appointmentRequest){
//
//    }
//
//    @PutMapping("/{appointmentId}")
//    @Secured({"DOCTOR", "PATIENT"})
//    public ResponseEntity<HttpStatus> updateAppointment(@PathVariable UUID appointmentId, @Valid @RequestBody AppointmentRequest){
//
//    }
//
//    @DeleteMapping("/{appointmentId}")
//    @Secured({"PATIENT"})
//    public ResponseEntity<HttpStatus> deleteAppointment(@PathVariable UUID appointmentId){
//
//    }
}
