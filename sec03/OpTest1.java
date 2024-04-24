package sec03;

import java.util.Scanner;

public class OpTest1 {
	public static void main(String[] args) {
		
		// 산술연산 
		
		int a = 9;
		int b = 2;
		
		System.out.println(a + "+" + b + "=" + a+b);
		System.out.println();
		// 10+5=105로 출력 -> 문자열과 더해지는 경우 문자열로 인식됨

		// 연산의 우선순위를 부여해서 원하는 결과 값을 추출할 수 있음
		System.out.println(a + "+" + b + "=" + (a + b) );
		System.out.println(a + "-" + b + "=" + (a - b) );
		System.out.println(a + "*" + b + "=" + (a * b) );
		System.out.println(a + "/" + b + "=" + (a / b) );	// 자바에서는 정수/정수 = 정수이므로 몫을 뜻함
		System.out.println(a + "%" + b + "=" + (a % b) );
		System.out.println();
		
		
		// scanner는 예외처리를 하지 않아도 되기 때문에 입력을 스캐너로 많이 진행
		Scanner sc = new Scanner(System.in);
		System.out.print("c : ");
		int c = sc.nextInt();
		System.out.print("d : ");
		int d = sc.nextInt();
		
		System.out.println(c + "+" + d + "=" + (c + d) );
		System.out.println(c + "-" + d + "=" + (c - d) );
		System.out.println(c + "*" + d + "=" + (c * d) );
		System.out.println(c + "/" + d + "=" + (c / d) );	// 자바에서는 정수/정수 = 정수이므로 몫을 뜻함
		System.out.println(c + "%" + d + "=" + (c % d) );
		
	}
}
