package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.model.User;

@Controller
@RequestMapping(path="/admin")
public class AdminController {
	
	
//	we can also add @ModelAttribute annotation at Method Level
//	it will automatic add the common data to all the methods of controller
//	it helps to remove repetitive code 
//	we can put all repetitive code in a single method and then use it in all method
	

//	@ModelAttribute(name="commondata")
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("discription","our website is helpful for all student to find study material");
		model.addAttribute("Header","Welcome to our website");
	}
	
	@RequestMapping("/")   //localhost:8080/srpingmvc/admin/
	public String admin() {
		// The "commondata" attribute is automatically added to the model
		return "admin/adminindex";   //(folder)admin/(file)adminindex.jsp
	}
	
	@RequestMapping("/about") //localhost:8080/srpingmvc/admin/about
	public String adminAbout() {
		// The "commondata" attribute is automatically added to the model
		return "admin/about";   //(folder)admin/(file)adminindex.jsp
	}
	
	@RequestMapping("/contact") //localhost:8080/srpingmvc/admin/contact
	public String contact() {
		// The "commondata" attribute is automatically added to the model
		return "admin/contact";   //(folder)admin/(file)adminindex.jsp
	}
//	------------------------------------------------------------------------
//	To get data from view to controller we have three way 
//	HttpServletRequest request
//	@RequestParam
//	@ModelAttribute

//	@ModelAttribute :----
//	This annotation will automatic set the matching field of User with the name field of Html input
//	Model(Entity class) user properties name should be same as html input element
//	this annotation will also set the value of === Model model === interface 
	
	@RequestMapping("/sendmessage") //localhost:8080/srpingmvc/admin/sendmessage
	public String sendmessage(@ModelAttribute User user) {
		return "admin/getcontactdata";   //(folder)admin/(file)adminindex.jsp
	}
}
