package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ContactController {
	// In Spring MVC, you can perform a redirect using one of the following
	// approaches:
	// Using redirect: Prefix in View Name:
	// Using RedirectView:

	// using redirect prefix
	@RequestMapping("/redirectprefixexample")
	public String redirectPrefixExample(RedirectAttributes attributes) {
		attributes.addFlashAttribute("msg", "This is redirect msg");
		return "redirect:/about";
	}

	@RequestMapping("/redirectviewexample1")
	public RedirectView redirectViewExample() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("contact");

		return redirectView;
	}

	public UserServices getUserServices() {
		return userServices;
	}

	public void setUserServices(UserServices userServices) {
		this.userServices = userServices;
	}

}
