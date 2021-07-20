package com.javaex.quiz02;

public class Quiz02_1 {
	public static void main(String[] agrs)
	{
		int a=3;
		int b=6;
		char c= 'A';
		
		System.out.println("a는 짝수입니까? "+ (a%2==0));
		System.out.println("b는 3의 배수입니까?"+ (b%3==0));
		boolean r1= a%2==0&&b%3==0;
		System.out.println("논리곱 결과값 r1: "+ r1);
		char r2=(char)(c+4);
		System.out.println("char의 4글자 뒤의 문자 r2:"+ r2);
	}
}
