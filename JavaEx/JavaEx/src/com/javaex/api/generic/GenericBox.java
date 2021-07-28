package com.javaex.api.generic;

//제네릭 이용하기 

//파라미터 갯수는 제한이 없다.
// 가장 많이 사용되는 파라미터
// T : type
// R : return
// K : key
// V : value
public class GenericBox<T> { //tpye의 줄임말 T // 데이터 타입 미정
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
}
