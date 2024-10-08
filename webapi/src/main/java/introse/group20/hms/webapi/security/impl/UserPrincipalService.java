package introse.group20.hms.webapi.security.impl;

import introse.group20.hms.application.adapters.IUserAdapter;
import introse.group20.hms.core.entities.User;
import introse.group20.hms.webapi.DTOs.AuthDTO.UserDTO;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.UUID;

public class UserPrincipalService implements UserDetailsService {
    @Autowired
    IUserAdapter userAdapter;
    @Autowired
    ModelMapper modelMapper;
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userAdapter.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return UserPrincipal.buildFrom(userDTO);
    }

    @Transactional
    public  UserPrincipal loadUserByUserId(UUID id) {
        User user = userAdapter.findByUserId(id)
                .orElseThrow(() -> new UsernameNotFoundException("User with id: " + id + " NOT FOUND"));
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return UserPrincipal.buildFrom(userDTO);
    }
}
