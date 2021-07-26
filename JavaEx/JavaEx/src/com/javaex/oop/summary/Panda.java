package com.javaex.oop.summary;

public class Panda extends Animal {

	public Panda(String name,int age) {
		super(name,age);
	}
	
	public void say() {
		System.out.printf("%s is cry%n",name);
		
	}
}
