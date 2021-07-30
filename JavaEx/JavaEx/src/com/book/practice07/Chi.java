package com.book.practice07;

public class Chi extends Par {

	public int a;
	
	public Chi() {
		this(1);
		System.out.println("자식 1번 줄 출력");
	}
	public Chi(int a) {
		this.a=a;
		System.out.println("자식 2번 줄 출력");
	}
}
