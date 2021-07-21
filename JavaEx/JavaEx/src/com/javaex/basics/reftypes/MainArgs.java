package com.javaex.basics.reftypes;

public class MainArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//args : 커맨드 라인에서 인자값으로 들어온 값이
		// 		배열로 전달된다
		System.out.printf("%d개의 인자가 전달 %n",
				args.length
				);
		
		for(int i=0;i<args.length;i++)
		{
			System.out.printf("인수 %d, %s%n",i, args[i]);
		}
	}

}
