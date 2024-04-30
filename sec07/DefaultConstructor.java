package sec07;

class A_03 {
	int m; 
	void work() {
		System.out.println(m);
	}
	// A() {} -> 기본 생성자를 컴파일러가 자동으로 추가
}

class B {
	int m;
	void work() {
		System.out.println(m);
	}
	
	B() {		// 기본 생성자 		
	}
}

class C { 
	int m;
	void work() {
		System.out.println(m); 	// 생성자로 넘어온 값
	}
	
	C(int a) {		// 입력 매개변수를 포함하고 있는 생성자 정의
		m = a;		// 전달받은 매개 변수로 필드 초기화
					// 자동으로 기본 생성자가 생성되지 않음
	}
}


public class DefaultConstructor {
	public static void main(String[] args) {
		
		// 클래스의 객체 생성
		A_03 a = new A_03();
		B b = new B();
		C c = new C(3);
//		C c = new C();	// 오류 : 기본 생성자를 호출 할 수 없음 
		
		
		// 메소드 호출
		a.work();
		b.work();
		c.work();
	}
}
