package com.javaex.synchronize;

public class User extends Thread{
	private SharedMemory memory;
	private int data;
	
	public User(String name,SharedMemory memory,int data) {
		super(name);
		this.memory =memory;
		this.data=data;
		
	}

	@Override
	public void run() {
		if(memory!=null) {
			memory.setMemory(data);
		}
	}
}
