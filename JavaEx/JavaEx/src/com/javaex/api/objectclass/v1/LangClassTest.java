package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(10,20);
		System.out.println(p.getClass().getSimpleName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p); //== p.toString
	
		// p의 부모 객체를 확인
		System.out.println("p의 부모:"+p.getClass().getSuperclass().getName());
	}
	

}
