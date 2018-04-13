package com.attendancemgmt.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.attendancemgmt.app.model.persistance.dao.StudentRepository;
import com.attendancemgmt.app.model.persistance.dto.Gender;


@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class WebController {

	@Autowired
	private StudentRepository studentRepository;
	

	@GetMapping("/frm")
	public String form() {
		return "sample";
	}

	
	
	
	@GetMapping("/addStudentDetailsForm")
	public String addStudentDetails() {
		return "addStudentDetailsForm";
	}

	
	@GetMapping("/loginGet")
	public String loginGet() {
		return "login";
	}
	
	

	@GetMapping("/startAttendance")
	public ModelAndView startAttendance() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("card");
//		ArrayList<Student> arrayList =  studentRepository.findStudentByCourseOfStudent("MCA");
//		modelAndView.addObject(arrayList );
		return modelAndView;
	}
	
	@GetMapping("/menu")
	public String lo() {
		return "menu";
	}
	
	@ModelAttribute(value = "gender")
	public Gender[] getAccountBranch() {
		return Gender.values();
	}
	
	
}
