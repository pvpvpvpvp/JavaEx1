package com.javaex.api.collection.list;

import java.util.*;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>();  //교체 가능성

		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");

		System.out.println(lst);
		lst.add("Java");

		System.out.println(lst);
		lst.add(3, "C#"); // LinkedList에는 lndex가 없지만 구현방식 때문에 된다는?

		System.out.println(lst);

		System.out.println("size" + lst.size());

		lst.remove(3);
		System.out.println("remove" + lst);
		lst.remove("Python");
		System.out.println("remove" + lst);

		// 반복자 list에서는 Iterator

		Iterator<String> iter = lst.iterator();

		while (iter.hasNext()) {// 뒤에 남은 요소 있?
			String string = (String) iter.next();
			System.out.print(string + " ");
		}
		System.out.println();
		
		lst.clear();
		System.out.println(lst);
		
		
		

	}

}
