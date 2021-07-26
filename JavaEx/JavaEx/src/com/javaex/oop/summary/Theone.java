package com.javaex.oop.summary;

public class Theone extends Human implements KungfuSkill,Filyable{

	
	public Theone(String name,int age) {
		super(name, age);
	}
	@Override
	public void kungfu() {
		System.out.printf("%s: 쿵푸!%n",name);

	}
	@Override
	public void fly() {
		System.out.printf("%s : I can fly%n",name);
		
	}

}
