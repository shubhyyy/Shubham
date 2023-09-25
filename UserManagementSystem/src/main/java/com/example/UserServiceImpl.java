package com.example.usermanagement.service;

import com.example.usermanagement.ResourceNotFoundException;
import com.example.usermanagement.User;
import com.example.usermanagement.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + userId));
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User updateUserInfo(Long userId, User userUpdate) {
        User existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + userId));

        // Update user attributes here
        existingUser.setUsername(userUpdate.getUsername());
        existingUser.setDateOfBirth(userUpdate.getDateOfBirth());
        existingUser.setEmail(userUpdate.getEmail());
        existingUser.setPhoneNumber(userUpdate.getPhoneNumber());

        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
