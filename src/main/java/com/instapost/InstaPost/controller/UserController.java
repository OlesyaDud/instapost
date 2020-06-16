package com.instapost.InstaPost.controller;

import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.instapost.InstaPost.model.Comment;
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

    @PostMapping
    public User addUser(@RequestBody User user) throws SQLException {
        return userService.saveUser(user);
    }
    
   
    @GetMapping
    public List<User> findUser() {
        return userService.getUser();
    }

    @GetMapping("/{id}")
    public User findPostById(@PathVariable long id) {
        return userService.getUserById(id);
    }
    
//	put
	@PutMapping
	public User updateUser(@RequestBody User u) {
		return userService.updateUser(u);
	}
	
//	delete
	@DeleteMapping("{id}")
	public String deleteUser(@PathVariable long id) {
		return userService.deleteUser(id);
	}


	
	
	

}
