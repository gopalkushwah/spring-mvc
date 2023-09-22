package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import springmvc.model.User;
import springmvc.services.UserServices;

@Controller
public class ContactController {

	@Autowired
	private UserServices userServices;
	
	@RequestMapping(path="/sendmessage", method= RequestMethod.POST)
	public String sendMessage(@ModelAttribute User user,Model model) {
		int i = this.userServices.createUser(user);
		if(i>0) {
			model.addAttribute("msg","Message sent successfully");
			return "getusermessage";
		}
		else {
			model.addAttribute("msg","Something went wrong!");
			return "getusermessage";
		}
	}

	public UserServices getUserServices() {
		return userServices;
	}

	public void setUserServices(UserServices userServices) {
		this.userServices = userServices;
	}
	
	
	
}
