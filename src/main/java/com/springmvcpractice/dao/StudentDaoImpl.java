package com.springmvcpractice.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvcpractice.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	@Override
	public int saveStudent(Student student) {
		try {
			return (Integer)this.hibernateTemplate.save(student);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Transactional
	@Override
	public boolean updateStudent(Student student) {
		try {
			System.out.println(student);
			this.hibernateTemplate.update(student);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Transactional
	@Override
	public boolean deleteStudent(Student student) {
		try {
			this.hibernateTemplate.delete(student);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Student getSingleStudent(int studentId) {
		return this.hibernateTemplate.get(Student.class, studentId);
	}

	@Override
	public List<Student> getAllStudent() {
		return this.hibernateTemplate.loadAll(Student.class);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
