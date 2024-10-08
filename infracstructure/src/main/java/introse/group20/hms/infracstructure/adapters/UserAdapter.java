package introse.group20.hms.infracstructure.adapters;

import introse.group20.hms.application.adapters.IUserAdapter;
import introse.group20.hms.core.entities.User;
import introse.group20.hms.infracstructure.models.UserModel;
import introse.group20.hms.infracstructure.repositories.IUserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;
@Component
public class UserAdapter implements IUserAdapter {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public User addUserAdapter(User user) {
        UserModel userModel = modelMapper.map(user, UserModel.class);
        UserModel createdUser = userRepository.save(userModel);
        return modelMapper.map(createdUser, User.class);
    }

    @Override
    public boolean updatePasswordAdapter(String phoneNumber, String oldPassword, String newPassword) {
        return false;
    }

    @Override
    public void SendAccountAdapter(String phoneNumber, User userAccount) {

    }

    @Override
    public Optional<User> findByUserId(UUID id) {
         return  userRepository.findById(id)
                 .map(userModel -> modelMapper.map(userModel, User.class));
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username)
                .map(userModel -> modelMapper.map(userModel, User.class));
    }

//    @Override
//    public Optional<User> LoginAdapter(String phoneNumber, String password) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<User> addUserAdapter(User user) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean updatePasswordAdapter(String phoneNumber, String oldPassword, String newPassword) {
//        return false;
//    }
//
//    @Override
//    public void SendAccountAdapter(String phoneNumber, User userAccount) {
//
//    }
}
