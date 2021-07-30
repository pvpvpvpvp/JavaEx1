package com.javaex.io.bytesteam;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File root = new File(rootPath);
		System.out.println(rootPath + " : " + root.exists());

		printInfo(root);

		if (!root.exists()) {// 경로가 존재하지 않으면
			root.mkdirs(); // 디렉토리 생성
		}
		// 디렉터리 내부에 파일을 생성해보기.

		File newFile = new File(rootPath + "myDile.txt");
		if (!newFile.exists()) {
			// 파일생성
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				System.err.println("파일을 만들지 못했어요");
				// TODO: handle exception
			}
		}
		printInfo(root);

		newFile.delete();

		printInfo(root); 

	}

	private static void printInfo(File f) {
		System.out.println("-----------------------");

		// 전달받은 파일 객체가 디렉토리인가?>

		if (f.isDirectory()) {// 디렉터리
			// 디렉터리 내부의 파일 목록을 받아와서 출력
			System.out.println("Directory: " + f.getName()); // 이름 불러오기
			File[] files = f.listFiles();

			// 리스트 출력
			for (File file : files) {
				System.out.print(file.isDirectory() ? "d" : "f");
				System.out.printf(" %s - %d %n", file.getName(), file.length());
			}
		} else { // 파일의 이름 출력
			System.out.println("File :" + f.getName()); // 이름 출력

		}

	}
}
