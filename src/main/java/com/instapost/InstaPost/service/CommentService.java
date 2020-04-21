package com.instapost.InstaPost.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instapost.InstaPost.model.Comment;
import com.instapost.InstaPost.repository.CommentRepo;

@Service
public class CommentService {

	@Autowired
	CommentRepo commentRepo;

	public Comment savePost(Comment comment) {
		return (Comment) commentRepo.save(comment);
	}

	//    get
	public List<Comment> getComments() {
		return (List<Comment>) commentRepo.findAll();
	}

	public Comment getCommentById(long id) {
		return commentRepo.findById(id).orElse(null);
	}

	
}
