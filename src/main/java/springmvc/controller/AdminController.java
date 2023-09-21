package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
@RequestMapping(path="/admin")
public class AdminController {
	
	@RequestMapping("/")   //localhost:8080/srpingmvc/admin/
	public String admin() {
		return "admin/adminindex";   //(folder)admin/(file)adminindex.jsp
	}
	
	@RequestMapping("/about") //localhost:8080/srpingmvc/admin/about
	public String adminAbout() {
		return "admin/about";   //(folder)admin/(file)adminindex.jsp
	}
	
	@RequestMapping("/contact") //localhost:8080/srpingmvc/admin/contact
	public String contact() {
		return "admin/contact";   //(folder)admin/(file)adminindex.jsp
	}
//	------------------------------------------------------------------------
//	To get data from view to controller we have three way 
//	HttpServletRequest request
//	@RequestParam
//	@ModelAttribute
	
//	using HttpServletRequest request
	/*
	@RequestMapping("/sendmessage") //localhost:8080/srpingmvc/admin/contact
	public String sendmessage(HttpServletRequest request) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		return "admin/contact";   //(folder)admin/(file)adminindex.jsp
	}
	*/
	
	
//	@RequestParam
	/*
	@RequestMapping("/sendmessage") //localhost:8080/srpingmvc/admin/contact
	public String sendmessage(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			Model model
			) {
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
//		model.addAttribute("name", name);
//		model.addAttribute("email", email);
//		model.addAttribute("password", password);
 * 
 * 		User user = new User();
 * 		user.setName(name);
 * 		user.setEmai(email);
 * 		user.setPassword(password);
 * 		model.addAttribute("user",user);
		return "admin/getcontactdata";   //(folder)admin/(file)adminindex.jsp
	}
	*/
	
	
//	@ModelAttribute
//	This annotation will automatic set the matching field of User with the name field of Html input
//	Model(Entity class) user properties name should be same as html input element
//	this annotation will also set the value of === Model model === interface 
	@RequestMapping("/sendmessage") //localhost:8080/srpingmvc/admin/contact
	public String sendmessage(@ModelAttribute User user) {
		return "admin/getcontactdata";   //(folder)admin/(file)adminindex.jsp
	}
}
