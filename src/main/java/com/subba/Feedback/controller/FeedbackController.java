package com.subba.Feedback.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.subba.Feedback.dto.FeedbackDto;
import com.subba.Feedback.entity.Feedback;
import com.subba.Feedback.exception.IdNotFoundException;
import com.subba.Feedback.mapper.FeedbackMapper;
import com.subba.Feedback.responseentity.SuccessInfo;
import com.subba.Feedback.service.IFeedbackService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*", allowedHeaders = "*")
//@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/feedback")
@Api(value="FeedbackController",description="for providing Feedback details")
public class FeedbackController {
	
	@Autowired
	private IFeedbackService feedbackService;
	

	
	@ApiOperation("To provide Feedback")
	@PostMapping("/")
	public ResponseEntity<SuccessInfo> saveFeedback(@RequestBody @Valid FeedbackDto feedbackDto)
	{
		String str= feedbackService.saveFeedback(FeedbackMapper.toEntity(feedbackDto));
		
		return new ResponseEntity<>(new SuccessInfo(HttpStatus.CREATED,HttpStatus.CREATED.value(),str),HttpStatus.CREATED);
		
	}
	
	@ApiOperation("To retrieve all Feedbacks")
	@GetMapping("/")
	public List<Feedback> getFeedbacks()
	{
		return feedbackService.getAllFeedbacks();
	}
	
	@ApiOperation("To retrieve Feedback by Id")
	@GetMapping("id/{id}")
	public Feedback getFeedbackById(@PathVariable("id") Long feedbackId)
	{
		return feedbackService.getFeedbackById(feedbackId);
		
	}
	
	@ApiOperation("Delete Feedback by Id")
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<SuccessInfo>  deleteFeedbackById(@PathVariable("id") Long feedbackId)
	{
		String str= feedbackService.deleteFeedbackById(feedbackId);
		return new ResponseEntity<>(new SuccessInfo(HttpStatus.ACCEPTED,200,str),HttpStatus.ACCEPTED);
	}
	
	@ApiOperation("To update Feedback by Id")
	@PutMapping("update/{id}")
	public ResponseEntity<SuccessInfo>  updateFeedbackById(@PathVariable("id") Long feedbackId, @Valid @RequestBody FeedbackDto feedbackDto)
	{
		
		String str= feedbackService.updateFeedbackById(feedbackId,FeedbackMapper.toEntity(feedbackDto));
		
		return new ResponseEntity<>(new SuccessInfo(HttpStatus.ACCEPTED,200,str),HttpStatus.ACCEPTED);
	}
	
	@ApiOperation("To retrieve all Feedbacks by User Id")
	@GetMapping("user/{id}")
	public List<Feedback> getFeedbackByUserId(@PathVariable("id") Long userId)
	{
		return feedbackService.getFeedbackByUserId(userId);
	}
	
	@ApiOperation("To retrieve all Feedbacks by Merchant Id")
	@GetMapping("merchant/{id}")
	public List<Feedback> getFeedbackByMerchantId(@PathVariable("id") Long merchantId)
	{
		return feedbackService.getFeedbackBymerchantId(merchantId);
	}

}
