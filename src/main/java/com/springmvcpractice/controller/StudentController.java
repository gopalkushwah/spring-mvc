package com.springmvcpractice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.springmvcpractice.model.Student;
import com.springmvcpractice.services.StudentServices;

@Controller
@RequestMapping(path="/student")
public class StudentController {
	@Autowired
	private StudentServices studentServices;
	
	@RequestMapping(path="/save-student",method=RequestMethod.POST)
	public ResponseEntity<String> saveStudent(@ModelAttribute Student student) {
		try {
			this.studentServices.createSudent(student);
			return ResponseEntity.ok("Student Data Saved!");
		} catch (Exception e) {
			return ResponseEntity.ok("Something went wrong!");
		}
	}
	@RequestMapping(path="/get-all-student",method=RequestMethod.POST)
	public ResponseEntity<String> getAllStudent() {
		try {
			List<Student> allStudent = this.studentServices.getAllStudent();
			Gson gson = new Gson();
			String json = gson.toJson(allStudent);
			return ResponseEntity.ok(json);
		} catch (Exception e) {
			return ResponseEntity.ok("Something went wrong!");
		}
	}
	@RequestMapping(path="/get-single-student",method=RequestMethod.POST)
	public ResponseEntity<String> getSingleStudent(@RequestParam("id") int id) {
		try {
			Student student = this.studentServices.getSingleStudent(id);
			Gson gson = new Gson();
			String json = gson.toJson(student);
			return ResponseEntity.ok(json);
		} catch (Exception e) {
			return ResponseEntity.ok("Something went wrong!");
		}
	}
	@RequestMapping(path="/update-student")
	public String updateStudent() {
		try {
			return "update-student";
		} catch (Exception e) {
			e.printStackTrace();
			return "get-all-student";
		}
	}
	@RequestMapping(path="/update-student-final")
	public ResponseEntity<String>  updateStudentFinal(@ModelAttribute Student student) {
		try {
			boolean updateStudent = this.studentServices.updateStudent(student);
			if(updateStudent)
				return ResponseEntity.ok("Student Updated ");
			else 
				return ResponseEntity.ok("Something went wrong!");
				
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok("Something went wrong!");
		}
	}
	@RequestMapping(path="/delete-student")
	public String  deleteStudent(@RequestParam("id") int id) {
		try {
			this.studentServices.deleteStudent(id);
			return "redirect:/show-student";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/show-student";
		}
	}
}
