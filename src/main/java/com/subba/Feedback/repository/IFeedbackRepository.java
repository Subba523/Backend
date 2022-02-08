package com.subba.Feedback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subba.Feedback.entity.Feedback;

@Repository("feedbackRepository")
public interface IFeedbackRepository extends JpaRepository<Feedback, Long>
{
 public List<Feedback> findFeedbackByUserId(Long feedbackId);
 public List<Feedback> findFeedbackBymerchantId(Long merchantId);
}
