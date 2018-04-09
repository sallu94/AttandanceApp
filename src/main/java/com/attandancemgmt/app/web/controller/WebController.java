package com.attandancemgmt.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
