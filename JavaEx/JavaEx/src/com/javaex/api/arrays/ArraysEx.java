package com.javaex.api.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayCopyEx();
	}
	//복사 
	private static void arrayCopyEx() {
		char[] src = "Java Programming".toUpperCase().toCharArray();
		System.out.println(Arrays
				.toString(src));
		
		//루프돌며 복사
		char[] target = new char[src.length];
		for(int i=0;i<src.length;i++)
			target[i]=src[i];
		System.out.println("루프 복사"+Arrays.toString(target));
		
		// System.arrayCopy
		target = new char[src.length];
		
		System.arraycopy(src, 0, target, 0, src.length); //원본 , 복사 시작위치(원본) , 복사대상 , 복사 시작위치(대상),복사 길이
		System.out.println(Arrays.toString(target));
		
		//    Arrays.copyOf
		target = Arrays.copyOf(src, src.length); //복사할 배열 , 길이
		System.out.println(Arrays.toString(target));
		
		// 방법4 Arrays.copyOfRange
		target=Arrays.copyOfRange(src, 5, src.length); //복사할 배열, 복사 시작위치 , 복사길이
		System.out.println(Arrays.toString(target));
	}

}
