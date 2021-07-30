package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Testbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader t =null;
		
		String s=null;
		
		try {
			
			t=new BufferedReader(new InputStreamReader(System.in));
			s=t.readLine();
			System.out.println(s);
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				t.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
