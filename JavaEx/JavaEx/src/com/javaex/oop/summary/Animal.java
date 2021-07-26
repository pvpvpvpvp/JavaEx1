package com.javaex.oop.summary;

public abstract class Animal { //일반화한  추상클래스
	protected String name;
	protected int age;
	
	public Animal(String name) {
		this.name=name;
		
	}
	
	public Animal(String name, int age) {
		this(name);
		this.age=age;
	}
	
	// 메서드
	public void eat() {
		System.out.printf("%s is eatting %n",name);
	}
	//  추상 메서드 : 선언만 한다 추상클래스에는 하나이상의 추상 메서드가 있어야 된다.
	public abstract void say(); //반드시 오라라이드 해야됨 자식클래스에서
		

}
