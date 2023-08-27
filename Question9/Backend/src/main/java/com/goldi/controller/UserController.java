package com.goldi.controller;

import com.goldi.model.User;
import com.goldi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUserHandler(@RequestBody User user){
        String msg = userService.registerUser(user);
        System.out.println(user);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUserHandler(@RequestBody User user){
        String msg = userService.loginUser(user);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

}
