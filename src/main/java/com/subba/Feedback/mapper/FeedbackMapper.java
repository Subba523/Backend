package com.subba.Feedback.mapper;

import com.subba.Feedback.dto.FeedbackDto;
import com.subba.Feedback.entity.Feedback;

public class FeedbackMapper {

	public static Feedback toEntity(FeedbackDto feedbackDto)
	{
		Feedback feedback=new Feedback();
		feedback.setUserId(feedbackDto.getUserId());
		feedback.setMerchantId(feedbackDto.getMerchantId());
		feedback.setRating(feedbackDto.getRating());
		feedback.setReview(feedbackDto.getReview());
		return feedback;
	}
}
