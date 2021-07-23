package com.javaex.oop.shape.v1;

public class Circle extends Shape{

	protected double radius;
	
	public Circle(int x,int y,double radius) {
		super(x, y);
		this.radius=radius;
	}
	
	@Override
	public void draw() {
		System.out.printf("x=%d, y=%d, radius=%5.2f area= %5.9f",x,y,radius,area());
		
	}
	public double area() {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
}
