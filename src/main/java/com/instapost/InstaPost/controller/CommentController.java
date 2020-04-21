 package com.instapost.InstaPost.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instapost.InstaPost.model.Comment;
import com.instapost.InstaPost.service.CommentService;


@RestController
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	private CommentService commentService;

	@Autowired
	public CommentController(CommentService commentService) {
		super();
		this.commentService = commentService;
	}


	@GetMapping("/getComments")
	public List<Comment> findComment() {
		return commentService.getComments();
	}


	@GetMapping("/commentById/{id}")
	public Comment findCommentById(@PathVariable long id) {
		return commentService.getCommentById(id);
	}



}
