package com.javaex.api.objectclass.v2;

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
		@Override  //재 정의 두개의 값을 비교..
		public boolean equals(Object obj) {  //a
			// TODO Auto-generated method stub
			// 전달받은 object가 Point 클래스의 객체?
			if(obj instanceof Point) {
				Point other = (Point) obj;
				return x==other.x && y== other.y;
			}
			return super.equals(obj);
		}
}
