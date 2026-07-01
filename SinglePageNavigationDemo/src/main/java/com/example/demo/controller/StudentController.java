package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StudentController {
	
	@GetMapping("/student")
	public String getData(Model model) {
		model.addAttribute("title", "Student Details");
		model.addAttribute("name", "Ayush Pratap Singh");
		model.addAttribute("course", "B. Tech. Computer Science & Engineering");
		model.addAttribute("semester", "7th semester");
		model.addAttribute("college", "Lovely Professional University");
		return "dashboard";
	}
	
}
