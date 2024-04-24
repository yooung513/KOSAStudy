package sec03;

import java.util.Scanner;

public class OpTest13 {
	public static void main(String[] args) {
		
		// Scanner를 이용해 정수를 입력 받아서 짝수 홀수를 판별
		
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		System.out.println(data % 2 == 0 ? "짝수" : "홀수");
		
		// (참고)
		// data % 2 == 1 로 판별하면 -15 입력 시 짝수로 판별됨
		// 값이 -때는 부호 비트까지 가지고 연산하기 때문
		// 따라서 절댓값을 data에 취해주거나 data % 2 == 0으로 판별하면 된다.
		// 절대값 : Math.abs(n)
 		
		sc.close();
	}
}
