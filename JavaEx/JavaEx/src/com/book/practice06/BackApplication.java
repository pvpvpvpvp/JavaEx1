package com.book.practice06;

import java.util.Scanner;

public class BackApplication {

	private static Account01[] accountArray = new Account01[100];
	private static Scanner sc = new Scanner(System.in);
	private static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run =true;
		
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1,계좌 생성 | 2,계좌 목록 | 3,예금 | 4,출금 | 5,종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	private static void createAccount() {
		System.out.println("----------");
		System.out.println(" 계좌 생성 ");
		System.out.println("----------");
		
		System.out.print("계좌 번호");
		String ano = sc.next();
		System.out.print("계좌주");
		String owner = sc.next();
		System.out.print("초기임금액");
		int balance = sc.nextInt();
		accountArray[i] = new Account01(ano, owner,balance);
		
		i++;
	
	}
	private static void accountList() {
		
		for(int j=0; j<i;j++)
		{
			System.out.printf("%s  %s  %d%n",accountArray[j].getAno(),accountArray[j].getOwner(),accountArray[j].getBalance());
		}
		
	}
	private static void deposit() {
		
		System.out.print("계좌 번호");
		String ano = sc.next();
		System.out.print("임금액");
		int balance = sc.nextInt();
		if(findAccount(ano)!=null) //ac 값을 반환받았을때
		{
			System.out.println("예금이 성공하였습니다. :");
			findAccount(ano).setBalance(balance+findAccount(ano).getBalance()); //기존의 금액+입력금액
		}	// accountArray[].set~ 이런식인데 배열위치는 함수로 찾음
		else
		{
			System.out.println("실패! 올바른 계좌번호를 입력하세요");
		}
		
		
	}
	private static void withdraw() {
		System.out.print("계좌 번호");
		String ano = sc.next();
		System.out.print("출금액");
		int balance = sc.nextInt();
		if(findAccount(ano)!=null)
		{
			System.out.println("출금이 성공하였습니다. :");
			findAccount(ano).setBalance(findAccount(ano).getBalance()-balance);
		}
		else
		{
			System.out.println("실패! 올바른 계좌번호를 입력하세요");
		}
		
		
	}
	private static Account01 findAccount(String ano) {
		Account01 ac =null;
		for(int j=0;j<i;j++) //현재 배열 길이 만큼 반복해서
		{
			if(ano.equals(accountArray[j].getAno())) // 배열안의 값이 완전 같은 배열을찾고
			{
				
				ac=accountArray[j]; // 그 값을 저장한다음. 
			}
		}
		return ac; //반환해줌 반환형태는 배열형태		ㅂ
	}
	
}
