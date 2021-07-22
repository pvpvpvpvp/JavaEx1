package com.javaex.oop;

public class MethodEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printMessage();
		printMessage("Hello, OOP");
		double c = getSum(100, 2, 3, 4, 5, 6, 7);
		System.out.println(c);
		printSum("고정가변", 1,2,30,4,5,6,7,80,9);
	}
	
	private static void printSum(String message,double ...values) {
		System.out.println(message+" : "+getSum(values));
		
	}

	private static double getSum(double... values) {// double[] values은 배열자체 ...은 값만 생성 
		double total = 0;
		for (double value : values) {
			total += value;
		}
		return total;
	}

	private static void printMessage(String message) {
		System.out.println(message);

	}

	private static void printMessage() {
		System.out.println("Hello, OOP");
	}

}
