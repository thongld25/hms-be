package introse.group20.hms.webapi.controllers;

import introse.group20.hms.webapi.DTOs.MedicalRecordDTO.MedicalRecordRequest;
import introse.group20.hms.webapi.DTOs.MedicalRecordDTO.MedicalRecordResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/medical_records")
public class MedicalRecordController {
//    @GetMapping
//    @Secured({"DOCTOR", "PATIENT"})
//    //route: /api/medical_records?patientId=<id of patient>
//    public ResponseEntity<List<MedicalRecordResponse>> getByPatientId(@RequestParam UUID patientID){
//
//    }

//    @GetMapping(value = "/{id}", name = "getById")
//    @Secured({"DOCTOR", "PATIENT"})
//    public ResponseEntity<MedicalRecordResponse> getById(@PathVariable UUID id){
//
//    }
//
//    @PostMapping
//    @Secured("DOCTOR")
//    public ResponseEntity<MedicalRecordResponse> createMedicalRecord(@Valid @RequestBody MedicalRecordRequest request){
//
//    }

//    @PutMapping("/{medicalRecordId}")
//    @Secured("DOCTOR")
//    public ResponseEntity<HttpStatus> updateMedicalRecord(@PathVariable UUID medicalRecordId, @Valid @RequestBody MedicalRecordRequest request){
//
//    }
//
//    @DeleteMapping("{id}")
//    @Secured("DOCTOR")
//    public ResponseEntity<HttpStatus> deleteMedicalRecord(@PathVariable UUID id){
//
//    }
}
