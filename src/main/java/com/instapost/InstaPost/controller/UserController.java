package com.instapost.InstaPost.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instapost.InstaPost.model.User;
import com.instapost.InstaPost.service.UserService;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

//    @PostMapping("/addUser")
//    public User addUser(@RequestBody User user) {
//        return userService.saveUser(user);
//    }

    @GetMapping("/getUser")
    public List<User> findUser() {
        return userService.getUser();
    }

    @GetMapping("/userById/{id}")
    public User findPostById(@PathVariable long id) {
        return userService.getUserById(id);
    }

	
	
	

}
