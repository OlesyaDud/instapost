package com.instapost.InstaPost.repository;

import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instapost.InstaPost.model.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long>{

	Page<Comment> findByPostId(Long p_id, Pageable pageable);

	Optional<Comment> findByIdAndPostId(Long c_id, Long p_id);

}
