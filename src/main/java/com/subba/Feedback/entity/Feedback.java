package com.subba.Feedback.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="feedbacks")
public class Feedback {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="feedbackId")
	private Long feedback_Id;
	@Column(name="user_Id")
	private Long userId;
	@Column(name="merchant_Id")
	private Long merchantId;
	@Column(name="rating")
	private int rating;
	@Column(name="review")
	private String review;
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Feedback(Long feedback_Id, Long userId, Long merchantId, int rating, String review) {
		super();
		this.feedback_Id = feedback_Id;
		this.userId = userId;
		this.merchantId = merchantId;
		this.rating = rating;
		this.review = review;
	}

	public Long getFeedback_Id() {
		return feedback_Id;
	}
	public void setFeedback_Id(Long feedback_Id) {
		this.feedback_Id = feedback_Id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	
	
	
}
