package oop;

public class MethodTest01 {
	public static void main(String[] args) {
		
		// * 메소드 오버로딩
		//   (Method Overloading, 메소드 중복 정의)
		// 파라미터의 타입/개수를 다르게 해 원하는 메소드를 호출하는 방식 
		
		print();
		print("다영");	// parameter, 실매개변수
		print();
	}


	// 1. no args, void return
	private static void print() {	// behavior
		System.out.println("안녕하세요~");
	}
	
	// 2. args, void return
	private static void print(String name) {	// arguments, 형식 매개변수
		System.out.println("안녕하세요~ " + name + "씨~");
	}
	
	// 3. args, value return
	// MethodTest02의 연산 함수들
	
	// 4. no args, value return 
	// MethodTest03의 주사위 함수
}
