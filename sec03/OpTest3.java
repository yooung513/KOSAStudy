package sec03;

public class OpTest3 {
	public static void main(String[] args) {
		
		// 논리연산
		
		boolean a, b;
		a = true;
		b = false;
		
		System.out.println(a && b); 	// logical AND
		System.out.println(a || b); 	// logical OR
		System.out.println(!a);			// NOT
		System.out.println(!b);
		System.out.println(a ^ b);		// exclusive OR
		System.out.println(true ^ true);
	}
}
