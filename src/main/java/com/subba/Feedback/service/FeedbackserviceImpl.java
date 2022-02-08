package com.subba.Feedback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subba.Feedback.entity.Feedback;
import com.subba.Feedback.exception.IdNotFoundException;
import com.subba.Feedback.repository.IFeedbackRepository;

@Service("feedbackservice")
public class FeedbackserviceImpl implements IFeedbackService {

	@Autowired
	private IFeedbackRepository feedbackRepository;
	

	@Override
	public String saveFeedback(Feedback feedback) {
		
		 feedbackRepository.save(feedback);
		 return "feedback Submitted Successfully";
	}

	@Override
	public List<Feedback> getAllFeedbacks() {
		// TODO Auto-generated method stub
		return feedbackRepository.findAll();
	}

	@Override
	public Feedback getFeedbackById(Long feedbackId) {
		
		try {
			return feedbackRepository.findById(feedbackId).get();
			
		}
		catch(RuntimeException ex)
		{
			throw new IdNotFoundException("Feedback not found for given Id :"+feedbackId);
		}
		
	}

	@Override
	public String deleteFeedbackById(Long feedbackId) {
		try {
			feedbackRepository.deleteById(feedbackId);
			return "Deleted Successfully";
		}
		catch(RuntimeException ex)
		{
			throw new IdNotFoundException("Feedback not found for given Id :"+feedbackId);
		}
		
	}

	@Override
	public String updateFeedbackById(Long feedbackId,Feedback feedback) {
		
		 
		 try {
			 Feedback updatedFeedback=feedbackRepository.findById(feedbackId).get();
				updatedFeedback.setUserId(feedback.getUserId());
				updatedFeedback.setMerchantId(feedback.getMerchantId());
				updatedFeedback.setRating(feedback.getRating());
				updatedFeedback.setReview(feedback.getReview());
				 feedbackRepository.save(updatedFeedback);
				 return "Feedback Updated Successfully";
			}
			catch(RuntimeException ex)
			{
				throw new IdNotFoundException("Feedback not found for given Id :"+feedbackId);
			}
		
	}

	@Override
	public List<Feedback> getFeedbackByUserId(Long userId) {
	
		if(feedbackRepository.findFeedbackByUserId(userId).isEmpty())
		{
			throw new IdNotFoundException("Feedback not found for given UserId :"+userId);
		}
		else
			return feedbackRepository.findFeedbackByUserId(userId);
			
		
	}

	@Override
	public List<Feedback> getFeedbackBymerchantId(Long merchantId) {
		
		
		
		if(feedbackRepository.findFeedbackBymerchantId(merchantId).isEmpty())
		{
			throw new IdNotFoundException("Feedback not found for given MerchantId :"+merchantId);
		}
		else
			return feedbackRepository.findFeedbackBymerchantId(merchantId);
	}

}
