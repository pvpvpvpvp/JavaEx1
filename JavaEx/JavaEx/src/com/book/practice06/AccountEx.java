package com.book.practice06;

public class AccountEx {

	public static void main(String[] args) {//19번 풀이
		// TODO Auto-generated method stub
		Account ac = new Account();
		
		ac.setBalance(1000);
		System.out.println("현재 잔고: "+ac.getBalance());
		
		ac.setBalance(-100);
		System.out.println("현재 잔고: "+ac.getBalance());
		
		ac.setBalance(20000000);
		System.out.println("현재 잔고: "+ac.getBalance());
		
		ac.setBalance(300000);
		System.out.println("현재 잔고: "+ac.getBalance());
		

	}

}
