package access_pack01;

public class B {
	public void print() {
		// 같은 패키지, 다른 클래스 
		
		// 객체 생성
		A a = new A();
		
		// 멤버 활용
		System.out.print(a.a + " ");
		System.out.print(a.b + " ");
		System.out.print(a.c + " ");
//		System.out.print(a.d + " ");	// private
		System.out.println();
	}
}
