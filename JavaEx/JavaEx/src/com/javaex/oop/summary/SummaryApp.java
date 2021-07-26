package com.javaex.oop.summary;

public class SummaryApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human a = new Human("홍길동",30);
		Human h2 = new Theone("네오",48);
		Panda p2 = new KungfuPanda("포",30);
		Panda p1 = new Panda("프리홍콩",1);
		
		
		a.eat();  // animal의 일반
		a.say();	//animal의 추상메서드를 상속받아 오버라이드 한 메서드
		Fight(a);fly(a);
		
		p1.eat();
		p1.say();
		Fight(p1);fly(p1);
		h2.eat();
		h2.say();
		Fight(h2);fly(h2);
		
		p2.eat();
		p2.say();
		Fight(p2);fly(p2);
	}
	
	private static void fly(Animal actor) {//메서드 
		if(actor instanceof Filyable)
		{
			((Filyable)actor).fly();//다운캐스팅
		}
		else {
			System.out.printf("%s는 못날어%n",actor.name);
		}
	}
	
	private static void Fight(Animal actor) {
		// actor가 kungfuskill 인터페이스를 구현하고 있는가?
		if (actor instanceof KungfuSkill) {
			//다운캐이팅 가능 체크
			((KungfuSkill)actor).kungfu();
			
	}
		else
			System.out.printf("%s 는 못싸워%n",actor.name);
	}
	

}
