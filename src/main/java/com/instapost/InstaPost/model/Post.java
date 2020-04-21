package com.instapost.InstaPost.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Post {

	@Id
	private Long p_id;

	private String imageUrl;

	@Column(insertable = false, updatable = false)
	private Long u_id;
	

	@ManyToOne
	@JoinColumn(name = "u_id")
	private User user;

	@OneToMany
	private List<Comment> commentsList;

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(Long p_id, String imageUrl, Long u_id, User user, List<Comment> commentsList) {
		super();
		this.p_id = p_id;
		this.imageUrl = imageUrl;
		this.u_id = u_id;
		this.user = user;
		this.commentsList = commentsList;
	}

	public Post(Long p_id, String imageUrl, Long u_id) {
		super();
		this.p_id = p_id;
		this.imageUrl = imageUrl;
		this.u_id = u_id;
	}

	@Override
	public String toString() {
		return "Post [p_id=" + p_id + ", imageUrl=" + imageUrl + ", u_id=" + u_id + "]";
	}

	public Long getP_id() {
		return p_id;
	}

	public void setP_id(Long p_id) {
		this.p_id = p_id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Long getU_id() {
		return u_id;
	}

	public void setU_id(Long u_id) {
		this.u_id = u_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Comment> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<Comment> commentsList) {
		this.commentsList = commentsList;
	}
	
	
	


	
	

}

