package springmvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")         //localhost:8080/srpingmvc/
	public String main(Model model) {
//		SYNTAX :
//		model.addAttribute(String key , Object value)
		
		
		model.addAttribute("name","Gopal");
		return "index";			//(folder)views/(file)index.jsp
	}
	@RequestMapping("/about")	//localhost:8080/srpingmvc/about
	public String about() {
		return "about";			//(folder)views/(file)about.jsp
	}
	@RequestMapping("/contactus") //localhost:8080/srpingmvc/contactus
	public String contactus(Model model) {
		List<String> contactList = new ArrayList<>();
		contactList.add("123567890");
		contactList.add("123567891");
		contactList.add("123567892");
		contactList.add("123567893");
		contactList.add("123567894");
		contactList.add("123567895");
		contactList.add("123567896");
		model.addAttribute("contactList",contactList);
		return "contactus";		//(folder)views/(file)contactus.jsp
	}
	@RequestMapping("/services") //localhost:8080/srpingmvc/services
	public String services(Model model) {
		List<String> serviceList = new ArrayList<>();
		serviceList.add("Web Dev");
		serviceList.add("Full Stack Dev");
		serviceList.add("Marketing");
		serviceList.add("Designing");
		
		model.addAttribute("serviceList",serviceList);
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
