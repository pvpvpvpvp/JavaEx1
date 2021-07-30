package com.javaex.problem02;

public class Friend {

	private String name;
	private String hp;
	private String school;

	// 필요한 메소드 작성

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String gethp() {
		return hp;
	}

	public void setschool(String school) {
		this.school = school;
	}

	public String getschool() {
		return school;
	}

	public Friend(String name,String hp,String school) {
		setHp(hp);
		setschool(school);
		setName(name);
	}
	public void showInfo() {
		System.out.println("이름:" + name + "  핸드폰:" + hp + "  학교:" + school);
	}

}
