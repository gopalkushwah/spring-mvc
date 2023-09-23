package com.springmvcpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispatcherController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	@RequestMapping("/services")
	public String services() {
		return "services";
	}
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	@RequestMapping("/save-student")
	public String saveStudent() {
		return "save-student";
	}
	@RequestMapping("/show-student")
	public String showStudent() {
		return "show-student";
	}
}
