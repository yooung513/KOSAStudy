package sec03;

public class OpTest10 {
	public static void main(String[] args) {
		
		// 축약형 연산 (2) - 비트 연산
		int a = 10;			// 2진수 : 1010
		
		System.out.println(a << 2);		// 1010<<00   101000
		System.out.println(a);
		System.out.println();

		System.out.println(a = a << 2);
		System.out.println(a);
		System.out.println();
		
		System.out.println(a >> 2);		// 1010>>00   1010
		System.out.println(a);
		System.out.println();
		
		System.out.println(a >>= 2);
		System.out.println();
		
		a = 10;
		System.out.println(a >> 2);
		System.out.println(a >>> 2);
		
		a = -10;
		System.out.println(a >> 2);		// 부호비트가 유지됨
		System.out.println(a >>> 2);	// 비어있는 비트값이 0으로 채워짐 (부호비트가 변경됨)
		
	}
}
