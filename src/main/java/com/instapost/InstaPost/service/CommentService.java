package com.instapost.InstaPost.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.instapost.InstaPost.model.Comment;

import com.instapost.InstaPost.repository.CommentRepo;

@Service
public class CommentService {

	@Autowired
	CommentRepo commentRepo;

	
//  get
	public List<Comment> getComments() {
		return (List<Comment>) commentRepo.findAll();
	}

//	 post
	public Comment saveComment(Comment c) throws  SQLException {
		
		if(c == null) {
    		throw new SQLException();
    	}
		
		c.setId(c.getId());
		
		Comment result = commentRepo.save(c);
		
		return result;

//		return commentRepo.save(c);
	}
	

//update
	public Comment updateComment(Comment c) {
		Comment exCom = commentRepo.findById(c.getId()).orElse(null);
		exCom.setText(c.getText());
		return commentRepo.save(exCom);
	}

// delete 
	public String deleteComment(long cId) {
		commentRepo.deleteById(cId);
		return null;
	}
	
	
}
