package com.javaex.oop.point.v4;

public class Point {
	
	protected int x;
	protected int y;
	//상속 받은 곳에서 접근 가능
	
	public Point(int x) {
		
	}
	public Point() {
		
	}
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
	//오버로드 기능 이름이 같아도 받는 변수가 타입이 다르면 가능 순서도 가능
	public void draw(boolean bShow) {
		String message = String.format("점 x=%d  y=%d",x,y);
		
		
		
		message += (bShow)?"그렸습니다.": "지웠습니다" ;
		System.out.println(message);
		
		
	}
	
	
}
