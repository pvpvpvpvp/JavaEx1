package com.practice02;

public class P005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scoreboard[][]= {
			{80,75,90,95,78},
			{92,88,89,92,70},
			{78,80,85,86,63},
			{83,84,89,87,75},
			{89,83,93,94,78}};
		int sum=0;
		int count=0;
		for(int i=0;i<scoreboard.length;i++)
		{
			for(int j:scoreboard[i]) {
				if(j>=85)
				{
					count++;
					sum+=j;
				}			
			}
		}
		System.out.printf("배열내 85점이상 총함은 %d 이며 평균은 %.2f입니다",sum,(float)sum/count);
	}

}
