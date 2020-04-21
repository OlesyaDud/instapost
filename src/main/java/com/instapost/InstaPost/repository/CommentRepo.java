package com.instapost.InstaPost.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.instapost.InstaPost.model.Comment;

@Repository
public interface CommentRepo extends CrudRepository<Comment, Long>{

}
