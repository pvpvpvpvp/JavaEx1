package com.book.practice05;

import java.util.*;

public class P09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1,학생수 | 2,점수입력 | 3,점수리스트 | 4,분석 | 5,종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				score = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("Score[%d]> ", i);
					score[i]=sc.nextInt();
				}

			} else if (selectNo == 3) {
				for(int i=0;i<studentNum;i++)
				{
					System.out.printf("score[%d] : %d%n",i,score[i]);
				}
			} else if (selectNo == 4) {
				int max=0;
				int sum=0;
				double avg1=0.;
				double avg=0.;
				for(int i:score)
				{
					sum+=i;
					if(i>max)
						max=i;
				}
				avg1= (double)sum/studentNum;
				avg= (sum*100)/studentNum/100.0;
				System.out.println("최고 점수 : "+max);
				System.out.println("평균 점수 : "+avg);
				System.out.println(avg1);
			} else if (selectNo == 5) {
				run = false;
			}

		}

		System.out.println("프로그램 종료");
	}

}
