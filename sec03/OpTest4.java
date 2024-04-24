package sec03;

public class OpTest4 {
	public static void main(String[] args) {
		int a = 10, b = 5;
		int tmp;
		
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		// exclusive OR 사용 (메모리는 절약되나 가독성은 떨어짐)
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}
}
