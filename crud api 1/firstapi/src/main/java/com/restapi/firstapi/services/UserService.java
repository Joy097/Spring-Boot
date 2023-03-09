package com.restapi.firstapi.services;

import java.util.List;

import com.restapi.firstapi.model.User;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    List<User> getAllUsers();
    User getUserById(long uid);
    void deleteUser(long uidDel);
    
}
