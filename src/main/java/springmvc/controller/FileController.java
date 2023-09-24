package springmvc.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileController {

	@RequestMapping(value="/upload")
	public String fileUpload() {
		return "fileupload";
	}
	
	@RequestMapping(value="/fileupload",method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file,HttpSession httpSession,Model model) {
		System.out.println("chala");
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getStorageDescription());
		
		String realPath = httpSession.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"uploads"+File.separator+file.getOriginalFilename();
		byte[] bytes = file.getBytes();
		System.out.println(realPath);
		
		try {
			FileOutputStream fos = new FileOutputStream(realPath);
			fos.write(bytes);
			fos.close();
			model.addAttribute("msg","File Uploaded");
			return "fileuploadedsuccessfull";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg","Something went wrong!");
			return "redirect:/upload";
		}
		
	}
}
