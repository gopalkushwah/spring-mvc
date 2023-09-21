package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/home") //localhost:8080/srpingmvc/home/
public class HomeController {

	@RequestMapping(path="/")         //localhost:8080/srpingmvc/home/
	public String main() {
		return "index";			
	}
	@RequestMapping("/about")	//localhost:8080/srpingmvc/home/about
	public String about() {
		return "about";			//(folder)views/(file)about.jsp
	}
	@RequestMapping("/contactus") //localhost:8080/srpingmvc/home/contactus
	public String contactus() {
		return "contactus";		
	}
	@RequestMapping("/services") //localhost:8080/srpingmvc/home/services
	public String services() {
		return "services";       
	}
	
	
}
