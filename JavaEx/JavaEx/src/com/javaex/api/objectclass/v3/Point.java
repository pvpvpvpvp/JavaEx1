package com.javaex.api.objectclass.v3;

// v3. 객체 복제 clone 기능을 이용하려면 Clonewalble 인터페이스를 구현해야한다
public class Point extends java.lang.Object implements Cloneable {//기본상태랑 같음 생략될뿐  
		 int x;
		 int y;
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
		
		//복제 객체 생성 메서드
		public Point getClone() {
			Point clone =null;
			try {
				clone = (Point)clone();
			}catch (CloneNotSupportedException e) {//clone 메서드는 checked 제외
				// TODO: handle exception
				e.printStackTrace();
			}
			return clone;
		}
}
