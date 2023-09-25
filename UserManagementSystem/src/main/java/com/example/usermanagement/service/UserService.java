package com.example.usermanagement.service;

import com.example.usermanagement.User;
import java.util.List;

public interface UserService {
    User addUser(User user);
    User getUser(Long userId);
    List<User> getAllUsers();
    User updateUserInfo(Long userId, User userUpdate);
    void deleteUser(Long userId);
}
