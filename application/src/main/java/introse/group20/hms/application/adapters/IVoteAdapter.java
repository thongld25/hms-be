package introse.group20.hms.application.adapters;

import introse.group20.hms.core.entities.Vote;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IVoteAdapter {
    List<Vote> getDoctorVoteAdapter(UUID doctorId);
    Optional<Vote> getByIdAdapter(UUID voteId);
    Vote addVoteAdapter(UUID patientId, UUID doctorId, Vote vote);
    void updateVoteAdapter(Vote vote);
    void deleteVoteAdapter(UUID voteId);
}
