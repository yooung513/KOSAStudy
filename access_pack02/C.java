package access_pack02;

import access_pack01.A;		// 객체 생성시 import

public class C {
	public void print() {
		// 다른 패키지, 상속관계가 아닌 경우
		
		A a = new A();		// 객체 생성
		
		// 멤버 활용
		System.out.println(a.a + " "); 	// public
//		System.out.println(a.b + " ");	// protected
//		System.out.println(a.c + " ");	// default
//		System.out.println(a.d + " ");	// private
	}
}
