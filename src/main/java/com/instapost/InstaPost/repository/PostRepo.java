package com.instapost.InstaPost.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.instapost.InstaPost.model.Post;

@Repository
public interface PostRepo extends CrudRepository<Post, Long>{

}
