package com.javaex.stack;

import java.util.Map;
import java.util.*;
public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, ClassRoom> map = new Hashtable<>();
		
		map.put("101", new ClassRoom("Java","R101"));
		map.put("201", new ClassRoom("C","R201"));
		map.put("301", new ClassRoom("Python","R301"));
		map.put("201", new ClassRoom("Linux","R201")); // 데이터의 변경
		//순서가 없다 중복되지 않아서 4번째 리눅스가  C를 덮어쓴다.
		System.out.println(map);
		
		
		System.out.println("301:"+map.get("301"));
		
		System.out.println("301키 있는가?"+ map.containsKey("301"));
		System.out.println("501키 있는가?"+ map.containsKey("501"));
		
		System.out.println(map.containsValue("Java"));
		System.out.println(map.containsValue(new ClassRoom("Java")));
	}

}
