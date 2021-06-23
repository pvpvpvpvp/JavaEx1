package com.javaex.packages;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal dog1= new Dog("스누피");//
		Animal cat = new Cat("김애용");
		
		dog1.eat();
		dog1.walk();
//		dog.bark(); 기본 animal에 지정된 것만 불러오기 가능
		
		
		Dog dog2 = new Dog("마루");
		
		dog2.eat();
		dog2.walk();
		dog2.brak();

		//다운캐스닝 명시적으로 변환할 타입을 지정
		
		Dog dog3 = (Dog)dog1;
		
		((Dog)dog1).brak(); //일회성 괄화 쳐야 작동함
		
		Animal pet = new Dog("마루"); 
		
		pet.eat();
		pet.walk();
		
		pet = new Cat("첵스");
		
		pet.eat();
		pet.walk();
		// 다운 캐스팅 항상
//		실제 어떤 클래스의 인스턴스인지 확인 해야한다.
		if(pet instanceof Dog) {//비교함으로 안전코드
		((Dog)pet).brak();  //
		}
		else if (pet instanceof Cat)
		{
			((Cat)pet).mau();
		}
	}

}
