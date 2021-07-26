package com.javaex.person;

public class Person {
	protected String name;
	protected int age;

	public Person(String name,int age) {
	this.name=name;
	this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void showInfo() {
		System.out.printf("이름 %s 나이 %d %n",name,age);
	}
}
