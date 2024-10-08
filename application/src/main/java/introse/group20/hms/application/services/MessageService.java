package introse.group20.hms.application.services;

import introse.group20.hms.application.services.interfaces.IMessageService;
import introse.group20.hms.core.entities.Message;

import java.util.List;
import java.util.UUID;

public class MessageService implements IMessageService {
    @Override
    public List<Message> getConversation(UUID patientId, UUID doctorId) {
        return null;
    }

    @Override
    public Message SendMessage(UUID doctorId, UUID patientId, Message message) {
        return null;
    }

    @Override
    public Message getLatestMessage(UUID doctorId, UUID patientId) {
        return null;
    }
}
