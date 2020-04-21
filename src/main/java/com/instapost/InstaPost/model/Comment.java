package com.instapost.InstaPost.model;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;



@Entity
public class Comment implements Serializable {

   
	private static final long serialVersionUID = 1L;
	
	@Id
    private Long comment_id;
	
	@Length(min = 3, max = 250)
    private String text;
    
	@Column(insertable = false, updatable = false)
    private Long  p_id;
	
	@Column(insertable = false, updatable = false)
    private Long u_id;
    
//    @ManyToOne
//    @JoinColumn(name ="u_id")
//    private User sender;
	
	@ManyToOne
	private User user;

    @ManyToOne
//    @JoinColumn(name ="p_id")
    private Post post;
    
    

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(String text, Post post) {
		super();
		this.text = text;
		this.post = post;
	}

	public Long getComment_id() {
		return comment_id;
	}

	public void setComment_id(Long comment_id) {
		this.comment_id = comment_id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Comments [comment_id=" + comment_id + ", text=" + text + "]";
	}

	
    

    
}
