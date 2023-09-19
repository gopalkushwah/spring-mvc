package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")         //localhost:8080/srpingmvc/
	public String main() {
		return "index";			//(folder)views/(file)index.jsp
	}
	@RequestMapping("/about")	//localhost:8080/srpingmvc/about
	public String about() {
		return "about";			//(folder)views/(file)about.jsp
	}
	@RequestMapping("/contactus") //localhost:8080/srpingmvc/contactus
	public String contactus() {
		return "contactus";		//(folder)views/(file)contactus.jsp
	}
	@RequestMapping("/services") //localhost:8080/srpingmvc/services
	public String services() {
		return "services";       //(folder)views/(file)services.jsp
	}
	@RequestMapping("/admin/index")   //localhost:8080/srpingmvc/admin/index
	public String admin() {
		return "admin/adminindex";   //(folder)admin/(file)adminindex.jsp
	}
	
	@RequestMapping("/admin/about") //localhost:8080/srpingmvc/admin/about
	public String adminAbout() {
		return "admin/about";   //(folder)admin/(file)adminindex.jsp
	}
	
}
