package com.book.practice04;

public class P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		int i =  (int)(Math.random()*6)+1;
		int j =  (int)(Math.random()*6)+1;
		System.out.printf("(%d,%d)%n",i,j);
		if((i+j)==5) {
			break;
		}
		}
		System.out.println("End of Code");
		
	}

}
