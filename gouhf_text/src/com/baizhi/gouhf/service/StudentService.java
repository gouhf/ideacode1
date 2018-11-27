package com.baizhi.gouhf.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.gouhf.entity.Student;


public interface StudentService {
	public List<Student> queryAllStudent();
	void modifyStudent(Student student);
	Student queryOneStudent(Integer id);
	void destoryStudetn(Integer id);
	void registerStudent(Student student);
}
