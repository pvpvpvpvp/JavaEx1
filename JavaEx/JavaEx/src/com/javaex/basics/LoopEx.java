package com.javaex.basics;
import java.util.*;
public class LoopEx {
	public static void main(String[] args) {
		whileEx();
		whileGugu();
		
	}
	private static void dowhileEx() {
		int i=0;
	}
	private static void whileGugu() {
		Scanner sc=new Scanner(System.in);
		int dan;
		int i=1;
				
		System.out.println("단을 입력하세요");
		System.out.println("단:");
		dan=sc.nextInt();
		
		
	}
	private static void whileEx() {
		int i=0;
		while(i <=9) {
			System.out.println("I Like Java"+i);
			i++;
		}
	}
}
