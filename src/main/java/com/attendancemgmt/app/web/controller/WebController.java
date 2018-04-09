package com.attendancemgmt.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.attendancemgmt.app.model.persistance.dto.Gender;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class WebController {

	@GetMapping("/addStudentDetailsForm")
	public String addStudentDetails() {
		return "addStudentDetailsForm";
	}

	
	@GetMapping("/loginGet")
	public String loginGet() {
		return "login";
	}
	
	@ModelAttribute(value = "gender")
	public Gender[] getAccountBranch() {
		return Gender.values();
	}
	
	
}
