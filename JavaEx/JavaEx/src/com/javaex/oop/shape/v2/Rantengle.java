package com.javaex.oop.shape.v2;

//추상 클래스를 상속 받은 클래스는
//반드시 추상 메서드를 구현해야된다.
public class Rantengle extends Shape implements Drawalbe {
	//필드 
	
	protected int width;
	protected int height;
	
	public Rantengle(int x,int y,int width,int height) {
		super(x, y);
		this.width=width;
		this.height=height;
	}
	
	//추상 메서드 오바라이드 구현
	@Override
	public double area() {
		return width*height;
	}
	@Override
	public void draw() {
		System.out.printf("x= %d y= %d w=%d, h=%d area=%f 인 사각형을 그림!,%n",x,y,width,height,area());
	}
}
