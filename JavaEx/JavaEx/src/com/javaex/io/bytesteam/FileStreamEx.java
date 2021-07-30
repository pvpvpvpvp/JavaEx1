package com.javaex.io.bytesteam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_copy.jpg";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is =null;
		OutputStream os =null;
		
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(target);
		
			int data =0;
			while((data = is.read())!=-1) { //데이터를 하나씩 읽기어서 쓰기 반복문은 데이터가 더 이상 없을때 false
				os.write(data); //
				System.out.println(data);
			}
			System.out.println("파일을 복사했습니다.!");
			
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println("파일을 찾을 수 없습니다.");
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				os.close();
				is.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}	
	}
}
