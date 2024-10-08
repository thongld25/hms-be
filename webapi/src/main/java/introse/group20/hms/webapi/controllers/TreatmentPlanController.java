package introse.group20.hms.webapi.controllers;

import introse.group20.hms.application.services.interfaces.ITreatmentPlanService;
import introse.group20.hms.core.entities.TreatmentPlan;
import introse.group20.hms.core.exceptions.BadRequestException;
import introse.group20.hms.webapi.DTOs.TreatmentPlanDTO.TreatmentPlanRequest;
import introse.group20.hms.webapi.DTOs.TreatmentPlanDTO.TreatmentPlanResponse;
import introse.group20.hms.webapi.utils.AuthExtensions;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/treatment_plans")
@Validated
public class TreatmentPlanController {
    @Autowired
    private ITreatmentPlanService treatmentPlanService;
    @Autowired
    private ModelMapper modelMapper;
    @GetMapping("/patient")
    @Secured({"DOCTOR", "PATIENT"})
    //route: /api/treatment_plans/patient?patientId=<if of patient>
    public ResponseEntity<List<TreatmentPlanResponse>> getForPatient(@RequestParam UUID patientId){
        List<TreatmentPlan> treatmentPlans = treatmentPlanService.getForUser(patientId);
        List<TreatmentPlanResponse> treatmentPlanResponses = treatmentPlans.stream()
                .map(treatmentPlan -> modelMapper.map(treatmentPlan, TreatmentPlanResponse.class))
                .collect(Collectors.toList());
        return new ResponseEntity<List<TreatmentPlanResponse>>(treatmentPlanResponses, HttpStatus.OK);
    }

//    @GetMapping("/{id}")
//    @Secured({"DOCTOR", "PATIENT"})
//    public ResponseEntity<TreatmentPlanResponse> getById(@PathVariable UUID id){
//
//    }
//
    @PostMapping
    @Secured("DOCTOR")
    public ResponseEntity<HttpStatus> createTreatmentPlan(@Valid @RequestBody TreatmentPlanRequest request) throws BadRequestException {
        UUID doctorId = AuthExtensions.GetUserIdFromContext(SecurityContextHolder.getContext());
        TreatmentPlan treatmentPlan = modelMapper.map(request, TreatmentPlan.class);
        treatmentPlanService.createTreatmentPlan(request.getPatientId(), doctorId, treatmentPlan);
        return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
    }

//    @PutMapping("/{id}")
//    @Secured("DOCTOR")
//    public ResponseEntity<HttpStatus> updateTreatmentPlan(@PathVariable UUID id, @Valid @RequestBody TreatmentPlanRequest){
//
//    }
//
//    @DeleteMapping("/{id}")
//    @Secured("DOCTOR")
//    public ResponseEntity<HttpStatus> deleteTreatmentPlan(@PathVariable UUID id){
//
//    }
}
