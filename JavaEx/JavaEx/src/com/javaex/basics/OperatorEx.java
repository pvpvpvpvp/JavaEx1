package com.javaex.basics;

public class OperatorEx {
	public static void main(String[] agrs) {
//		arithOperEx();
//		logicOperEx();
//		bitOperEx();
//		bitShiftOperEx();
		conditionalOperEx();
	}
	//3항연산자
	private static void conditionalOperEx() {
		int a =10;
		String result;
		result=a%2 == 0? "짝수": "홀수";
		 System.out.println(result);
		 
		 int score =85;
		 String message = score >= 80? "Good!":
			 							score >= 50? "Pass":"Fail";
		 System.out.println(message);
	}
	//비트 시프트 연산자
	private static void bitShiftOperEx() {
		// 비트 단위로 이동
		int val=1;
		System.out.println("var: "+ Integer.toBinaryString(val));
		
		System.out.println("var: "+ Integer.toBinaryString(val<<1));
		System.out.println("var: "+ Integer.toBinaryString(val<<4));
		val=-2021;
		System.out.println("var: "+ Integer.toBinaryString(val));
		System.out.println("var: "+ Integer.toBinaryString(val<<1));
	}
	//비트연산자
	private static void bitOperEx() {
		//하드웨어 제어, 이미지 처리 등
		//미세하게 비트 단위 데이터 제어에 활용
		byte b1= 0b1101;
		byte b2= 0b0111;
		System.out.println("b1:"+ Integer.toBinaryString(b1));
		System.out.println("b2:"+ Integer.toBinaryString(b2));
		//비트 논리곱
		System.out.println("b1&b2 : "+ Integer.toBinaryString(b1&b2));
		//비트 논리합
		System.out.println("b1|b2 : "+ Integer.toBinaryString(b1|b2));
		//논리부정
		System.out.println("~b1 : "+ Integer.toBinaryString(~b1));
		//베타적 논리합
		System.out.println("b1^b2 : "+ Integer.toBinaryString(b1^b2));
		
		
	}

	//
	private static void logicOperEx() {
		int a = 7, b = 3;
		// 비교 연산자: > >= < <= == !=
		boolean[] abc = new boolean[3];
		abc[0]= a>b;
		abc[1]= a==b;
		abc[2]= a<b;
		
		System.out.println("a > b ? "+ abc[0]);
		System.out.println("a = b ? "+ abc[1]);
		System.out.println("a < b ? "+ abc[2]);
		
		
		// 논리 연선자 논리곱 AND:&& 논리합 OR:|| 논리부정 NOT:! 
		int num =5;
		//num 0초과 10 미만의 값인가?
		//	조건1: num>0
		//	조건2: num<10
		//결과 조건1 and 조건2
		boolean r1 = num>0;
		boolean r2 = num<10;
		boolean r1Andr2 = r1&&r2;
		System.out.println("r1 && r2 => "+ r1Andr2);
			
		//	num: 0이하 이거나 10이상의 값인가?
		//			조건1 =num <=  0 ?
		//			조건2 =num >= 10 ?
		// 결과: 조건1 or 조건2(논리합: 합집합)
		boolean r3 = num<=0;
		boolean r4 = num>=10;
		boolean r3Orr4 = r3||r4;
		// num <= 0 || num >= 10
		System.out.println("r3 || r4 => "+ r3Orr4);
		
		//	논리 부정: 
		// num > 0 && num < 10 ->논리부정 한다면
		// num <=0 || num >= 10 
		boolean rNot = !(num>0&&num<10);
		System.out.println();
		
	}

	// 산술 연산
	private static void arithOperEx() {
		int a = 7, b = 3;
		// 부호 연산자 : +, -
		System.out.println(-a);

		// 사칙연산: +, -, *, /
		System.out.println(a / b);
		System.out.println(a % b);
		// 실제 해 구하기

		System.out.println((float) a / (float) b);
		System.out.println((float) a / b);

		// 증감연산자

		int num = 10;
		System.out.println("num: " + num);
		System.out.println("++num:" + ++num);
		System.out.println("num:" + num);

		System.out.println("num: " + num);
		System.out.println("num++:" + num++);
		System.out.println("num:" + num);

//		System.out.println(4/0); ArithmeticException
		System.out.println(4.0 / 0);
		System.out.println(4.0 / 0 + 10);
		System.out.println(0.0 / 0.0);
		System.out.println("End of Code");

		// 연산식 결과가 Infinity 인가 확인
		System.out.println(Double.isInfinite(4.0 / 0));
		System.out.println(Double.isNaN(0.0 / 0.0));
		System.out.println("End of Code");

	}
}
