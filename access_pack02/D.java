package access_pack02;

import access_pack01.A;		// extend 할 때 import

public class D extends A{
	public void print() {
		// 다른 패키지, 상속 관계 
		
		// 멤버 활용
		System.out.print(a + " ");
		System.out.print(b + " ");
//		System.out.print(c + " "); 
//		System.out.print(d + " ");
	}
}
