package com.arkadias.html5.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.ResourceAccessException;

@Controller
public class ExceptionController {

	
	/*
	 * A test of @ExceptionHandler
	 * 
	 * Not related to the HTML5 Spring Roo Thymeleaf Demo
	 */
	
	@ExceptionHandler
	public @ResponseBody String genericExceptionHandler(Exception e) {
		return "Exception: " + e.getClass() + " Caused by: " + e.getMessage();
	}

	@ExceptionHandler
	public @ResponseBody String iseExceptionHandler(IllegalStateException e) {
		return "IllegalStateException handled!";
	}
	
	@RequestMapping("/iseException")
	public @ResponseBody String iseException() {
		throw new IllegalStateException("Testing ISE...");
	}

	@RequestMapping("/raeException")
	public @ResponseBody String exception() {
		throw new ResourceAccessException("Testing RAE...");
	}

}
