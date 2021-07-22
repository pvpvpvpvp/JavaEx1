package com.javaex.basics;
import java.util.Scanner;

public class Main{//방법 1 스트링으로 받아서 각각을 인덱스로 쪼갠다음에 int로 변환해서 더해주기
    public static void main(String[] agrs){
    	Scanner sc = new Scanner(System.in);
        String s =sc.next();
        System.out.println((int)s.charAt(0));
    }
}