package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageController {
	@GetMapping("/image1")
	public String image1(Model model) {
		model.addAttribute("image1", "Image 1");
		return "dashboard";
	}

	@GetMapping("/image2")
	public String image2(Model model) {
		model.addAttribute("image2", "Image 2");

		return "dashboard";
	}

	@GetMapping("/image3")
public String image3(Model model) {
		model.addAttribute("image3", "Image 3");
		return "dashboard";
	}
}
