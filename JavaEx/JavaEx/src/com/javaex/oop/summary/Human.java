package com.javaex.oop.summary;

public class Human extends Animal {
	
	public Human(String name,int age) {
		//명시적으로 부모 생성자 호풀
		super(name,age);
	}
	@Override
	public void say() {
		// Animal class의 추상메서드
		System.out.printf("안녕 나는 %s야%n",name);
	}
}
