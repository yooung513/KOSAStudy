package sec07;


// 클래스의 정의
class A_07 {
	A_07() {
		System.out.println("첫 번째 생성자");
	}
	
	A_07(int a) {
		this();		// 해당 클래스 기본 생성자 호출 (단, 생성자의 첫 줄에 위치해야 함)
		System.out.println("두 번째 생성자");
	}
	
	/*
	public void method() {
		this()		// 메소드에서는 생성자 호출 불가능
	}
	*/
}


public class ThisMethod_1 {
	public static void main(String[] args) {
		// 객체 생성
		A_07 a1 = new A_07();		// 첫 번째 생성자 호출
		System.out.println();
		
		A_07 a2 = new A_07(3); 		// 두 번째 생성자 호출
	}
}
