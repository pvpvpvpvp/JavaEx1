package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
//		stringType();
		stringFormatEx();
	}
	
	//열거형 enum
	private static void stringFormatEx() {
		// %d 정수 %s 문자열 %n 개행 %% %하나 %f 실수
		String food ="사과";
		int total = 10, eat = 3;
		
		//total개의 food 중에서 eat개를 먹었다.
		System.out.println(total+" 개의 "+food+" 중에서 "+eat+" 개를 먹었다.");
		System.out.printf("%d 개의 %s 중에서 %d 개를 먹었다%n",total,food,eat);
		
		String fmt ="%d 개의 %s 중에서 %d 개를 먹었다%n";
		System.out.printf(fmt,total,food,eat);
		String message = String.format(fmt,5,"버거",2);
		System.out.println(message);
		
		// 부가 정보를 가지기도 한다.
		float rate = 1.234f;
		//현재 이자율은 ___%입니다.
		fmt ="현재 이자율은 %f%% 입니다.%n";
		System.out.printf(fmt,rate);
		fmt ="현재 이자율은 %.2f%% 입니다.%n";//소숫점 2자리까지 표시
		System.out.printf(fmt,rate);
		
	}
	private static void stringType() {
		String str;//선언
		str ="Java";//리터럴 (소스에 직접 입력된 값)
		String str2 = "Java";
		String str3 = new String("Java");
		
		// 참조타입에서 ==는 참조 주소가 같은지 (같은객체를 참조하는지) 판별
		System.out.println("str == str2 ? " + (str==str2));
		System.out.println("str == str3 ? " + (str==str3));
		
		//값의 비교는 .equals()
		System.out.println("str, str2 내용이 같은가 ? " + (str.equals(str2)));
		System.out.println("str, str3 내용이 같은가 ? " + (str.equals(str3)));
	
		String str4; //선언 했으나 할당되지 않음
//		str4.equals(str);
		// null 상태의 객체의 메서드를 이용하고자 하면 에러 발생
		// NullPointerException
		
	}
}
