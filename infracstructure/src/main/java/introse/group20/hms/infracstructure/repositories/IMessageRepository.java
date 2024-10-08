package introse.group20.hms.infracstructure.repositories;

import introse.group20.hms.infracstructure.models.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IMessageRepository extends JpaRepository<MessageModel, UUID> {
}
