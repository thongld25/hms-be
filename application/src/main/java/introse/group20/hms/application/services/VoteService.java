package introse.group20.hms.application.services;

import introse.group20.hms.application.services.interfaces.IVoteService;
import introse.group20.hms.core.entities.Vote;

import java.util.List;
import java.util.UUID;

public class VoteService implements IVoteService {
    @Override
    public List<Vote> getDoctorVote(UUID doctorId) {
        return null;
    }

    @Override
    public Vote getById(UUID voteId) {
        return null;
    }

    @Override
    public Vote addVote(UUID patientId, UUID doctorId, Vote vote) {
        return null;
    }

    @Override
    public void updateVote(Vote vote) {

    }

    @Override
    public void deleteVote(UUID voteId) {


    }
}
