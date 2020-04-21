package com.instapost.InstaPost.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instapost.InstaPost.model.User;
import com.instapost.InstaPost.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

// post

//
//	    public User saveUser(User user) {
//	        return (User) userRepo.save(user);
//	    }

	//	    get
	public List<User> getUser() {
		return (List<User>) userRepo.findAll();
	}

	public User getUserById(long id) {
		return userRepo.findById(id).orElse(null);
	}
}
