package com.instapost.InstaPost.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.instapost.InstaPost.model.Comment;
import com.instapost.InstaPost.model.User;
import com.instapost.InstaPost.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
//	  @Autowired
//	  private PasswordEncoder passwordEncoder;
	

// post
	public User saveUser(User user) throws SQLException {
		if (user == null) {
			throw new SQLException();
		}
		user.setId(user.getId());

		User result = userRepo.save(user);
		return result;
	}


//	 get
	public List<User> getUser() {
		return (List<User>) userRepo.findAll();
	}

	public User getUserById(long id) {
		return userRepo.findById(id).orElse(null);
	}


	public User updateUser(User u) {
		User exUser = userRepo.findById(u.getId()).orElse(null);
		exUser.setEmail(u.getEmail());
		exUser.setPassword(u.getPassword());
		exUser.setuName(u.getuName());
		return userRepo.save(exUser);
	}


	public String deleteUser(long id) {
		userRepo.deleteById(id);
		return "user removed! " + id;
	}
}
