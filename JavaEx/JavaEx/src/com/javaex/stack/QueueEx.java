package com.javaex.stack;

import java.util.*;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < 5; i++) {
			queue.offer(i);
			System.out.println("Queue : "+queue);
		}
		
		//가장 먼저 입력된 데이터 확인
		System.out.println("PEEK : "+ queue.peek());// 삭제는 안함
		System.out.println("Que : "+queue);

		while(!queue.isEmpty()) {
			System.out.println("POLL : "+queue.poll());
			System.out.println("Que : "+queue);
		}
	}

}
