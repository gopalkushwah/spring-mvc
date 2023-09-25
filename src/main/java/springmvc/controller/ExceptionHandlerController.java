package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionHandlerController {

//	if Entered url does not matches with any url in our application
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@RequestMapping("/**")
	public String handleException(Model m) {
		m.addAttribute("msg","Page Not Found");
		return "error404";
	}
	
	
}
