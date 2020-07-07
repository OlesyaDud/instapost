package com.instapost.InstaPost.dto;

import com.instapost.InstaPost.model.Comment;
import com.instapost.InstaPost.model.Post;
import com.instapost.InstaPost.model.User;

public class UserComment {
	
	private Comment comment;  //from here we can extract list of comments / posts
	
	private Post post;
	
	private User user;

	public UserComment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserComment(Comment comment, Post post) {
		super();
		this.comment = comment;
		this.post = post;
	}
	
	public UserComment(Comment comment) {
		super();
		this.comment = comment;
	}
	
	public UserComment(Post post) {
		super();
		this.post = post;
	}



	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "UserComment [user=" + user + "]";
	}

	public UserComment(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	

}
