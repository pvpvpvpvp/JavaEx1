package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point xy = new Point();
		
		xy.setX(10);
		xy.setY(10);
		xy.draw();
		
		Point p2 = new Point();
		p2.setX(20);
		p2.setY(30);
		p2.draw();
	}

}
