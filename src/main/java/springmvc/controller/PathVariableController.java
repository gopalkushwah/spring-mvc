package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class PathVariableController {
	
	@RequestMapping(path="/books",method = RequestMethod.GET)
	public String books() {
		return "books";
	}
	
	@RequestMapping(path="/books/{id}",method = RequestMethod.GET)
	public String books1(@PathVariable("id") int id,Model model) {
		String str = null;
		System.out.println(str.charAt(0));
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
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String handlerMethod(Model model) {
		model.addAttribute("msg","Null Pointer Exception");
		
		return "error404";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NumberFormatException.class)
	public String handlerMethod1(Model model) {
		model.addAttribute("msg","Cannot cast String to Integer");
		
		return "error404";
	}
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String allHandlerMethod(Model model) {
		model.addAttribute("msg","All Exception");
		
		return "error404";
	}
	
}
