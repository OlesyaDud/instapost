package com.instapost.InstaPost.model;

import java.io.Serializable;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.annotations.Cascade;

@Entity
public class User implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 2, max =14)
	@Column(nullable = false)
	private String uName;
	
	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 4, max = 20)
	@Column(nullable = false, unique = true)
	private String email;
	
	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 4, max = 14)
	@Column(name="password", nullable = false, unique = true)
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String uName, String email, String password) {
		super();
		this.id = id;
		this.uName = uName;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uName=" + uName + ", email=" + email + ", password=" + password + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
//	 @OneToMany(targetEntity = Post.class)
//	 @JoinColumn(name="user_posts", referencedColumnName="user_id")
//	 private List<Post> posts;
//
//	 @OneToMany(targetEntity = Comment.class)
//	 @JoinColumn(name="user_comments", referencedColumnName="user_id")
//	 private List<Comment> comments;

	

	 
}
