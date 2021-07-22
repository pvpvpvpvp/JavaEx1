package com.javaex.oop.goods.v2;


//getter/settet를 사용한 내부 필드의 우회접근
public class Goods {
	private String name;
	private int  price;
	
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

