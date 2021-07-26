package com.javaex.api.objectclass.v2;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(10,20);
		Point p2 = new Point(10,20);
		System.out.println("p와 p2는 같은 객체인가"+(p==p2));
		//
		System.out.println("p와 p2는 같은 값을 가지고 있는가"+(p.equals(p2)));//
		
		
		Point p1 = new Point(10,20);
		
		
		
	}

	
	

}
