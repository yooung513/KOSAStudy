package sec03;

public class OpTest8 {
	public static void main(String[] args) {
		
		// 후위 증가 
		
		int a = 10;
		int b = a++;	// b = a
						// a = a+1
		
		System.out.println("a: "+ a);	// 11
		System.out.println("b: "+ b);	// 10
	}
}
