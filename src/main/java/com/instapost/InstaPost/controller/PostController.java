package com.instapost.InstaPost.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.instapost.InstaPost.model.Post;
import com.instapost.InstaPost.model.User;
import com.instapost.InstaPost.service.PostService;
import com.instapost.InstaPost.service.UserService;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostService postService;

	@Autowired
	public PostController(PostService postService) {
		super();
		this.postService = postService;
	}

	@GetMapping("/getPosts")
	public List<Post> findPost() {
		return postService.getPosts();
	}

	@GetMapping("/postById/{id}")
	public Post findPostById(@PathVariable long id) {
		return postService.getPostById(id);
	}

	
}
