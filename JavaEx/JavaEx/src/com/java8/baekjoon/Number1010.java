package com.java8.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Number1010{//다이내믹 프로그래밍 사용해야됨 : 미리계산하고 경우를 계산하고 결과면 불러오기
    public static void main(String[] agrs) throws NumberFormatException, IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
    	int c = Integer.parseInt(br.readLine());
		int[][] a = new int[2][c];
		int[][] res= new int[30][30];
		for(int nMax = 0;nMax < 30;nMax++)
		{
			for(int MMax = 0;MMax < 30;MMax++)
			{
				if(nMax==MMax||MMax==0||nMax==0)
				{
					res[nMax][MMax]=1;
				}else
					res[nMax][MMax]=res[nMax-1][MMax-1]+res[nMax][MMax-1];
			}
		}
		for (int i = 0; i < c; i++) {
			StringTokenizer str= new StringTokenizer(br.readLine());
			a[0][i] = Integer.parseInt(str.nextToken());
			a[1][i] = Integer.parseInt(str.nextToken());
		}

		for(int i=0; i<c;i++)
		{
			System.out.println(res[a[0][i]][a[1][i]]);
		}
    }
}