package com.springmvcpractice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvcpractice.dao.StudentDao;
import com.springmvcpractice.model.Student;

@Service
public class StudentServices {
	@Autowired
	private StudentDao studentDaoImpl;
	
	public int createSudent(Student student) {
		return this.studentDaoImpl.saveStudent(student);
	}
	
	public boolean updateStudent(Student student) {
		try {
			this.studentDaoImpl.updateStudent(student);
			return true;
		} catch (Exception e) {
			
			return false;
		}
		
	}

	public boolean deleteStudent(int studentId) {
		try {
			
			Student singleStudent = this.studentDaoImpl.getSingleStudent(studentId);
			this.studentDaoImpl.deleteStudent(singleStudent);
			return true;
		} catch (Exception e) {
			
			return false;
		}
	}

	public Student getSingleStudent(int studentId) {
		return this.studentDaoImpl.getSingleStudent(studentId);
	}

	public List<Student> getAllStudent() {
		return this.studentDaoImpl.getAllStudent();
	}

	public StudentDao getStudentDaoImpl() {
		return studentDaoImpl;
	}

	public void setStudentDaoImpl(StudentDao studentDaoImpl) {
		this.studentDaoImpl = studentDaoImpl;
	}
	

}
