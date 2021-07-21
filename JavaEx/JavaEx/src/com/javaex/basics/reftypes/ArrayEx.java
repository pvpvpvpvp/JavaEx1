package com.javaex.basics.reftypes;

import java.util.Arrays;


public class ArrayEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		defineArray();
//		multdimArray();
		
	}
	private static void multdimArray() {
		int[][] twoDim = new int[5][10];
		
		int table[][] = {
		{1,2,3,4,5,6,7,8,9,0},
		{2,3,4,5,6,7,8,9,0,1},
		{3,4,5,6,7,8,9,0,1,2},
		{4,5,6,7,8,9,0,1,2,3},
		{5,6,7,8,9,0,1,2,3,4}
		};
		
		System.out.println("table.길이 "+table.length );
		// table의 인덱스 범위: 0~table.length -1
		System.out.println("table[2].길이 "+table[2].length );
		// table[2]의 인덱스 범위: 0~table[2].length -1
		
		int sum =0;
		for(int row =0;row<table.length;row++)
		{
			for(int cow=0; cow<table[row].length;cow++)
			{
				sum += table[row][cow];
			}
		}
		
		System.out.println("총합 sum: "+sum);
	}
	private static void defineArray() {
		//선언
		
		String[] names;
		int scores[];
		
		// 일반적인 방법
		scores = new int[4];
		scores[0] =80;
		scores[1] =90;
		scores[2] =85;
		scores[3] =88;
//		scores[4] =100; // 배열의 길이보다 큰 위치에 넣기 ArrayOutOfBoundsException
		
		// 데이터 가지고 있다.
		names = new String[] {"홍길동", "임꺽정","장실산","전우치"};
		
		
		//데이터를 가지고 있고 선언과 동시에 초기화 할 때 
		float heigths[]= {175.3f, 180.5f, 190.2f,165.2f};
		
		// .length 배열의 길이
		System.out.println("name의 길이"+names.length);
	
		
		for(int i=0;i<names.length;i++)
			System.out.printf("%s (%.2f) : scores = %d%n",names[i],heigths[i],scores[i]);
		
		// 배열은 참조 타입이다.
			int scores2[]= scores;
				
				System.out.println("scores:"+Arrays.toString(scores));
				System.out.println("scores2:"+Arrays.toString(scores2));
				
				scores2[2]=100; // 참조 복사 : 객체를 복사한것이 아니고 주소만 복사
								// 			같은 객체를 참조
				System.out.println("scores:"+Arrays.toString(scores));
				System.out.println("scores2:"+Arrays.toString(scores2));
		}
		
		
		
}


