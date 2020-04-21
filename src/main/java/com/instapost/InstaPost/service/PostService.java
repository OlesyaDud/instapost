package com.instapost.InstaPost.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instapost.InstaPost.model.Post;
import com.instapost.InstaPost.repository.PostRepo;

@Service
public class PostService {

	@Autowired
	PostRepo postRepo;

// post


	public Post savePost(Post post) {
		return (Post) postRepo.save(post);
	}

	//	    get
	public List<Post> getPosts() {
		return (List<Post>) postRepo.findAll();
	}

	public Post getPostById(long id) {
		return postRepo.findById(id).orElse(null);
	}



}
