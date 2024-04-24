package sec03;

public class OpTest7 {
	public static void main(String[] args) {
		
		// 전위 증가 
		
		int a = 10;
		int b = ++a;	// a = a+1
						// b = a
		
		System.out.println("a: "+ a);	// 11
		System.out.println("b: "+ b);	// 11
	}
}
