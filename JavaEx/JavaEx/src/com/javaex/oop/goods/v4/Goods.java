package com.javaex.oop.goods.v4;


// v4는 this
// 객체 자신을 의미 this()는 다른 생성자를 의미
public class Goods {
	//필드선언
	private String name;
	private int  price;
	
	public Goods(String name) {
		this.name=name;
		
	}
	public Goods(String name,int price) {
		this(name);
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

