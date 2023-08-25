package com.agathsya.service;

import com.agathsya.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> saveUsers(List<User> users);

    List<User> getUsers();

    User getUserById(long id);

    User getUserByFirstName(String firstName);

    User updateUser(User user);

    String deleteUser(long id);

    List<User> getAllByFirstName(String firstName);
}
