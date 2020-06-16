package com.instapost.InstaPost.model;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Comment extends AuditModel implements Serializable {

   
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Length(min = 3, max = 250)
    private String text;
    
//	@Column(name = "come_id")
//    private Integer Id;
	
	 @ManyToOne(targetEntity = Post.class, fetch = FetchType.LAZY)  //comment has many to one relationship with Post --1 post - many comments
	 @JoinColumn(name = "post_id") //declares foreign key column 
	 @OnDelete(action = OnDeleteAction.CASCADE)
	 private Post post;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(Long id, @Length(min = 3, max = 250) String text, Post post) {
		super();
		this.id = id;
		this.text = text;
		this.post = post;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", text=" + text + ", post=" + post + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}


	
}


