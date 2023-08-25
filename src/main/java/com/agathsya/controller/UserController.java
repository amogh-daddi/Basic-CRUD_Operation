package com.agathsya.controller;

import com.agathsya.model.User;
import com.agathsya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users){
        return userService.saveUsers(users);
    }

    @GetMapping("/findAllUsers")
    public List<User> findAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("/getUser/{id}")
    public User findUserById(@PathVariable long id){
        return userService.getUserById(id);
    }

    @GetMapping("/user/{firstName}")
    public User findUserByFirstName(@PathVariable String firstName){
        return userService.getUserByFirstName(firstName);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id){
        return userService.deleteUser(id);
    }

    @GetMapping("/users/{firstName}")
    public List<User> findAllByFirstNAme(@PathVariable String firstName){
        return userService.getAllByFirstName(firstName);
    }
}
