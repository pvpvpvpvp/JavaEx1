package com.javaex.person;


public class Student extends Person {

	private String schoolname;
	

	public Student(String name,int age,String schoolname) {
		super(name, age);
		this.schoolname=schoolname;
	}
	public Student(String schoolname) {
		this.schoolname =schoolname;
	} //에러남.!
	
	public void showInfo() {
		System.out.printf("이름 %s 나이 %d 학교 %s %n",name,age,schoolname);	
	}
}
