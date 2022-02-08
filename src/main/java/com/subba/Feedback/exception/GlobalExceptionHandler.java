package com.subba.Feedback.exception;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.subba.Feedback.responseentity.ErrorInfo;




@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception ex,HttpServletRequest req) {
	 if(ex instanceof MethodArgumentNotValidException) {	
		 Map<String,String> errors=new HashMap<>();
		 ((MethodArgumentNotValidException) ex).getBindingResult().getAllErrors().forEach(err -> {	 
		 String field= ((FieldError)err).getField();
		 String errMsg= err.getDefaultMessage();
		 errors.put(field,errMsg);
		 });
		 return new ResponseEntity<>(new ErrorInfo(HttpStatus.BAD_REQUEST,HttpStatus.BAD_REQUEST.value(),errors.toString(),req.getRequestURI()),HttpStatus.BAD_REQUEST);
	 }
	 return new ResponseEntity<>(new ErrorInfo(HttpStatus.NOT_FOUND,404,ex.getMessage(),req.getRequestURI()),HttpStatus.NOT_FOUND);
	}

}

