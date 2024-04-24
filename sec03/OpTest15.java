package sec03;

public class OpTest15 {
	public static void main(String[] args) {
		
		Math.random();		// 0.0 <= x <= 0. 9999999999
		
		// 원하는 가짓수를 곱해준 후 첫 시작 값을 맞춰준다.
		int dice = (int) (Math.random() * 6) + 1 ;		// 0.0 <= x <= 5.999999999
														// 1.0 <= x <= 6.999999999
														// int 형변환 == 버림
		
		System.out.println(dice);
		
		System.out.println( (int) (Math.random() * 6) + 1 );
		System.out.println( (int) (Math.random() * 6) + 1 );
		System.out.println( (int) (Math.random() * 6) + 1 );
		System.out.println( (int) (Math.random() * 6) + 1 );
		System.out.println( (int) (Math.random() * 6) + 1 );
		System.out.println( (int) (Math.random() * 6) + 1 );
		System.out.println( (int) (Math.random() * 6) + 1 );
		System.out.println( (int) (Math.random() * 6) + 1 );
	}
}
