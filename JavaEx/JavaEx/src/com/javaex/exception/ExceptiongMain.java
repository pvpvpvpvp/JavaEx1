package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptiongMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		arithExceptiongEx();
//		nullPointerxExceptionEX();
		arrayIndexExceptionEx();
	}
	private static void arrayIndexExceptionEx() {
		//배열의 범위를 벗어난 접근
		int[] a = new int[] {1,3,5,7,9};
		//length ==5 ,index 0~4
		try {
		System.out.println(a[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("예외 객체:"+ e.getClass().getSimpleName());
			System.out.println("예외 메시지:"+e.getMessage());
			System.err.printf("배열의 인덱스 범위는 0~%d까지 입니다%n",a.length-1);
		}
		System.out.println("End of Code");
	}
	
	private static void nullPointerxExceptionEX() {
		String str =new String("java");
		System.out.println(str.toString());
		
		
		str=null;
		System.out.println(str);
		try {
		System.out.println(str.toUpperCase());//전부대문자로 
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.err.println("Str은 null입니다");
		}
		System.out.println("End of Code");
		
	}
	private static void arithExceptiongEx() {
		// 스캐너로부터 정수 입력
		double result =0;
		int num =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		try {// 예외 발생 가능 코드를 명시
		num = sc.nextInt();
		result = 100/num;
		}catch (InputMismatchException e) {
			System.err.println("!!정수를 입력하세요!!");
		}catch (ArithmeticException e) {// 위로는 구체적인 예외를 명시
			System.err.println("0오로는 나눌 수 없어요");
		}catch (Exception e) { //가장 마지막에 사용
			e.printStackTrace();//예외정보 전체출력
		}finally {
			//예외여부 관계없이 가장 마지막에 수행
			System.out.println("Finally");
		}
		System.out.println(result);
		sc.close();
	}

}
