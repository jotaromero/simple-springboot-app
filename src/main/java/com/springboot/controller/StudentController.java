package com.springboot.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exception.InvalidFieldException;
import com.springboot.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	@PostMapping
	public String saveStudentInformation(@RequestHeader("student-auth-key") String authorization, @RequestBody Student student) {
		if (StringUtils.isBlank(student.getLastName())) {
			throw new InvalidFieldException("Last Name is a required field and you should know");
		}

		// jotaromero: added method 1 from NgDP 
		log.info(method1fromNgDP());		
		
		// jotaromero: added method 2 from NgDP (new super important logic!)
		log.info(method2fromNgDP());	

		return String.format("Authorization %s is valid, and Data is saved", authorization);
	}
	
	private String method1fromNgDP(){
		return "Logic from method NgDP";
	}
	
	private String method2fromNgDP(){
		return "Logic from method NgDP";
	}
}








