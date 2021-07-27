package com.javaex.api.stringclass;



public class StringEx {

	public static void main(String[] args) {

//		stringBasicEx();
//		stringMethodsEx();
		stringBufferEx();
	}

	private static void stringBufferEx() {
		//String 객체는 불변자료형(immuttable)
		//StringBuffer 객체는 버퍼 기반의 가변 자료형
		StringBuffer sb = new StringBuffer("This");// 기본 버퍼(10) 가짐
		sb.append(" is pencil"); //맨뒤에 추가
		System.out.println(sb);  // 맨뒤에 삽입
		sb.insert(8, "my ");  	//insert는 중간에 나머지는 뒤로 밀어냄
		sb.replace(8, 10, "your"); //replace는 치환
		System.out.println(sb);  // 최종 toString()
		
		sb.setLength(10); //버퍼크기 강제 변경
		System.out.println(sb);
		
		String s =new StringBuffer("This")
				.append(" is pencil").insert(8, "my ")
				.replace(8, 10, "your").toString();
		
		System.out.println("메서드 체이닝: "+s);
	}
	private static void stringBasicEx() {
		String s1 = "Java"; // 리터럴
		String s2 = new String("Java");
		String s3 = "Java"; // 리터럴
		
		System.out.println("s1 == s3 ?"+(s1==s3)); //리터럴 문자열은 값이 같으면 같은 객체다.!
		System.out.println("s1 == s2 ?"+(s1==s2));
		
		String s4= new String(new char[] {'J','a','v','a'});
		System.out.println(s4);
		
		String s5= String.valueOf(Math.PI);
		System.out.println(s5);
	}
	private static void stringMethodsEx() {
		String str = "Java Programming, JavaScript programming";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		// String은 불변 객체다(내부 내용이 변경안됨)
		System.out.println(str);//즉 .to~로 원본값은 안바뀜
		
		//인덱스 관련
		
		System.out.println("문자열 길이 "+str.length());
		System.out.println("5번째 문자 출력 "+str.charAt(5));
		
		//검색관련 
		System.out.println("str contains Java "+str.concat("Java"));
		int idx = str.indexOf("Java");//처음부터 검색
		System.out.println("1st index of Java "+idx);
		idx=str.indexOf("Java", 4);
		System.out.println("2nd index of Java "+idx);
		idx=str.indexOf("Java", idx+4);
		System.out.println("3nd index of Java "+idx);
		// 더 이상 검색어가 없으면 -1을 리턴
		
		idx = str.lastIndexOf("Java");
		
		System.out.println("역방향 검색 "+idx);
		
		//문자열 추출
		System.out.println("substring 5 ~ :"+str.substring(5));
		System.out.println("substring 5~16 :"+str.substring(5, 16));
		
		//치환 
		System.out.println(str.replace("Java", "C"));
		System.out.println(str.replace(" ", ""));
		
		//화이트 스페이스
		String s2 = "                 Hello                      ";
		String s3 =", Java";
		
		System.out.println(s2+s3);
		System.out.println(s2.trim()+s3);// trim() -> 앞뒤 공백문자 제거
		
		// 구분자로 분절
		String[] split = str.split(" ");
		
		for(String word:split) {
			System.out.println(word);
		}
		
		String[] strT=str.toUpperCase().replace(",", "").split(" ");//정제하기 
		
		for(String word:strT) {
			System.out.println(word);
		}
		
		// 문자열 비교(중요) :Unicode의 비교
		System.out.println("ABC".compareTo("ABEABE"));
		// 0== 순번이 같다
		// <0 순서가 앞이다
		// >0 순서가 뒤다
		
		//문자 정렬 sort에 사용 가능
		
		
		
		
		
		
		
		
		
	
	}

}
