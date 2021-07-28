package com.javaex.stack;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st =new Stack<>();
		for(int i=0;i<5;i++)
		{
			st.push(i);
			System.out.println("Stack"+st);
		}
		
		
		
		System.out.println(st.peek()); // (마지막에 입력된)데이터를 확인만 하고 지우지는 않는다
	
//		while(true) {
		while(!st.empty()){
			System.out.println("POP : "+st.pop()); //가장 마지막의 입력데이터를 추출
			System.out.println("Stack : "+st);
		}
	
	
	
	
	
	
	}

}
