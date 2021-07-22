package com.javaex.oop.goods.v1;

public class GoodsApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods notebook = new Goods();
		notebook.name ="LG Gram";
		notebook.price=1700000;	
		
		Goods smartphone = new Goods();
		smartphone.name="iPhone11";
		smartphone.price=800000;
		
		System.out.printf("%s, %d원%n",notebook.name,notebook.price);
		
		System.out.printf("%s, %d원%n",smartphone.name,smartphone.price);
		
	}

}
