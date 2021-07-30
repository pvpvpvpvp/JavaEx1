package com.javaex.io.bytesteam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharterStreamEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "last-leaf.txt";
	static String target = rootPath + "last-leafffff.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주스트림 구역
		Reader fr = null;
		Writer fw = null;

		// 보조 스트림
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr= new FileReader(source);
			fw= new FileWriter(target);
			
			br  =new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String line="";
			
			while((line = br.readLine())!=null) //여긴 없으면 null값이 반환
			{
			// leaf 혹은 leaves가 포함된 라인만 
				if(line.toLowerCase().contains("leaf")|| //대소문자 구별없이 가져올 수 있도로 다운캐스팅
					line.toLowerCase().contains("leaves"))
				{
					System.out.println(line);
				}
			}
			
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				bw.flush();
//				fr.close();
//				fw.close();
				br.close();
				bw.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
