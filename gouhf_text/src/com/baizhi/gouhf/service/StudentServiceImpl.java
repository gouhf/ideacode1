package com.baizhi.gouhf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.gouhf.dao.StudentDAO;
import com.baizhi.gouhf.entity.Student;

//给业务类加注释
@Service("studentService")
// 给业务类加控制注解
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class StudentServiceImpl implements StudentService {

	// 用则注入
	@Resource(name = "studentDAO")
	private StudentDAO dao;
	

	@Override
	public void registerStudent(Student student) {
		dao.insertStudent(student);
	}

	@Override
	// 删除
	public void destoryStudetn(Integer id) {
		dao.deleteStudent(id);
	}

	@Override
	// 查一个
	public Student queryOneStudent(Integer id) {
		return dao.selectOne(id);
	}

	@Override
	public void modifyStudent(Student student) {
		dao.updateStudent(student);
	}

	@Override
	public List<Student> queryAllStudent() {
		return dao.selectAll();
	}

}
