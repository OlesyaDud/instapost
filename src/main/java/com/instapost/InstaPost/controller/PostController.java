package com.instapost.InstaPost.controller;

import java.sql.SQLException;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instapost.InstaPost.exceptions.ResourceNotFoundException;
import com.instapost.InstaPost.model.Post;
import com.instapost.InstaPost.repository.PostRepo;
//import com.instapost.InstaPost.service.PostService;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/post")
public class PostController {

//	@Autowired
//	private PostService pServ;
	
//	
//public PostController(PostService pServ) {
//		super();
//		this.pServ = pServ;
//	}

//	@PostMapping
//	public Post saveLoc(@RequestBody Post p) throws SQLException {
//		return pServ.addLoc(p);
//	}
//  

//	get
	
//	@GetMapping
//	public List<Post> findAllPosts() {
//		return pServ.getPost();
//	}
	
//	@GetMapping("/{pId}")
//	public Post findProdById(@PathVariable long pId) {
//		return pServ.findByPostById(pId);
//	}
	
//	put
//	@PutMapping
//	public Post updateProduct(@RequestBody Post p) {
//		return pServ.updatePost(p);
//	}
	
//	delete
//	@DeleteMapping("{pId}")
//	public String deleteProduct(@PathVariable long pId) {
//		return pServ.deletePost(pId);
//	}
	
	
	  @Autowired
	   private PostRepo postRepo;
	  
	  @GetMapping
	    public Page<Post> getAllPosts(Pageable pageable) {
	        return (Page<Post>) postRepo.findAll();
	    }
	  
	   @PostMapping
	    public Post createPost(@Valid @RequestBody Post post) {
	        return postRepo.save(post);
	    }
	  
	   @PutMapping("/{p_id}")
	    public Post updatePost(@PathVariable Long p_id, @Valid @RequestBody Post postRequest) {
		   
	        return postRepo.findById(p_id).map(post -> {
	        	
	            post.setTitle(postRequest.getTitle());
	            post.setDescription(postRequest.getDescription());
	            post.setContent(postRequest.getContent());
	            return postRepo.save(post);
	        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + p_id + " not found"));
	    }
	   
	    @DeleteMapping("/{p_id}")
	    public ResponseEntity<?> deletePost(@PathVariable Long p_id) {
	        return postRepo.findById(p_id).map(post -> {
	            postRepo.delete(post);
	            return ResponseEntity.ok().build();
	        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + p_id + " not found"));
	    }


	
}
