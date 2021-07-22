package com.practice01;
import java.util.*;
public class P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		if(a%2==0)
		{
			for(int i=0;i<=a;i=i+2)
			{
				sum+=i;
			}
		}
		else {
			for(int i=1;i<=a;i=i+2)
			{
				sum+=i;
			}
		}
		System.out.println("결과값 :"+sum);
			
			
		
	}

}
