package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerBox iBox = new IntegerBox();
		iBox.setContent(10);
		StringBox sBox = new StringBox();
		sBox.setContent("z");

		// 캐스팅을 반드시 해야됨
		// 캐스팅을 잘못하면 에러 발생

		objectBox oBox = new objectBox();
		oBox.setOb(2021);
		System.out.println(oBox.getOb());

		Integer i = (Integer) oBox.getOb();
		System.out.println(i);

		oBox.setOb("String obj");

		String s = (String) oBox.getOb();
//		Integer i2 = (Integer)oBox.getOb(); 캐스팅 오류 주의!

		// 제네릭 상자
		// 설계시 타입을 미정 상태로 해두고
		// 인스턴스 생성시 실제 타입을 결정한다.

		GenericBox<Integer> intbox = new GenericBox<Integer>();
		intbox.setContent(2021);
//		intbox.setContent("String");
		
		Integer i3 = intbox.getContent(); //캐스팅 불필요
		GenericBox<String> s99 = new GenericBox<String>();
//		s99.setContent(2021);
		s99.setContent("Stirng");
		String s2= s99.getContent();
//		Integer s33 =s99.getContent(); //컴파일러가 타입체크해줌
		System.out.println(s2);
		
		//제네릭 장정 
		// 여러 타입에 대응하는 단일 클래스를 설계가능
		// 타입 체크를 컴파일러에게 맡길 수 있다.
		// 불필요한 캐스팅을 피할 수 있다.  편의성

	}

}
