package com.practice01;
import java.util.*;
public class P07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("============================");
		System.out.println("\t[숫자맞추기 게임 시작]");
		System.out.println("============================");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int i= r.nextInt(99)+1;
		String end ="";
		end: while(true)
		{
			System.out.print(">>");
		int answer= sc.nextInt();
		if(answer>i)
		{
			System.out.println("더 낮게");
		}
		else if(answer<i)
		{
			System.out.println("더 높게");
		}
		else
		{
			System.out.println("맞았습니다.");
			System.out.print("게임을 종료하시겠습니까 y/n >>");
			end = sc.next();
			if(end.charAt(0)=='y')
			{
				System.out.println("============================");
				System.out.println("\t[숫자맞추기 게임 종료]");
				System.out.println("============================");
				break end;
			}
			else30{
				i= r.nextInt(99)+1;
			}
		}
	}
}

}
