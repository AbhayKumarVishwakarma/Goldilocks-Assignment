package com.goldi.service;

import com.goldi.exception.UserException;
import com.goldi.model.User;

import java.util.List;

public interface UserService {

    public String registerUser(User user) throws UserException;
    public String loginUser(User user) throws UserException;
}
