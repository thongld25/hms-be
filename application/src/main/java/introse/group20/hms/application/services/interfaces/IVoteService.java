package introse.group20.hms.application.services.interfaces;

import introse.group20.hms.core.entities.Vote;

import java.util.List;
import java.util.UUID;

public interface IVoteService {
    List<Vote> getDoctorVote(UUID doctorId);
    Vote getById(UUID voteId);
    Vote addVote(UUID patientId, UUID doctorId, Vote vote);
    void updateVote(Vote vote);
    void deleteVote(UUID voteId);
}
