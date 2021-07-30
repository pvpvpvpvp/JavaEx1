package com.javaex.problem04;

public class Book {
     private int bookNo;
     private String title;
     private String author;
     private int stateCode;
    
     public Book(int bookNo,String title,String author) {
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		this.stateCode=1;
	}
     
     public void rent() {
    	if(this.stateCode==1)
    	{
		this.stateCode=0;
		System.out.println(title+"이(가) 대여 됐습니다.");
    	}//
    	else
    	{
    		System.out.println("이미 대여 됐습니다.");
    	}
	}
	
     public void print() {
		System.out.printf("%d 책 제목 : %10s, 작가: %10s, 대여유무 %10s%n",
				bookNo,
				title,
				author,
				(stateCode==0)? "대여중":"재고있음");
	}
     
	
    
    
    
}
