package com.javaex.stack.set;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name();
	}
	private static void name() {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java"); //중복문자열은 추가 안됨!
		
		System.out.println(hs);
		System.out.println(hs.size());
		

		System.out.println("Java 포함?:"+hs.contains("Java"));
		System.out.println("Linux 포함?:"+hs.contains("Linux"));
		
		hs.remove("C++");
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);
	}

}
