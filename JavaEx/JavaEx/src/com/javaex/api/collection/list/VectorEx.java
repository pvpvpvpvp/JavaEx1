package com.javaex.api.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// 벡터 생성
		// 버퍼기만
		Vector<Integer> v = new Vector<>();// 기본 버퍼 10
		//new Vector<>(용량) 
		System.out.printf("size %d Capacity: %d %n",v.size(),v.capacity());
	
		for(int i = 1 ; i <=10; i++)
		{
			v.addElement(i);// 항목추가 -> v.addElement(Integer.valueOf(i))
			
		}
		System.out.printf("size %d Capacity: %d %n",v.size(),v.capacity());
		
		v.addElement(11);
		System.out.printf("size %d Capacity: %d %n",v.size(),v.capacity());// 버퍼 자동증가 
		
		System.out.println("v:"+v); //배열과는 다르게 잘나옴 ㄷㄷ
		
		//중간에 값을 넣기
		
		v.insertElementAt(100, 7); //7번 인덱스에 100 끼워 넣기
		System.out.println("v:"+v);
		
		// 객체 조회: 찾는 인덱스의 객체 반환
		int value = v.elementAt(7);
		System.out.println("index 7: "+value);
		System.out.println("7의 index:"+v.indexOf(7));
		System.out.println("0의 index:"+v.indexOf(0)); //없는 값의 인덱스는 -1
		
		//객체 포함여부 
		System.out.println("100을 포함? "+v.contains(100));
		
		
		//객체 삭제
		v.removeElement(100);// 객체 삭제
		System.out.println("v:"+v);
		
		v.removeElementAt(7);//인덱스 기준으로 삭제
		System.out.println("v:"+v);
		
		v.setElementAt(100, 4); //4번 인덱스를 100으로
		System.out.println("v:"+v);
		
		
		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.print(item+" ");
		}
		System.out.println();
		for(Integer item :v)
		{
			System.out.print(item+" ");
		}
		System.err.println();
		
		// Enumeration : 반복자
		Enumeration<Integer> e = v.elements(); //반복자 획득
		while (e.hasMoreElements()) { //뒤에 요소가 남아있나확인
			Integer item =e.nextElement(); //요소를 추출후 다음요소로 이동
			System.out.print(item+" ");		
		}
		System.out.println();
		
		v.clear();
		System.out.printf("size %d Capacity: %d %n",v.size(),v.capacity());
	}
}
