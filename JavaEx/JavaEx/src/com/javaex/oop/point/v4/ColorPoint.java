package com.javaex.oop.point.v4;

//상속 entends //point에는 기본 형태의 생성자가 없어서 에러 있
public class ColorPoint extends Point {
	
	private String color;
	public ColorPoint(int x, int y ,String color) {
		//명시적으로 부모생성자를 선택
		super(x,y);
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color =color;
		
	}
//	@Override //반드시 하기
//	public void draw() {
//		System.out.printf("색깔점 [x=%d y=%d color = %s 을 그림",
//				super.getX(), //상속 받았지만 private라 getter를 이용
//				super.getY(),
//				color);
	
	
	// 부모을 protected로 변경
	public void draw() {
		System.out.printf("색깔점 [x=%d y=%d color = %s 을 그림",
				x, //상속 받았지만 private라 getter를 이용
				y,
				color);
		
		//과제 point 클래스의 draw(boolean)을 오버라이드 해보기
		
	}
}
