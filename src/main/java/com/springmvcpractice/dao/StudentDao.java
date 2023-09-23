package com.springmvcpractice.dao;

import java.util.List;

import com.springmvcpractice.model.Student;

public interface StudentDao {
	public int saveStudent(Student student);
	public boolean updateStudent(Student student);
	public boolean deleteStudent(Student student);
	public Student getSingleStudent(int studentId);
	public List<Student> getAllStudent();
}
