package com.book.practice04;

import java.util.Scanner;

public class P07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int total = 0;
		end: while (true) {
			System.out.println("============================");
			System.out.println("1.예금 | 2.출금 |3.잔고 | 4.종료");
			System.out.println("============================");
			System.out.print("선택>");
			int answer = sc.nextInt();
			switch (answer) {
			case 1: {
				System.out.print("예금액>");
				answer = sc.nextInt();
				total += answer;
				break;
			}
			case 2: {
				System.out.print("출금액>");
				answer = sc.nextInt();
				total -= answer;
				break;
			}
			case 3: {
				System.out.println("잔고액>" + total);
				break;
			}
			case 4: {
				System.out.println("프로그램 종료");
				break end;
			}
			default: {
				System.out.println("다시 입력해주세요");
				break;
			}
			}
		}
	}

}
