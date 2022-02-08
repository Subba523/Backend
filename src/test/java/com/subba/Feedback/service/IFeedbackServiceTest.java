package com.subba.Feedback.service;

/*import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.subba.Feedback.entity.Feedback;
import com.subba.Feedback.exception.IdNotFoundException;
import com.subba.Feedback.repository.IFeedbackRepository;

@SpringBootTest
class IFeedbackServiceTest {
	
	@Autowired
	private IFeedbackService feedbackService;
	
@MockBean
	IFeedbackRepository feedbackRepository;

	@BeforeEach
	void setUp() throws Exception {
		Optional<Feedback> feedback=Optional.of(new Feedback(101L,1L,61L,4,"Good"));
		//Feedback feedback=new Feedback(101L,1L,61L,4,"Good");
		Mockito.when(feedbackRepository.findById(101L)).thenReturn(feedback);
		Feedback feedback2=new Feedback(102L,1L,61L,4,"Good");
		Feedback feedback3=new Feedback(103L,1L,61L,4,"Good");
		Mockito.when(feedbackRepository.save(feedback2)).thenReturn(feedback2);
		List<Feedback> list=new ArrayList();
		list.add(feedback2);
		list.add(feedback3);
		Mockito.when(feedbackRepository.findAll()).thenReturn(list);
		Mockito.when(feedbackRepository.findFeedbackByUserId(1L)).thenReturn(list);
		Mockito.when(feedbackRepository.findFeedbackBymerchantId(61L)).thenReturn(list);
		
	}

	@Test
	void testSaveFeedback() {
		//fail("Not yet implemented");
		Feedback feedback=new Feedback(101L,1L,61L,4,"Good");
		String found= feedbackService.saveFeedback(feedback);
		assertEquals(found,"feedback Submitted Successfully");
	}

	@Test
	void testGetAllFeedbacks() {
		//fail("Not yet implemented");
		assertEquals(2,feedbackService.getAllFeedbacks().size());
	}

	@Test
	void testGetFeedbackById() {
		
		Long feedbackId=101L;
		Feedback found=(Feedback) feedbackService.getFeedbackById(feedbackId);
		assertEquals(feedbackId,found.getFeedback_Id());
	}

	@Test
	void testDeleteFeedbackById() {
		//fail("Not yet implemented");
		Feedback feedback=new Feedback(17L,1L,61L,4,"Good");
		String found= feedbackService.deleteFeedbackById(10112L);
		assertEquals(found,"Deleted Successfully");
		
		
	}

	@Test
	void testUpdateFeedbackById() {
		//fail("Not yet implemented");
		Feedback feedback=new Feedback(101L,1L,61L,4,"Good");
		String found= feedbackService.updateFeedbackById(101L, feedback);
		assertEquals(found,"Feedback Updated Successfully");
		//assertThrows(IdNotFoundException.class,()->feedbackService.updateFeedbackById(1L, feedback));
	}

	@Test
	void testGetFeedbackByUserId() {
		//fail("Not yet implemented");
		assertEquals(2,feedbackService.getFeedbackByUserId(1L).size());
		
	}

	@Test
	void testGetFeedbackBymerchantId() {
		//fail("Not yet implemented");
		assertEquals(2,feedbackService.getFeedbackBymerchantId(61L).size());
	}
	
	@Test
	void testGetFeedbackByIdException() {
		//fail("Not yet implemented");
		assertThrows(IdNotFoundException.class,()->feedbackService.getFeedbackById(11L));
	}
	
	void testGetFeedbackByUserIdexception() {
		assertThrows(IdNotFoundException.class,()->feedbackService.getFeedbackByUserId(444L));
		
	}
	
	@Test
	void testGetFeedbackBymerchantIdException() {
		//fail("Not yet implemented");
		assertThrows(IdNotFoundException.class,()->feedbackService.getFeedbackBymerchantId(44L));
	}
	@Test
	void testUpdateFeedbackByIdException() {
		Feedback feedback=new Feedback(11L,1L,61L,4,"Good");
		String found= feedbackService.updateFeedbackById(101L, feedback);
		assertThrows(IdNotFoundException.class,()->feedbackService.updateFeedbackById(1L, feedback));
	}

}*/
