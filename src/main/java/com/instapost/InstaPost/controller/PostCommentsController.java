package com.instapost.InstaPost.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instapost.InstaPost.exceptions.ResourceNotFoundException;
import com.instapost.InstaPost.model.Comment;
import com.instapost.InstaPost.repository.CommentRepo;
import com.instapost.InstaPost.repository.PostRepo;
//import com.instapost.InstaPost.service.CommentService;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/posts")
public class PostCommentsController {
	
	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired 
	private PostRepo postRepo;
	
//	----------------------- comments by post
    @GetMapping("/{p_id}/comments")
    public Page<Comment> getAllCommentsByPostId(@PathVariable (value = "p_id") Long p_id,
                                                Pageable pageable) {
        return commentRepo.findByPostId(p_id, pageable);
    }
    
    @PostMapping("/{p_id}/comments")
    public Comment createComment(@PathVariable (value = "p_id") Long p_id,
                                 @Valid @RequestBody Comment comment) {
        return postRepo.findById(p_id).map(post -> {
            comment.setPost(post);
            return commentRepo.save(comment);
        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + p_id + " not found"));
    }
    
    @DeleteMapping("/{p_id}/comments/{commentId}")
    public ResponseEntity<?> deleteComment(@PathVariable (value = "p_id") Long p_id,
                              @PathVariable (value = "c_id") Long c_id) {
        return commentRepo.findByIdAndPostId(c_id, p_id).map(comment -> {
            commentRepo.delete(comment);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Comment not found with id " + c_id + " and postId " + p_id));
    }


}
