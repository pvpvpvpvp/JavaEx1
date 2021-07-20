package com.javaex.quiz02;

public class Quiz02_2 {
	public static void main(String[] agrs)
	{
		int balls=136;
		int cap= 10;
		int result= balls/cap;
		int resultadd = (balls%cap>0)? 1:0 ;
		System.out.println("balls를 상자에 나누어 담을려면 필요한 상자의 개수는 :"+(result+resultadd));
	}
}
