package introse.group20.hms.application.services.interfaces;

import introse.group20.hms.core.entities.User;
import introse.group20.hms.core.entities.enums.Role;

public interface IUserService {
    User Login(String phoneNumber, String password);


    User addUser(User user);
    boolean updatePassword(String phoneNumber, String oldPassword, String newPassword);
    void SendAccount(String phoneNumber, User userAccount);
}
