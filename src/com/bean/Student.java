package com.bean;

public class Student {

	private String id ; // 编号
	private String name ;// 学生姓名
	
	private String sex ;//学生性别
	
	private Integer grade ; // 分数

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", grade=" + grade + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, String sex, Integer grade) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.grade = grade;
	}

	

	
	
	
}
