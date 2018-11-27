package com.baizhi.gouhf.dao;

import java.util.List;

import com.baizhi.gouhf.entity.Student;

public interface StudentDAO {
	//查所有
	public List<Student> selectAll();
	//修改
	void  updateStudent(Student student);
	//查一个
	Student selectOne(Integer id);
	//删除
	void deleteStudent(Integer id);
	// 增加
	void insertStudent(Student student);


}
