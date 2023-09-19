package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")         //localhost:8080/srpingmvc/
	public ModelAndView main() {
//		SYNTAX :
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject(String key , Object value)
		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name","Gopal");
		modelAndView.setViewName("index");   //(folder)views/(file)index.jsp
		return modelAndView;			
	}
	@RequestMapping("/about")	//localhost:8080/srpingmvc/about
	public String about() {
		return "about";			//(folder)views/(file)about.jsp
	}
	@RequestMapping("/contactus") //localhost:8080/srpingmvc/contactus
	public ModelAndView contactus() {
		ModelAndView modelAndView = new ModelAndView();
		List<String> contactList = new ArrayList<>();
		contactList.add("123567890");
		contactList.add("123567891");
		contactList.add("123567892");
		contactList.add("123567893");
		contactList.add("123567894");
		contactList.add("123567895");
		contactList.add("123567896");
		modelAndView.addObject("contactList",contactList);
		modelAndView.setViewName("contactus");   //(folder)views/(file)contactus.jsp
		return modelAndView;		
	}
	@RequestMapping("/services") //localhost:8080/srpingmvc/services
	public ModelAndView services(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		
		List<String> serviceList = new ArrayList<>();
		serviceList.add("Web Dev");
		serviceList.add("Full Stack Dev");
		serviceList.add("Marketing");
		serviceList.add("Designing");
		serviceList.add("Designing");
		serviceList.add("Designing");
		serviceList.add("Designing");
		serviceList.add("Designing");
		serviceList.add("Designing");
		
		modelAndView.addObject("serviceList",serviceList);
		modelAndView.setViewName("services");  //(folder)views/(file)services.jsp
		
		return modelAndView;       
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
