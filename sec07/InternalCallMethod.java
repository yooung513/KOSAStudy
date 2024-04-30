package sec07;

import java.util.function.BiConsumer;

public class InternalCallMethod {
	public static void main(String[] args) {
		// 같은 클래스 안에 있는 내부 메서드 호출
		print();
		
		int a = twice(3);
		System.out.println(a);
		
		double b = sum(a, 5.8);
		System.out.println(b);
		
	}


	private static void print() {
		System.out.println("안녕");
	}
	private static int twice(int i) {
		return i * 2;
	}

	private static double sum(int m, double n) {
		return m + n;
	}

	
	
}
