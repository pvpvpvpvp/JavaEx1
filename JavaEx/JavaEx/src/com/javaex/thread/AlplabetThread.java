package com.javaex.thread;

// Runnable 인터페이스
public class AlplabetThread implements Runnable {

	@Override
	public void run() {
	//A-Z 출력
		for(char ch= 'A';ch<='Z';ch++)
		{
			System.out.println("Alpa :"+ch);
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}

}
