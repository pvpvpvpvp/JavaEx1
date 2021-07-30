package com.javaex.problem03;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String accountNo) {
    	this.accountNo=accountNo;
    	balance=0;
    	System.out.println(accountNo+"계좌가 개설되었습니다.");
    }
    //필요한 메소드 작성
    public void deposit(int money)
    {
    	this.balance+=money;
    }
    
    public void withdraw(int money) {
    	if(balance-money>0)
    		{this.balance-=money;}
    	else
    	{
    		System.out.println("잔액이 충분하지 않습니다.");
    	}
    		
		
	}
    public void showBalance() {
    	System.out.println(balance);
		
	}
    

}
