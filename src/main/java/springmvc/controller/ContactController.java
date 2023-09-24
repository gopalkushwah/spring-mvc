package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import springmvc.model.User;

@Controller
public class ContactController {	
	
	@RequestMapping(path="/sendmessage", method= RequestMethod.POST)
	public String sendMessage(@ModelAttribute("user") User user,BindingResult result,Model model) {
		if(result.hasErrors()) {
			System.out.println(result.getErrorCount());
			System.out.println(result.getFieldValue("id"));
			System.out.println(result.getAllErrors());
			return "contact";
		}
		return "about";
	}
}
