package com.practice02;

import java.util.Random;

public class P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int[] ran =new int[6];
		int jj=0;
		while(true) {		
			for(int i=0;i<6;i++)
			{
				ran[i]= r.nextInt(44)+1;
			}
			for(int i=0;i<6;i++)
			{
				for(int j=0;j<i;j++)
				{
					if(ran[i]==ran[j])//중복된 값이 있는지 찾기
						jj++;//검출 횟수
				}
			}
			if(jj==0){// 검출횟수가 없다면 탈출 아니라면 무한반복
				break;
				}
			else
				jj=0;// 검출결과를 초기화
		}
		for(int i:ran) {
			System.out.print(i+" ");
		}		
	}

}
