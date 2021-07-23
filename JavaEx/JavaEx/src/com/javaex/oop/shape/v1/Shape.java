package com.javaex.oop.shape.v1;


//추상클래스
//자식 클래스에게 필드와 메서드를 물려주는 역할 
//그 자체로 객체화 될 수는 없다
public abstract class Shape {
	protected int x;
	protected int y;
	
	public Shape(int x,int y) {
		this.x=x;
		this.y=y;
	}
	//추상클래스는 추상메서드가 있어야 된다.
	//상속받은 실체 클래스는 추상 메서드를 
	//반드시 구현해야만 한다.
	public abstract void draw();
	public abstract double area();
	
	
}
