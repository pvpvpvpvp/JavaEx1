package com.javaex.basics;
import java.util.*;
public class LoopEx {
	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		continueEx();
//		name();
//		starEx();
		dieEx();
	}
	private static void starEx() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void name() {
		for(int i=2;i<10;i++)
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
	}
	private static void dieEx() {
		for(int i=0;i<9;i++) {
			for(int s=0;s>Math.abs(10-i);s--)
			{
				System.out.print("1");
			}
			for(int z=2;z<4;z++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void continueEx() {
		for(int i=1;i<=20;i++) {
			if(i%2==0||i%3==0)
				continue;
			System.out.println(i);
		}
			
	}
	private static void whileGugu() {
		Scanner sc=new Scanner(System.in);
		int dan;
		int d=1;
				
		System.out.println("단을 입력하세요");
		System.out.println("단:");
		dan=sc.nextInt();
		for(int i=1;				i<10;				++i)
		{
			System.out.println(dan+" * "+i+" = "+i*dan);
		}
		
		
	}
	private static void whileEx() {
		int i=0;
		while(i <=9) {
			System.out.println("I Like Java"+i);
			i++;
		}
	}
}
