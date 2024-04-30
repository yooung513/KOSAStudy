package sec09;

class C {
	void abc() {			// 인스턴스 메서드
		System.out.println("instance 메서드");
	}
	
	static void bcd() {		// 정적 메서드
		System.out.println("static 메서드");
	}
}

public class StaticMethod {
	// 인스턴스 메서드와 정적 메서드
	
	public static void main(String[] args) {
		// 인스턴스 메서드 활용 (객체를 생성한 후 사용 가능)
		C c1 = new C();
		c1.abc();
		
		
		// 정적 메서드 활용
		// 1. 클래스명으로 바로 접근해서 사용
		C.bcd();
		
		// 2. 객체를 생성한 후 사용 (권장하지 않음)
		C c2 = new C();
		c2.bcd();
	}
}
