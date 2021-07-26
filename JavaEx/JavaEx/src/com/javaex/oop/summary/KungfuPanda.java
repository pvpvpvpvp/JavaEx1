package com.javaex.oop.summary;

public class KungfuPanda extends Panda implements KungfuSkill {

	// 생성자
	public KungfuPanda(String name,int age) {
		super(name, age);
	}

	@Override
	public void kungfu() {
		// TODO Auto-generated method stub
		System.out.printf("%s: 아뵤~!%n",name);
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub

	}

}
