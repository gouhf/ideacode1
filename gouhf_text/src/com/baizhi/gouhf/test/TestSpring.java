package com.baizhi.gouhf.test;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baizhi.gouhf.dao.StudentDAO;
import com.baizhi.gouhf.entity.Student;
import com.baizhi.gouhf.service.StudentService;
		
public class TestSpring {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");

	@Test//测数据源
	public void test1() throws SQLException{
		DataSource ds=(DataSource)ctx.getBean("bds");
		
		System.out.println(ds.getConnection());
		
	}
	@Test//测查所有dao
	public void test2()  {
		
		StudentDAO dao=(StudentDAO)ctx.getBean("studentDAO");
		System.out.println(dao.selectAll());
	}
	@Test//测sqlsessionfactory
	public void test3()  {
		
		SqlSessionFactory ssf=(SqlSessionFactory)ctx.getBean("ssfb");
		
		System.out.println(ssf.openSession().getConnection());
	}
	@Test//测service 查所有
	public void test4()  {
		
		StudentService ss=(StudentService)ctx.getBean("studentService");
		List<Student> list=ss.queryAllStudent();
		for (Student student : list) {
			System.out.println(student);
		}
		}
	@Test//测sqlsessionfactory
	public void test5()  {
		
		StudentDAO sd=(StudentDAO)ctx.getBean("studentDAO");
		sd.updateStudent(new Student(2,"gougou","9999999",new Date()));
	}
	@Test//测修改的service
	public void test6()  {
		
		StudentService ss=(StudentService)ctx.getBean("studentService");
		ss.modifyStudent((new Student(2,"gougou","66999999",new Date())));
		
	}
	@Test//测查一
	public void test7()  {
		
		StudentDAO sd=(StudentDAO)ctx.getBean("studentDAO");
		System.out.println(sd.selectOne(2));
	}
	@Test//测修改的service
	public void test12()  {
		
		StudentService ss=(StudentService)ctx.getBean("studentService");
		System.out.println(ss.queryOneStudent(22));
		
	}
	@Test//删除
	public void test8()  {
		
		StudentDAO sd=(StudentDAO)ctx.getBean("studentDAO");
		sd.deleteStudent(3);
	}
	@Test//测删除的service
	public void test9()  {
		
		StudentService ss=(StudentService)ctx.getBean("studentService");
		ss.destoryStudetn(1);
		
	}
	@Test//删除
	public void test10()  {
		
		StudentDAO sd=(StudentDAO)ctx.getBean("studentDAO");
		sd.insertStudent(new Student(16,"dd","111111",new Date()));
	}
	@Test//测增加的service
	public void test11()  {
		
		StudentService ss=(StudentService)ctx.getBean("studentService");
		ss.registerStudent(new Student(17,"ddff","222222",new Date()));
		
	}
	
	
}
