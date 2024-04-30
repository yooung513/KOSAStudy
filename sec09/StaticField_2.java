package sec09;

class B {
	int m = 3; 				// 인스턴스 필드
	static int n = 5; 		// 정적 필드
}
public class StaticField_2 {
	// 정적 필드의 공유
	
	public static void main(String[] args) {
		B b1 = new B(); 
		B b2 = new B(); 
		
		// 인스턴스 필드
		b1.m = 5;
		b2.m = 6;
		System.out.println(b1.m);
		System.out.println(b2.m);
		
		
		// 정적 필드
		b1.n = 7;
		b2.n = 8;
		System.out.println(b1.n);
		System.out.println(b2.n);
		
		B.n = 9;
		System.out.println(b1.n);
		System.out.println(b2.n);
	}
}
