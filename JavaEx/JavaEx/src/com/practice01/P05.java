package com.practice01;
import java.util.Scanner;


		
public class P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int[] tt = new int[5];
		for(int i=0;i<5;i++) {
			System.out.print("숫자:");
			tt[i]=sc.nextInt();
		}
		int max=0;
		int un=0;
		for(int j=0;j<5;j++) {
			if(tt[j]>max)
			{
				max=tt[j];
			}
		}
		int change=0;
		for(int dd=1;dd<5;dd++)//배열정렬
		{
			for(int cc=0;cc<dd;cc++)
			{
				if(tt[dd]>tt[cc]) { //tt[dd] >tt[cc] 라면 서로 값을 변경시켜준다.
					change=tt[dd];
					tt[dd]=tt[cc];
					tt[cc]=change;
				}
			}
		}
		System.out.println("최대값은 "+max+"입니다");
		System.out.println("나열"+tt[0]+tt[1]+tt[2]+tt[3]+tt[4]);
		System.out.println("2번째 큰값 : "+tt[1]);
		
		

	}

}
