package com.book.practice07;

public class Par {
	public int a;
	
	public Par() {
		this(1);
		System.out.println("부모 1번 줄 출력");
	}
	public Par(int a) {
		this.a=a;
		System.out.println("부모 2번 줄 출력");
	}
}
