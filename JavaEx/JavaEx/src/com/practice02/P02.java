package com.practice02;
import java.util.*;

public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total=0;
		int a[]= new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i:a) {
			total+=i;
		}
		System.out.printf("평균은 %.1f 입니다",(float)total/a.length);

	}

}
