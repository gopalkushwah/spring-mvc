package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PathVariableController {
	
	@RequestMapping(path="/books/{id}",method = RequestMethod.GET)
	public String books1(@PathVariable("id") int id,Model model) {
		model.addAttribute(id);
		System.out.println(id);
		return "books";
	}
	
	@RequestMapping(path="/books/{id}/{name}")
	public String books2(@PathVariable("id") int id,@PathVariable("name") String name,Model model) {
		model.addAttribute(id);
		model.addAttribute(name);
		System.out.println("second");
		return "books";
	}
	
	
}
