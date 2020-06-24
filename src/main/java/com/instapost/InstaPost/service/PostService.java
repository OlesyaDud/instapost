package com.instapost.InstaPost.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instapost.InstaPost.model.Post;
import com.instapost.InstaPost.repository.PostRepo;

@Service
public class PostService {

	@Autowired
	PostRepo postRepo;

	
    public Post addLoc(Post p) throws  SQLException  {
    	
    	if(p == null) {
    		throw new SQLException();
    	}
		p.setTitle(p.getTitle());
		
		Post result = postRepo.save(p);
		return result;
    	
    }
	
//	GET
	public List<Post> getPost() {
		return(List<Post>) postRepo.findAll();
	}
	
	public Post findByPostById(long pId) {
		return postRepo.findById(pId).orElse(null);
	}
	
// DELETE
	public String deletePost(long pId) {
		postRepo.deleteById(pId);
		return "post removed! " + pId;
	}
	
//	Update
	public Post updatePost(Post p) {
		Post existingP = postRepo.findById(p.getId()).orElse(null);
		existingP.setId(p.getId());
		return postRepo.save(existingP);
		
	}
	




}
