package com.javaex.synchronize;

//여러 쓰레드가 공유할 객체
public class SharedMemory {
	//필드
	private int memory;

	public int getMemory() {
		return memory;
	}

	//임계 영역: 멀티쓰레드에서 단 하나의 쓰레드만 접근할 수 있는 코드 영역
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		System.out.println(Thread.currentThread().getName()+ ":"+ +this.memory);
	}
	
}
