package com.baizhi.gouhf.entity;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
/*    id number(7) primary key,
    name varchar2(30) not null,
    email varchar2(60) not null,
    birthday date*/

	private Integer id;
	private String name;
	private String  email;
	private Date birthday;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String name, String email, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email
				+ ", birthday=" + birthday + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
