package sec07;

class A_04 {
	A_04() {
		System.out.println("첫 번째 생성자");
	}
	
	A_04(int a) {
		System.out.println("두 번째 생성자");
	}
	
	A_04(int a, int b) {
		System.out.println("세 번째 생성자");
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		A_04 a1 = new A_04();
		A_04 a2 = new A_04(3);
		A_04 a3 = new A_04(3, 5);
	}
}
