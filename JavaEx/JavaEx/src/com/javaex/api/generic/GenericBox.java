package com.javaex.api.generic;

//제네릭 이용하기 
public class GenericBox<T> { //tpye의 줄임말 T // 데이터 타입 미정
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
}
