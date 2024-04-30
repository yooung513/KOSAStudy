package sec07;

public class MethodOverloading {
	public static void main(String[] args) {
		
		// 서로 다른 개수와 자료형의 파라미터 전달
		print();
		print(3);
		print(5.8);
		print(2, 5);
		
	}
	
	public static void print() {
		System.out.println("데이터가 없습니다");
	}
	
	public static void print(int x) {
		System.out.println(x);
	}
	
	public static void print(double x) {
		System.out.println(x);
	}

	/*
	public static void print(double y) {	// 변수 이름만 바꿔서 중복으로 정의할 수 없음
		System.out.println(y);
	}
	*/
	
	public static void print(int x, int y) {
		System.out.println("x : "+ x + ", y : "+ y);
	}
}
