package com.javaex.io.charstream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "thieves.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reader fr = null;
		BufferedReader br = null;
		
		try {
			fr=new FileReader(filename);
			br=new BufferedReader(fr);
			
			String theif;
			
			while((theif=br.readLine())!=null)
			{
				System.out.println(theif);
//				StringTokenizer(theif);
				StringTokenizer st = new StringTokenizer(theif,"	");
				while(st.hasMoreTokens()) //토큰이 남아있는가?
				{
					String token = st.nextToken();
					System.out.print(token+"\t");
				}
				System.out.println();
			}
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
