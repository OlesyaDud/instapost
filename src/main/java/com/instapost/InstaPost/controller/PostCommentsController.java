package com.instapost.InstaPost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instapost.InstaPost.dto.UserComment;
import com.instapost.InstaPost.model.Comment;
import com.instapost.InstaPost.model.Post;
import com.instapost.InstaPost.model.User;
import com.instapost.InstaPost.repository.CommentRepo;
import com.instapost.InstaPost.repository.PostRepo;
//import com.instapost.InstaPost.service.CommentService;
import com.instapost.InstaPost.repository.UserRepo;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/posts")
public class PostCommentsController {
	
	@Autowired
	private UserRepo uRepo;
	@Autowired
	private CommentRepo cRepo;
	@Autowired
	private PostRepo pRepo;
	
	@PostMapping("/postComment")
	public Post postCommentToPost(@RequestBody UserComment uc) {
		return pRepo.save(uc.getComment());
	}
	
//	@GetMapping("/findAllUserComments")
//	public List<User> findAllUserComments() {
//		return uRepo.findAll();
//	}
	
	
	


}
