package com.prakash.messaging.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String message;
	
	private Integer likeCount;
	
	private Integer dislikeCount;
	
	@ManyToOne
	private User postedBy;
	
	@Column(name = "creationDate", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	
	@Column(name = "lastUpdationDate", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdationDate;
	
	
	public Integer getId() {
	    return id;
	}

	public void setId(Integer id) {
	    this.id = id;
	}
	
	public String getMessage() {
	    return message;
	}

	public void setMessage(String messageText) {
	    this.message = messageText;
	}
	
	public Integer getLikeCount() {
		return likeCount;
	}
	
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}
	
	public Integer getDislikeCount() {
		return dislikeCount;
	}
	
	public void setDislikeCount(Integer dislikeCount) {
		this.dislikeCount = dislikeCount;
	}
	
	public User getPostedBy() {
		return postedBy;
	}
	
	public void setPostedBy(User postedBy) {
		this.postedBy = postedBy;
	}
	
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public Date getCreationDate() {
		return this.creationDate;
	}
	
	public void setLastUpdationDate(Date lastUpdationDate) {
		this.lastUpdationDate = lastUpdationDate;
	}
	
	public Date getLastUpdationDate() {
		return this.lastUpdationDate;
	}
}