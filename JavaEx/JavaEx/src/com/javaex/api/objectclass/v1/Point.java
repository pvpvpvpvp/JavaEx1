package com.javaex.api.objectclass.v1;

//모든 클래스의 최상위 부모는 object이다 
public class Point extends java.lang.Object {//기본상태랑 같음 생략될뿐
		private int x;
		private int y;
		public Point(int x,int y) {
			this.x=x;
			this.y=y;
			
		}
		@Override
		public String toString() {
			// 객체 출력 포맷을 리턴
			return String.format("Point (%d, %d) %n",x,y);
			
		}
}
