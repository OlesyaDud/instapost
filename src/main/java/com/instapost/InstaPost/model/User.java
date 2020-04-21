package com.instapost.InstaPost.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class User implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long u_id;

	@Column(nullable = false)
	private String u_name;
	
	 @OneToMany(mappedBy = "user")
	 private List<Post> posts;

	public Long getU_id() {
		return u_id;
	}

	public void setU_id(Long u_id) {
		this.u_id = u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long u_id, String u_name) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + "]";
	}
	 
	 
	 
	

}
