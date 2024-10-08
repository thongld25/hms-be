package introse.group20.hms.application.adapters;

import introse.group20.hms.core.entities.User;

import java.util.Optional;
import java.util.UUID;

public interface IUserAdapter {
    Optional<User> findByUserId(UUID id);
    Optional<User> findByUsername(String username);
    User addUserAdapter(User user);
    boolean updatePasswordAdapter(String phoneNumber, String oldPassword, String newPassword);
    void SendAccountAdapter(String phoneNumber, User userAccount);
}