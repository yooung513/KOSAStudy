package sec03;

import java.util.Scanner;

public class OpTest2 {
	public static void main(String[] args) {
		// 관계연산
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		System.out.println();
		
		// 관계연산에서 기준은 왼쪽
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
	}
}
