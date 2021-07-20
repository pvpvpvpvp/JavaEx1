package com.javaex.quiz02;

public class Quiz02_5 {
 public static void main(String[] agrs) {
	 int num1=13579;
	 int num2=13579;
	 
	String a = ((++num1 + 1)==(num2++ +1))? "같음":"다름";
	System.out.println(a);
	System.out.println("최종 num1값: "+ num1);
	System.out.println("최종 num2값: "+ num2);
}
}
