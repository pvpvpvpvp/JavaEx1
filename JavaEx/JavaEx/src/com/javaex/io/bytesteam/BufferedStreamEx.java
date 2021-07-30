package com.javaex.io.bytesteam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_BufferedCopy.jpg";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream fis = null;
		OutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(target);
			// 버퍼기반 보조 스트림
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			byte[] data = new byte[10240]; // 버퍼크기!
			int size = 0; // 사이즈
			int sumsize=0;
			int countB=0;
			while ((size = bis.read(data)) != -1) // 읽을 데이터가 없을때까지
			{
				sumsize+=size; // 보내는 size의 총합
				countB++;      // bis.read(data)를 읽은 횟수 즉 보낸 버퍼의 갯수
				System.out.println("데이터길이:"+size+" 넘어가는 길이:"+data.length+" 읽은사이즈 총합:"+sumsize+" 보낼데이터의 크기:"+data.length*countB);
				
				if(sumsize<countB*data.length)
				{
					for(int i=0;i<size;i++)
					{
					bos.write(data[i]);
//					System.out.print(data[i]);
					}
					System.out.println();
					System.out.println("작동 : 마지막 data 보정 :"+size+" 크기만큼만 버퍼출력");
				}
				else
				{
					bos.write(data);
				}
			}
			System.out.println("버퍼로 파일 복사완료");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println("파일을 찾을 수 없음");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				bos.flush();
//				fis.close();
//				fos.close();
				bis.close(); //보조를 다으면 주스트림도 닫힘
				bos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
