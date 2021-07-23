package com.javaex.oop.goods.v3;


// new 키워드와 함께 초기화
public class Goods {
	//필드선언
	private String name;
	private int  price;
	
	public Goods(String name,int price) {
		setName(name);
		this.price=price;
	}
	// 생성자는 클래스명과 같과 반환값은 없다
	//getter  setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void showInfo() {
		System.out.println("상품이름"+name);
		System.out.println("가격"+price);
	}
	

}

