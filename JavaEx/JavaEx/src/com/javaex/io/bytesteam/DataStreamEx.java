package com.javaex.io.bytesteam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "primives.txt";

	// DataStream 기본 데이터 타입을 저장
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Save();
		InputS();
	}

	private static void Save() {

		OutputStream fos = null;

		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream(filename); // 주스트림
			dos = new DataOutputStream(fos); // 보조 스트림

			// 출력
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);

			dos.writeUTF("고길동");
			dos.writeBoolean(false);
			dos.writeInt(38);
			dos.writeFloat(99.9f);
			System.out.println("출력완료");

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				dos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	private static void InputS() {
		InputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream(filename);
			dis = new DataInputStream(fis);
			
			for(int i=0;i<2;i++)
			{
				String s=dis.readUTF();
				boolean b=dis.readBoolean();
				int L=dis.readInt();
				float f=dis.readFloat();
				System.out.printf("%s:%b:%d:%f\n",s,b,L,f);
				//주의 출력한 순서대로 읽어와야한다.
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				dis.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
