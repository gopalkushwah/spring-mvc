package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

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
	@RequestMapping("/admin")   //localhost:8080/srpingmvc/home/admin/index
	public String admin() {
		return "admin/adminindex";   //(folder)admin/(file)adminindex.jsp
	}
	
	@RequestMapping("/admin/about") //localhost:8080/srpingmvc/home/admin/about
	public String adminAbout() {
		return "admin/about";   //(folder)admin/(file)adminindex.jsp
	}
	
}
