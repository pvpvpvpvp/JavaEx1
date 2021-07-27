package com.javaex.quiz;

//import com.javaex.api.objectclass.v3.Point;

public class Recatangle implements Cloneable {
		
		int width;
		int height;
		
		public Recatangle(int width,int height) {
			this.height=height;
			this.width=width;
		}
		
		public int Mx() {
			return height*width;
		}
	

		@Override
		public boolean equals(Object obj) {  //a
			// TODO Auto-generated method stub
			// 전달받은 object가 Point 클래스의 객체?
			if(obj instanceof Recatangle) {
				Recatangle other = (Recatangle) obj;
				return height*width==other.width*other.height;
			}
			return super.equals(obj);
		}
		
		public Recatangle getClone() {
			Recatangle clone =null;
			try {
				clone = (Recatangle)clone();
			}catch (CloneNotSupportedException e) {//clone 메서드는 checked 제외
				// TODO: handle exception
				e.printStackTrace();
			}
			return clone;
		}

		@Override
		public String toString() {
			return "Recatangle [width=" + width + ", height=" + height + "]";
		}
		
		
		
		
		
	}

