package com.book.practice04;

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
				sum+=i;
		}
		System.out.printf("3의 배수의 합 %d",sum);
	}

}
