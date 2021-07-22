package com.javaex.basics.reftypes;

import java.util.Arrays;


public class ArrayEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		defineArray();
//		multdimArray();
//		arrayCopyFor();
//		arrayCopySyetemEX();
	}
		
	}
	private static void arrayCopySyetemEX() {
		int source[] = {1,2,3};
		int target[] = new int[10];
		
		//복사
		System.arraycopy(source, 0, target, 0, source.length);
		
		System.out.println("원본:"+Arrays.toString(source));
		System.out.println("타겟:"+Arrays.toString(target));
		for(int i:source)// i의 값이 배열안에 값이랑 대치되서 나옴 즉 배열내부값을 soure[i]==i가 되는거임..
		{
			System.out.println(i+" ");
		}
	}
	
	private static void arrayCopyFor() {
		// 배열은 크기 변경 불가
		// 새 배열을 만들어서 복사
		int source[] = {1,2,3};
		int targer[] = new int[10];
		//복사
		for(int i=0;i<source.length; i++)
		{
			targer[i]= source[i];
		}
		
		//향상된 for문
		
		for(int value:source) {
			System.out.print(value+"\t");
		}
		
//		for(int i=0;i<source.length;i++)
//		{
//			System.out.print(source[i]+"\t");
//		}
		System.out.println();
		int k=0;
		for(int i:targer) {
			k++;
			if(k%2>0)
				System.out.print(i+"홀\t");
			else
				System.out.print(i+"짝\t");
		}
//		for(int i=0;i<targer.length;i++)
//		{
//			System.out.print(targer[i]+"\t");
//		}
		
		// System.arraycopy()로 배열을 복사 할 수 있다. //원본배열(복사할 이름), 시작인덱스,타겟배열(복사될 타겟),시작인덱스,복사할 깋이
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


