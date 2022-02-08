package com.subba.Feedback.service;

import java.util.List;



import com.subba.Feedback.entity.Feedback;


public interface IFeedbackService {


	public String saveFeedback(Feedback feedback);

	public List<Feedback> getAllFeedbacks();

	public Feedback getFeedbackById(Long feedbackId);

	public String deleteFeedbackById(Long feedbackId);

	public String updateFeedbackById(Long feedbackId, Feedback feedback);

	public List<Feedback> getFeedbackByUserId(Long userId);

	public List<Feedback> getFeedbackBymerchantId(Long merchantId);

}
