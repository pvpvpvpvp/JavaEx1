package com.javaex.basics.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enumEx1();
	}
	private static void enumEx1() {
		Week today = Week.WEDNESDAY;
		
		System.out.printf(
				"오늘은 %s(%d) 입니다.%n",
				today.name(),   //열거 상수 -> 문자열	
				today.ordinal() //열거 상수 내 순번
				);
		 Week obj= Week.valueOf("FRIDAY");
		 System.out.printf("%s , %d ",obj.name(),obj.ordinal());
	}

}
