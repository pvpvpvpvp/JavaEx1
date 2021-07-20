package com.javaex.basics;
import java.util.Scanner;
import java.util.Arrays;
public class java {
	public static void main(String[] agrs){
	  String word = "";
	  Scanner sc = new Scanner(System.in);
      word = sc.next();
      int[] wordcode=new int[word.length()];
      int[] ABC=new int[26];
      int[] ABCD= new int[26];
      int max=0;
      int count=0;
      for(int i=0;i<word.length();i++)
      {
    	  wordcode[i] = word.charAt(i);
      }
      for(int j=0;j<word.length();j++)
      {
    	  for(int y=0; y<ABC.length;y++)
    	  {
    		  if((y+65)==wordcode[j]) {
    			  ABC[y]+=1;
    			  ABCD[y]+=1;
    		  }
    	
    		  if((y+97)==wordcode[j]) {
    			  ABC[y]+=1;
    			  ABCD[y]+=1;
    		  }
    	    }
      }
      Arrays.sort(ABC);
      if(ABC[ABC.length-1]==ABC[ABC.length-2])
      {
    	  System.out.println("?");
      }
      else
      {
    	  for(int out=0;out<ABCD.length;out++)
    	  {
    		  if(ABCD[out]>max)
    		  {
    			  max=ABCD[out];
    			  count=out;
    		  }
    	  }
    	  
    	  System.out.println((char)(count+65));
      }
  }
}