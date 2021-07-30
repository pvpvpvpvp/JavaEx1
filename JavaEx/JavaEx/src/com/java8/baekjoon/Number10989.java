package com.java8.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number10989 {
	public static void main(String[] args) throws IOException {

		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bs.readLine());
		StringBuilder sb = new StringBuilder();
		int[] b = new int[10001];
		for (int i = 0; i < a; i++) {
            // 해당 인덱스의 값을 1 증가
            b[Integer.parseInt(bs.readLine())] ++;
        }
		bs.close();
		for(int i = 1; i < 10001; i++){
            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
            while(b[i] > 0){
                sb.append(i).append('\n');
                b[i]--;
            }
        }
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		wr.write(sb.toString());
		wr.flush();
		wr.close();
	}
}
