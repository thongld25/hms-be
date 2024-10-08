package introse.group20.hms.application.services;

import introse.group20.hms.application.adapters.IUserAdapter;
import introse.group20.hms.application.services.interfaces.IUserService;
import introse.group20.hms.core.entities.User;

public class UserService implements IUserService {
    private IUserAdapter userAdapter;
    public UserService(IUserAdapter userAdapter)
    {
        this.userAdapter = userAdapter;
    }
    @Override
    public User Login(String phoneNumber, String password) {
        return null;
    }


    @Override
    public User addUser(User user) {
        userAdapter.addUserAdapter(user);
        return user;
    }

    @Override
    public boolean updatePassword(String phoneNumber, String oldPassword, String newPassword) {
        return false;
    }

    @Override
    public void SendAccount(String phoneNumber, User userAccount) {

    }

//    @Override
//    public boolean updatePassword(String phoneNumber, String oldPassword, String newPassword) {
//        return false;
//    }
//
//    @Override
//    public void SendAccount(String phoneNumber, User userAccount) {
//
//    }
}
