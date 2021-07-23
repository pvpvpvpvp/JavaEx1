package com.java8.baekjoon;

import java.util.Scanner;

public class Number1010 {
	public static void main(String[] args) {
		// 다리놓기 수학문제 사용하는 공식은 N!/r!(N-r)! 경우의 수 조합공식
		// 핵심은 팩토리얼 구현 그리고 변수값들의 최대범위을 잘알자.!
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		int[] a = new int[c];
		int[] b = new int[c];

		double[] n = new double[c];
		double[] m = new double[c];
		double[] mn = new double[c];
		for (int i = 0; i < c; i++) {
			a[i] = sc.nextInt();// a는 n
			b[i] = sc.nextInt();// b는 M 그리고 M >=n
		}

		for(int i=0;i<c;i++)
		{
			n[i]=factorial(a[i]);
			m[i]=factorial(b[i]); //m이 29일 경우는 long의 범위까지도 초과해서 안전하게 double로 선언/계산
			mn[i]=factorial(b[i]-a[i]);
		}
		double[] resultend=new double[c]; 
		
		for(int i=0;i<c;i++)//출력구문
		{
			resultend[i]=m[i]/(n[i]*mn[i]);// 경우의 수 조합공식을 이용한 최종 계산결과
			if(resultend[i]>(int)resultend[i]+0.5f)//실수형 계산의 오차보정해주기 (그냥소숫점올림)
				resultend[i]++;
			if(a[i]==0||b[i]==0)
				resultend[i]=0;
			System.out.println((int)resultend[i]);
		}
	}

	private static double factorial(int a) { //a의 팩토리얼 값을 리턴하는 함수
		double return1 = 1L;
		for (int j = 1; j <= a; j++) {
			return1 *= j;
		}
		return return1;
	}
	
}//실패
