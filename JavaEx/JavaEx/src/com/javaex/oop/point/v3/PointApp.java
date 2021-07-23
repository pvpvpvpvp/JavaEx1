package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point xy = new Point(10,10);
		
//		xy.setX(10);
//		xy.setY(10);
		xy.draw();
		xy.draw(true);
		xy.draw(false);
		
		Point p2 = new Point(20,30);
//		p2.setX(20);
//		p2.setY(30);
		p2.draw();
		p2.draw(true);
		p2.draw(false);
	}

}
