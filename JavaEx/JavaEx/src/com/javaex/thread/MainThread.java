package com.javaex.thread;


public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//working Thread 호출
		
		Thread thread = new DihitThread();
		thread.setName("DihitThread");
		
		// 쓰레드의 우선순위 변경
		//1-5-10 min nomal max 
		thread.setPriority(Thread.MIN_PRIORITY);
		
		thread.start();
		
		Thread thread2 = new Thread(new AlplabetThread());
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
		
		// mainThread의 흐름에 workingThread의 흐름들을 합류
		
		try {
			thread.join();
			thread2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		System.out.println("End of MainThread!");
	}

}
