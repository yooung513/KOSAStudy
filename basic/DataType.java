package basic;

import java.security.AccessControlContext;

public class DataType {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println("b = " + b);
		// 1비트 단위지만 1바이트가 할당되어 나머지 7비트는 낭비가 됨
		
		byte b2 = 10;
		System.out.println("b2 = " + b2);
		
		char c = '가';
		System.out.println("c = " + c);
		
		int i = 2147483647;
		System.out.println("i = " + i);
		// int 타입은 +-20억의 수를 가질 수 있음
		// i + 1 = -2147483648로 값이 도출됨 -> 오버플로우
		
		short sh = 32767;
		System.out.println("sh = " + sh);
		// int 타입의 반을 가지는 범위
		// sh = 32767+1, sh = 32768 은 out of range 발생
		
		long lo = 2_147_483_648L;
		// long 타입의 리터럴에는 L을 뒤에 붙여서 구분을 해준다.
		// 8바이트
		// java 8 이상부터 _로 단위를 끊어서 사용할 수 있다.

		float f = 3.141592f;
		System.out.println("f = " + f);
		// 메모리 공간 절약이 가능하나, 정밀도가 떨어짐
		
		double d = 3.141592;
		System.out.println("d = " + d);
		// 8바이트 실수 타입의 기본형
		
		String greeting = "안녕하세요\n";
		greeting = greeting + "반갑습니다";
		System.out.println(greeting);
		
		String greeting2 = 
				"""
				만나서 반갑습니다.
				좋은 하루 되세요.
				""";
				
		System.out.print(greeting2);
		
		System.out.println("안녕하세요. \t자바");
		System.out.println("안녕하세요.	자바");
		
	}
}
