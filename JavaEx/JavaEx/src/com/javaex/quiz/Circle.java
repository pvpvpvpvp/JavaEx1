package com.javaex.quiz;

public class Circle {
	
	int x;
	int y;
	int radius;
	
	public Circle(int x,int y,int radius) {
		this.radius=radius;
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	@Override
	public boolean equals(Object obj) {  //a
		// TODO Auto-generated method stub
		// 전달받은 object가 Point 클래스의 객체?
		if(obj instanceof Circle) {
			Circle other = (Circle) obj;
			return radius==other.radius;
		}
		return super.equals(obj);
	}
	
}
