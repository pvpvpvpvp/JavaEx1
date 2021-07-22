package com.practice02;public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'T','h','i','s',' ','a',' ','p','e','n','c','i','1'};

		for(char a:c)
		{
			System.out.print(a);
		}
		System.out.println();
		for(char a:c)
		{
			if(a==32)
			{
				a=',';
			}
			System.out.print(a);
		}
		
	}

}
