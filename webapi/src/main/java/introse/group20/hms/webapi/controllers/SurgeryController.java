package introse.group20.hms.webapi.controllers;

import introse.group20.hms.application.services.interfaces.ISurgeryService;
import introse.group20.hms.core.entities.Surgery;
import introse.group20.hms.webapi.DTOs.PrescriptionDTO.PrescriptionRequest;
import introse.group20.hms.webapi.DTOs.SurgeryDTO.SurgeryRequest;
import introse.group20.hms.webapi.DTOs.SurgeryDTO.SurgeryResponse;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/surgeries")
public class SurgeryController {
//    @Autowired
//    private ISurgeryService surgeryService;
//    @Autowired
//    private ModelMapper modelMapper;
//    @GetMapping("/")
//    public List<SurgeryResponse> getAll()
//    {
//        List<Surgery> surgeries= surgeryService.getAll();
//        return surgeries.stream()
//                .map(surgery -> modelMapper.map(surgery, SurgeryResponse.class) )
//                .collect(Collectors.toList());
//    }
//
//    @GetMapping("/doctor")
//    @Secured({"DOCTOR", "ADMIN"})
//    // route: /api/surgeries/doctor?doctorId=<id of doctor>
//    public ResponseEntity<List<SurgeryResponse>> getSurgeryForDoctor(@RequestParam UUID doctorId){
//
//    }
//
//    @PostMapping
//    @Secured("ADMIN")
//    public ResponseEntity<SurgeryResponse> addSurgery(@Valid @RequestBody SurgeryRequest){
//
//    }
//
//    @PutMapping("/{surgeryId}")
//    @Secured("ADMIN")
//    public ResponseEntity<HttpStatus> updateSurgery(@PathVariable UUID surgeryId, @Valid @RequestBody SurgeryRequest){
//
//    }
//
//    @DeleteMapping("/{surgeryId}")
//    @Secured("ADMIN")
//    public ResponseEntity<HttpStatus> deleteSurgery(@PathVariable UUID surgeryId){
//
//    }
}
