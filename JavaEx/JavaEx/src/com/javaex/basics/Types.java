package com.javaex.basics;

//변수예제
//데이터 타입 예제

public class Types {
	static final int SPEED_LIMIT = 100; // final 붙히면 변경 불가

	public static void main(String[] agrs) {
//	varEx();
//	integerEX();
//		floatDoubleEx();
//		booleanEx();
//		charEx();
//		constrantEx();
//		promotionEx();
		castingEx();
	}

//암묵적 형변환 promotion : implicit casting
	private static void promotionEx() {
		// byte < short < int < long | float < double
		// 표현범위가 좁은 자료형에서 -> 넓은 자료형으로 이동할때는 자동변환이 된다.

		byte b = 25; // 1byte 정수형
		System.out.println(b);
		short s = b; // 2byte 정수형
		System.out.println(s);
		int i = s; // 4byte 정수형
		System.out.println(s);
		long l = i; // 8byte 정수형
		System.out.println(l);
		float f = l; // 4byte 실수형
		System.out.println(f);
		double d = f; // 8byte 실수형
		System.out.println(d);
	}

//명시적 형변환 casting: explicit casting
	private static void castingEx() {
		// 표현범위가 넓은 자료형에서 좁은 자료형으로 변환
		// 강제로 타입 변환을 수행해야 하며, 자료의 유실이 일어날 수 있다.

		float f = 1234567890.123456789f; // 4byte 실수형
		System.out.println(f);
		long l = (long)f;				// 8byte 정수형
		System.out.println(l);
		int i = (int)l;					// 4byte 정수형
		System.out.println(i);
		System.out.println(Integer.toBinaryString(i));
		short s = (short)i;				// 2byte 정수형
		System.out.println(s);
		System.out.println(Integer.toBinaryString(s));
		byte b= (byte)s;				// 1byte 정수형 
		System.out.println(b);
		
		

	}

//변수의 선언과 사용
	private static void constrantEx() {

		System.out.println("제한속도: " + SPEED_LIMIT);

		int limit = SPEED_LIMIT;
		System.out.println("현재 도로의 제한속도는 " + limit + "입니다");
		// 코드의 가독성과 코드의 변경이 용이해진다.

//		SPEED_LIMIT = 160;
		System.out.println("제한속도: " + SPEED_LIMIT);

		System.out.println("현재 도로의 제한속도는 " + limit + "입니다");
	}

// 문자형 데이터 타입
	private static void charEx() {
//부호가 없는 정수 코드
		char ch1 = 'A';
		char ch2 = '한';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch1 + ch2);

		String str = "A한";
		System.out.println(str);
	}

//논리형 데이터 타입
	private static void booleanEx() {
//		1byte: true or false
//		조건,분기 반복문 등에 활용

		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);

//	비교연산과 논리연산의 결과로 활용
		int a = 7, b = 3;
		boolean result = a > b;
		System.out.println(result);

	}

//실수형
	private static void floatDoubleEx() {
//	 float(4) < double(8)
		float floatVar = 3.141592f;
		double doubleVar = 3.141592;

		System.out.println(floatVar);
		System.out.println(doubleVar);

//	지수 표기법
		doubleVar = 3e10; // 3*10^10
		floatVar = 3e-6f; // 3*10^-6
		System.out.println(floatVar);
		System.out.println(doubleVar);
//  부동소수점
//	float,double은 정밀도를 포기하고
//	표현범위만 넓힌 것
//	정밀 실수 처리에는 적합하지 않다.
		System.out.println(0.1 * 3);
	}

//정수형
	private static void varEx() {
		/*
		 * 변수의 식별자 규칙 1,문자, 숫자 ,$와 _ 사용가능 2,숫자로 시작불가능 3,예약어는 사용할 수 없다. 4,변수, 메서드의 명령규칙은
		 * camelCase로 한다.
		 */
		// int age; // 선언
		// age=25; // 초기화
		int age = 25; // 선언과 초기화

		// 자바는 정적타입 언어, 다른 타입의 데이터를 담을 수 없다.
		// age=26.14; Error 정수형에 실수 넣으면 에러남!

		// 조회:
		System.out.println("나이는 " + age);

		// 한번에 여러 변수를 선언할 때
		int v1 = 10, v2 = 20, v3 = 30;

		// 여러변수를 동일값으로 지정할때
		v1 = v2 = v3 = 40;

	}

	private static void integerEX() {
		// byte(1) < short(2) < int (4) < long(8)
		int intVar1, intVar2;
		intVar1 = 2021;
		// intVar2 = 1234567890123; // out of range; 저장범위 초과
		System.out.println(Integer.toBinaryString(intVar1));

		long longVar1, longVar2;
		longVar1 = 2021L;
		longVar2 = 1234567890123L; // long형 데이터를 표시할 때는 뒤에다가 L or l를 명시한다.

		System.out.println(longVar1);
		System.out.println(longVar2);

		// 2진수 8진수 16진수

		int bin, oct, hex;
		bin = 0b1101; // 2진수 0b
		oct = 072; // 8진수 0
		hex = 0xfa; // 16진수 0x

		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}