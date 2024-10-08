package introse.group20.hms.infracstructure.repositories;

import introse.group20.hms.infracstructure.models.VoteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IVoteRepository extends JpaRepository<VoteModel, UUID> {
}
