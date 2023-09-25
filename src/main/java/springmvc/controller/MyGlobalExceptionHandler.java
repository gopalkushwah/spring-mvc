package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

// ControllerAdvice is used to tell spring that all kind of handler available in this controller
@ControllerAdvice
public class MyGlobalExceptionHandler {
	
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
