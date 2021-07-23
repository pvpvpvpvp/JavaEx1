package com.javaex.oop.shape.v2;


public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rantengle r1 = new Rantengle(10,10,100,50);
		r1.draw();
		
		Circle c1 = new Circle(10, 20, 30);
		c1.draw();
		System.out.println();
		
		// 클래스르 수정하지 않고 추가기능 넣기
		Point p1 =new Point(30,40);
		p1.draw();
		
		Drawalbe[] objs = {
				r1,c1,p1,
				new Rantengle(30, 40, 20, 30),
				new Circle(100, 50, 30),
				new Point(40, 50)
		};
		//배열을 선언하고 
	
		for(Drawalbe obj:objs) {
			obj.draw();
		}
		
	}

}
