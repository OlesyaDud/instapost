package com.instapost.InstaPost.repository;

import org.springframework.stereotype.Repository;

import com.instapost.InstaPost.model.User;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

}
