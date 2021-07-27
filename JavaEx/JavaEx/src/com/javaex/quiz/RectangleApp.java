package com.javaex.quiz;

public class RectangleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recatangle r = new Recatangle(15, 10);
		Recatangle r1 = new Recatangle(10, 15);
		Recatangle r2 = r.getClone();
		System.out.println("r와 r2는 같은 넓이값을 가지고 있는가"+(r.equals(r1)));//
		
		System.out.println(r.Mx());
		
		System.out.println(r2);
		System.out.println(r);
		r2.height=100;
		System.out.println(r2);
		System.out.println(r);
		
		System.out.println("r1 == r2 ? "+(r1==r2));
		System.out.println("r1== r2 ? " +r1.equals(r2));
	}

}
