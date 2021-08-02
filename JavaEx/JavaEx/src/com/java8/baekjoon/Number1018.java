package com.java8.baekjoon;

import java.util.*;

public class Number1018 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int ac = sc.nextInt(); // 입력 줄수
		int bc = sc.nextInt(); // 입력줄에 항목개수
		char[][] board = new char[ac][bc];
		String[] addborad = new String[ac];
		int[][] countw = new int[ac][bc];
		int[][] countb = new int[ac][bc];

		for (int i = 0; i < ac; i++) {// 입력줄수
			addborad[i] = sc.next(); //nextline은 엔터가 선행으로 입력되서 행렬문제생김
		}

		for (int i = 0; i < ac; i++) {
			for (int j = 0; j < bc; j++) {
				board[i][j] = addborad[i].charAt(j);// 받은 문자열을 2차원 배열에 각 char행태로 저장
			}
		}

		for (int ii = 0; ii <= ac - 8; ii++) { 					//4중이긴한데 생각해보면 8*8형태의 판별판을 정해진 ac*bc판 위에서 움직인다고 생각하면 편함
			for (int jj = 0; jj <= bc - 8; jj++) {
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if ((i + j) % 2 == 0) {			//배열의 위치값 과 첫지점이 W일경우 변경값
							if (board[ii + i][jj + j] != 'W')
								countw[ii][jj]++;
						} else if ((i + j) % 2 == 1) {
							if (board[ii + i][jj + j] == 'W')
								countw[ii][jj]++;
						}
						if ((i + j) % 2 == 0) {			// B일 경우
							if (board[ii + i][jj + j] != 'B')
								countb[ii][jj]++;
						} else if ((i + j) % 2 == 1) {
							if (board[ii + i][jj + j] == 'B')
								countb[ii][jj]++;
						}
					}
				}
			}
		}

		int min = 999;// 64보다 큰값만 
		for (int i = 0; i < ac-7; i++) {
			for (int j = 0; j < bc-7; j++) {
//				System.out.print(":"+count[i][j]);
				if (min > countw[i][j]) {		//각 값의 작은값 찾아오기~
					min = countw[i][j];
				}
				if (min > countb[i][j]) {
					min = countb[i][j];
				}
			}
		}
		
		System.out.println(min);
//	}		System.out.println();
	}
}