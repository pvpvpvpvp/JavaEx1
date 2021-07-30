package com.javaex.io.charstream;

import java.io.File;
import java.util.Scanner;

public class ScannerEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "thieves.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File(filename);
		
		try {
			Scanner sc =new Scanner(file);
			String name;
			float height;
			float weight;
			
			while(sc.hasNextLine())
			{
				name = sc.next();
				height = sc.nextFloat();
				weight = sc.nextFloat();
				System.out.printf("%s, 키:%.2f, 체중:%.2f%n",name,height,weight);
				sc.nextLine();
			}
			sc.close();
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
