package com.instapost.InstaPost.repository;

import org.springframework.stereotype.Repository;

import com.instapost.InstaPost.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {


}
