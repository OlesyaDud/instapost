package com.instapost.InstaPost.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.instapost.InstaPost.model.Comment;
import com.instapost.InstaPost.model.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Long>{

	Post save(Comment comment);

}
