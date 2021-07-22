package com.practice02;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,3,4,8,9,15,19,18,20,30,33,31};
		int a=0;
		int b=0;
				
		for(int i:data)
		{
			if(i%3==0)
			{
				a+=i;
				b++;
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>"+b);
		System.out.println("주어진 배열에서 3의 배수의 합=>"+a);
	}

}
