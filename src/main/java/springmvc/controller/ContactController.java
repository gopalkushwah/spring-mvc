package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import springmvc.model.User;

@Controller
public class ContactController {
	@RequestMapping(path = "/sendmessage", method = RequestMethod.POST)
	public String sendMessage(@ModelAttribute User user, Model model) {
		return "about";
	}

}
