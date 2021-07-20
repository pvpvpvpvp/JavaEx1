package com.javaex.quiz02;
import java.util.Scanner;
public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifEx();
//		switchEx();
//		dateEx();
		Quiz1();
		Quiz2();
	}
	//연습문제
	private static void Quiz1() {
		Scanner sc = new Scanner(System.in);
		int a=0;		
	}
	private static void Quiz2() {
		Scanner sc = new Scanner(System.in);
		int a=0;	
	}
	//월일 계산기
	private static void dateEx() {
		Scanner sc = new Scanner(System.in);
		int i=0;
		System.out.print("날짜를 알고싶은 달을 입력해주세요: ");
		i=sc.nextInt();
		int[] days= {31,28,31,30,31,30,31,31,30,31,30,31,};
		sc.close();
		if(i<=12)
		System.out.println(i+"월은 "+days[i-1]+"일 입니다.");
		
	}
	//switch
	private static void switchEx() {
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(true)
		{
		System.out.println("과목을 선택하세요\n (1,자바 2,C 3,C++ 4,파이썬");
		System.out.print("과목번호: ");
		i=sc.nextInt();
		
		
		switch(i) {
		case 1:
			System.out.println("R101호 입니다.");
			break;
		case 2:
			System.out.println("R202호 입니다.");
			break;
		case 3:
			System.out.println("R303호 입니다.");
			break;
		case 4:
			System.out.println("R404호 입니다.");
			break;
		default:
			System.out.println("상담원에게 문의하세요!");
			break;
		}
	
		System.out.println();
		}
	}
	private static void ifEx() {
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(true)
		{
		System.out.println("과목을 선택하세요\n (1,자바 2,C 3,C++ 4,파이썬");
		System.out.print("과목번호: ");
		i=sc.nextInt();
		String[] s = {"R101호 입니다.","R202호 입니다.","R303호 입니다.","R404호 입니다."};
		
		if(4>i-1)
			System.out.println(s[i-1]);
		else
			System.out.println("상담사에게 문의하세요!");
		sc.close();
		
//		if(i==1)
//			System.out.println("R101호 입니다.");
//		else if(i==2)
//			System.out.println("R202호 입니다.");
//		else if(i==3)
//			System.out.println("R303호 입니다.");
//		else if(i==4)
//			System.out.println("R404호 입니다.");
//		else
//			System.out.println("상담원에게 문의하세요!");
		
		System.out.println();
		}
	}

}
