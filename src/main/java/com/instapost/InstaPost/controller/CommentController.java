 package com.instapost.InstaPost.controller;

import java.sql.SQLException;
import java.util.List;


import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.instapost.InstaPost.model.Comment;
import com.instapost.InstaPost.model.Post;
import com.instapost.InstaPost.repository.CommentRepo;
import com.instapost.InstaPost.service.CommentService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	private CommentService commentService;


	@Autowired
	public CommentController(CommentService commentService) {
		super();
		this.commentService = commentService;
	}

//get
	@GetMapping
	public List<Comment> findComments() {
		return commentService.getComments();
	}

//post
	@PostMapping
	public Comment postComment(@RequestBody Comment c) throws SQLException  {
		return commentService.saveComment(c);
	}
	
//	put
	@PutMapping
	public Comment updateComment(@RequestBody Comment c) {
		return commentService.updateComment(c);
	}
	
//	delete
	@DeleteMapping("{cId}")
	public String deleteComment(@PathVariable long cId) {
		return commentService.deleteComment(cId);
	}


}
