package introse.group20.hms.application.services.interfaces;


import introse.group20.hms.core.entities.Message;

import java.util.List;
import java.util.UUID;

public interface IMessageService {
    List<Message> getConversation(UUID patientId, UUID doctorId);
    Message SendMessage(UUID doctorId, UUID patientId, Message message);
    Message getLatestMessage(UUID doctorId, UUID patientId);
}
