package com.instapost.InstaPost.model;



import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
public class Post extends AuditModel {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="p_id")
	private Long id;
	
//	@Column(name = "user_id")
//    private Integer userId;
	
	@Column
	private String imageUrl;

	@Column
	@Size(max = 250)
    private String description;
	 
    @Column
    @Size(max = 100)
    private String title;
	

    
	 @ManyToOne(targetEntity = User.class, cascade= CascadeType.ALL, fetch = FetchType.LAZY)  
	 @JoinColumn(name = "u_id") //declares foreign key column 
	 private User user;

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(Long id, String imageUrl, @Size(max = 250) String description, @Size(max = 100) String title,
			 User user) {
		super();
		this.id = id;
		this.imageUrl = imageUrl;
		this.description = description;
		this.title = title;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", imageUrl=" + imageUrl + ", description=" + description + ", title=" + title
				+ ", content="+ ", user=" + user + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	 




}

