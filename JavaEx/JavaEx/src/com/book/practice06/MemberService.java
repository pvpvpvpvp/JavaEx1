package com.book.practice06;

public class MemberService {
	private String name;
	private String id;
	private String password;
	private int age;
	
	public MemberService(String name,String id) { //14번 생성자
		this.name=name;
		this.id=id;
	}
	
	public boolean login(String id,String password) {
		if(id=="hong"&&password=="12345")
			return true;
		return false;
	}
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}

}
