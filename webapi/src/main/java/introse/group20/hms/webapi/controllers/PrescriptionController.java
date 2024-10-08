package introse.group20.hms.webapi.controllers;

import introse.group20.hms.core.entities.Post;
import introse.group20.hms.webapi.DTOs.PrescriptionDTO.PrescriptionRequest;
import introse.group20.hms.webapi.DTOs.PrescriptionDTO.PrescriptionResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/prescriptions")
@Validated
public class PrescriptionController {

//    @GetMapping("/patient")
//    @Secured({"DOCTOR", "PATIENT"})
        //route: /api/prescriptions
//    public ResponseEntity<List<PrescriptionResponse>> getByPatient(@PathVariable UUID patientId){
//
//    }
//
//    @GetMapping("/{prescriptionId}")
//    @Secured({"DOCTOR", "PATIENT"})
//    public ResponseEntity<PrescriptionResponse> getById(@PathVariable UUID precriptionId){
//
//    }
//
//    @PostMapping("/doctor/{doctorId}")
//    @Secured("DOCTOR")
//    public ResponseEntity<PrescriptionResponse> createPrescription(@PathVariable UUID doctorId, @Valid @RequestBody PrescriptionRequest request){
//
//    }
//
//    @PutMapping("/{presId}")
//    @Secured("DOCTOR")
//    public ResponseEntity<HttpStatus> updatePrescription(@PathVariable UUID presId, @Valid @RequestBody PrescriptionRequest){
//
//    }
//
//    @DeleteMapping("/{presId}")
//    @Secured("DOCTOR")
//    public ResponseEntity<HttpStatus> deletePrescription(@PathVariable UUID presId){
//
//    }

}
