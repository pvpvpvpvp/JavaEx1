package com.practice01;

public class Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<10;i++)
//		{
//			for(int j=2;j<10;j++)
//			{
//				System.out.print(j+"*"+i+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
//		int i=1;
//		int j=2;
//		while(true) {		
//			while(true)
//			{
//				System.out.print(j+"*"+i+"="+i*j+"\t");
//				j++;
//				if(j>9)
//				{
//					j=2;
//					break;
//				}
//				
//			}	
//			System.out.println();
//			i++;
//			if(i>9)
//				break;
//		}
		
		int i=1;
		int j=2;
		while(i<10) {		
			while(j<10)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
				j++;
			}	
			if(j>9)//초기화는 	밖에서!
				j=2;
			System.out.println();
			i++;
	
		}
		
	}

}
