package com.goldi.service;

import com.goldi.exception.UserException;
import com.goldi.model.User;
import com.goldi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public String registerUser(User user) throws UserException {
        if(user.getUsername() == null || user.getPassword() == null) throw new UserException("Invalid input!");

        User registeredUsername = userRepository.findByUsername(user.getUsername());
        if(registeredUsername != null) throw new UserException("Username already registered!");

        User registeredEmail = userRepository.findByEmail(user.getEmail());
        if(registeredEmail != null) throw new UserException("Email already registered!");

        System.out.println("saving");
        userRepository.save(user);
        System.out.println("saved");
        return "User registered successfully!";
    }

    @Override
    public String loginUser(User user) throws UserException {
        if(user.getUsername() == null || user.getPassword() == null) throw new UserException("Invalid input!");

        User registeredUser = userRepository.findByUsername(user.getUsername());
        if(registeredUser == null) throw new UserException("Invalid credential");

        if(!user.getPassword().equals(registeredUser.getPassword())) throw new UserException("Wrong password!");

        return "Login successfully!";
    }
}
