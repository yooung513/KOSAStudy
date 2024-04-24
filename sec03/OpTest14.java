package sec03;

public class OpTest14 {
	public static void main(String[] args) {
		
		// 자동 형변환 (묵시적 형변환)
		double d = 10;					System.out.println(d);
		float f = 2147483648L;			System.out.println(f);

		
		// 강제 형변환 (명시적 형변환)
//		int p = 3.14;			// 자동 형변환 되지 않음
		int p = (int) 3.77;		// 강제 형변환 (int 타입으로 형변환 시킴) -> 버림
		System.out.println(p);
	}
}
