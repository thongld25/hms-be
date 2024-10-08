package introse.group20.hms.webapi.controllers;

import introse.group20.hms.core.entities.Prescription;
import introse.group20.hms.core.entities.Vote;
import introse.group20.hms.webapi.DTOs.VoteDTO.VoteRequest;
import introse.group20.hms.webapi.DTOs.VoteDTO.VoteResponse;
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
@RequestMapping("/api/votes")
@Validated
public class VoteController {

//    @GetMapping("/doctor")
//    //route: /api/votes/doctor?doctorId=<id of doctor>
//    public ResponseEntity<List<VoteResponse>> getDoctorVotes(@RequestParam UUID doctorId){
//
//    }

//    @GetMapping("/{voteId}")
//    public ResponseEntity<VoteResponse> getById(@PathVariable UUID voteId){
//
//    }
//
//    @PostMapping
//    @Secured("PATIENT")
//    public ResponseEntity<VoteResponse> addVote(@Valid @RequestBody VoteRequest voteRequest){
//
//    }

//    @PutMapping("/{voteId}")
//    @Secured("PATIENT")
//    public ResponseEntity<HttpStatus> updateVote(@Valid @RequestBody VoteRequest voteRequest){
//
//    }
//
//    @DeleteMapping("/{voteId}")
//    @Secured("PATIENT")
//    public ResponseEntity<HttpStatus> deleteVote(@PathVariable UUID voteId){
//
//    }
}
