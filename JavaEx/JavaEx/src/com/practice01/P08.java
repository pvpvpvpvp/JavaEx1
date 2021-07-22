package com.practice01;
import java.util.*;
public class P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int total=0;
		end: while(true)
		{
			System.out.println("============================");
			System.out.println("1.예금 | 2.출금 |3.잔고 | 4.종료");
			System.out.println("============================");
			System.out.print("선택>");
		int answer= sc.nextInt();
		if(answer==1)
		{
			System.out.print("예금액>");
			answer= sc.nextInt();
			total+=answer;
		}
		else if(answer==2)
		{
			System.out.print("출금액>");
			answer= sc.nextInt();
			total-=answer;
		}
		else if(answer==3)
		{
			System.out.println("잔고액>"+total);
		}
		else if(answer==4)
		{
			System.out.println("프로그램 종료");
			break end;
		}
		else	
		{
			System.out.println("다시 입력해주세요");
		}
	}
}

}
