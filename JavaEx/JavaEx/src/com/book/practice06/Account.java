package com.book.practice06;

public class Account {
	final public int max =1000000;
	final public int min =0;
	 private int balance=0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>0&&balance<1000000)
		this.balance = balance;
	}
	
}
