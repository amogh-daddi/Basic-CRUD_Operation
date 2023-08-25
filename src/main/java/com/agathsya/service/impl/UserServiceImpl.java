package com.agathsya.service.impl;

import com.agathsya.model.User;
import com.agathsya.repository.UserRepository;
import com.agathsya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> saveUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).orElseThrow(null);
    }

    @Override
    public User getUserByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).orElseThrow(null);
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        return userRepository.save(existingUser);
    }

    @Override
    public String deleteUser(long id) {
        userRepository.deleteById(id);
        return "User Removed "+id;
    }

    @Override
    public List<User> getAllByFirstName(String firstName) {
        return userRepository.findAllByFirstName(firstName);
    }
}
