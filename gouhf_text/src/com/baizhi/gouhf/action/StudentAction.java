package com.baizhi.gouhf.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.baizhi.gouhf.entity.Student;
import com.baizhi.gouhf.service.StudentService;

@Controller("sa")
@Scope("prototype")
public class StudentAction {
	// @Resource(name="studentService")
	// 1.成员变量 接收参数，2. 成员变量代替request作用域传参；
	private List<Student> list;
	private Student student;
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// 提供getset方法
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	// DI用则注入
	@Resource(name = "studentService")
	private StudentService ss;

	public String queryAll() {
		list = ss.queryAllStudent();

		return "qu";
	}

	// 修改
	public String modify() {
		System.out.println(student);
		ss.modifyStudent(student);

		return "mo";
	}

	// 查一
	public String queryOne() {

		this.student = ss.queryOneStudent(id);
		return "quone";
	}

	// 删除
	public String destory() {
		System.out.println(student);
		ss.destoryStudetn(id);
		return "des";
	}
	// 增加
		public String register() {
			System.out.println(student);
			ss.registerStudent(student);
			return "reg";
		}
}
