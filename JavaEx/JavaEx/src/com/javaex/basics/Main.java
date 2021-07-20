package com.javaex.basics;
import java.util.Scanner;

public class Main{//방법 1 스트링으로 받아서 각각을 인덱스로 쪼갠다음에 int로 변환해서 더해주기
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int z=0;
        String a="";
        int b=0;
        z= sc.nextInt();
        int c=a.length(); 
        while(c<z)
        {
        	a= sc.next();
        	c=a.length(); 
        }
    
        sc.close();
        for(int i=0;i<a.length();i++)
        {
        	b=b+(int)(a.charAt(i)-48);
        }
        System.out.println(b);
    }
}