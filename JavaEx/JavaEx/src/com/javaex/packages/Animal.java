package com.javaex.packages;

public class Animal {
	protected String name;
	public Animal(String name) {
		super();// 명시하지 않으면 실행되므로 없어도 상관없음
		this.name=name;
	}
	
	public void eat() {
		System.out.println(name+" is eating...");
	}
	public void walk() {
		System.out.println(name+" is walking");
	}
}
