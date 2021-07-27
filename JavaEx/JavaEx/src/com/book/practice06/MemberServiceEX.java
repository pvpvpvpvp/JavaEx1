package com.book.practice06;

public class MemberServiceEX {

	public static void main(String[] args) {//15번
		// TODO Auto-generated method stub
		MemberService m= new MemberService();
		boolean re= m.login("hong","123 45");
		
		if(re)
		{
			System.out.println("로그인 성공");
			m.logout();
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
