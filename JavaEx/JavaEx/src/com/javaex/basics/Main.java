package com.javaex.basics;
import java.util.Scanner;

public class Main{//방법 1 스트링으로 받아서 각각을 인덱스로 쪼갠다음에 int로 변환해서 더해주기
    public static void main(String[] agrs){
    	Scanner sc = new Scanner(System.in); 
    	Math.random();
    	
    	int c = sc.nextInt();
		int[][] a = new int[2][c];

		for (int i = 0; i < c; i++) {
			a[0][i] = sc.nextInt();// n
			a[1][i] = sc.nextInt();// m
		}

		for(int i=0; i<c;i++)
		{
			System.out.println(BC(a[1][i],a[0][i]));
		}
    }
    public static int BC(int n,int k)
    {
    	if(n==k||k==0)
    		return 1;
    	return BC(n-1,k-1)+BC(n-1,k);
    }
}