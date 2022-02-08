package com.subba.Feedback.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;
public class FeedbackDto {
	private Long feedback_Id;
	@NotNull(message="USER_ID SHOULD NOT BE NULL")
	private Long userId;
	@NotNull(message="MERCHANT_ID SHOULD NOT BE NULL")
	private Long merchantId;
	@Range(min=1,max=5,message="RATING SHOULD BE BETWEEN 1 & 5")
	private int rating;
	@NotBlank(message="REVIEW SHOULD NOT BE BLANK")
	private String review;
	public FeedbackDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedbackDto(Long feedback_Id, Long userId, Long merchantId, int rating, String review) {
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
