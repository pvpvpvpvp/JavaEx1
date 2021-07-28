package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(2021);
		Character c = new  Character('c'); 
		// new 방식의 포장은 jdk 이후로 Deprecatead 안쓴다는뜻(최신버전)

		Float f = Float.valueOf(3.141592f);
		Boolean b = Boolean.valueOf(true);
		
		//문자열을 해당 데이터 타입으로 변환하기
		Integer i1 = Integer.valueOf("10");
		Double d = Double.valueOf("3.14");
		Boolean b1 = Boolean.valueOf(false);
//		Float f1 = Float.valueOf("asd1112f")  문자열의 형태가 해당 기본형의 형태를 갖추고 있어야 실행가능	
		
		
		Integer i2 = 10; // ->Integer i2 = Integer.valueOf(10); 자동 박싱!
		
		// parse 계열 메서드: 변환
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("ff",16));
		System.out.println(Integer.toBinaryString(2021));
		System.out.println(Integer.toHexString(2021));
		
		// 형변환
		System.out.println(i2.doubleValue());

		Integer i3 = Integer.valueOf(2021);
		Integer i4 = Integer.valueOf(2021);
		
		System.out.println("i3 == i4 ?"+(i3==i4)); //다른  객체이다.
		System.out.println("값의 비교: "+i3.equals(i4));
		System.out.println("언박싱 비교:"+(i3.intValue()==i4.intValue()));
		
				}

}
