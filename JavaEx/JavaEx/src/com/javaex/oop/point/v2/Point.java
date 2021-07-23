package com.javaex.oop.point.v2;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x,int y) {
		setX(x);
		setY(y);
	}
	
	public void setX(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.printf("점 %d 와 %d를 그렸습니다.%n",x,y);
	}
}
