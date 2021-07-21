package com.practice01;
import java.util.Scanner;

public class Practice01_02 {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		
		for(int j=1;j<=i;j++) {
			for(int z=0;z<j;z++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
