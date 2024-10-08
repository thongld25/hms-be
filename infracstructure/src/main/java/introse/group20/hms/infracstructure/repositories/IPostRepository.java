package introse.group20.hms.infracstructure.repositories;

import introse.group20.hms.infracstructure.models.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IPostRepository extends JpaRepository<PostModel, UUID> {
}
