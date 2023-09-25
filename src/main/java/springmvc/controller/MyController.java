package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@RequestMapping("/home")
	public String home1() {
		return "senduser";
	}
	
	@RequestMapping(path = "/welcome",method=RequestMethod.GET)
	public String welocome(@RequestParam("user") String user,Model m) {
		m.addAttribute("user", user);
		System.out.println(user);
		return "welcome";
	}
}
