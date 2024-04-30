package oop;

import java.util.Scanner;

public class MethodTest02 {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {	// try-catch문을 통해 sc 자동 소멸

			System.out.println("a > "); 	int a = sc.nextInt();
			System.out.println("b > "); 	int b = sc.nextInt();
			
			System.out.println(a + "+" + b + "=" + add(a, b) );
			System.out.println(a + "-" + b + "=" + sub(a, b) );
			System.out.println(a + "*" + b + "=" + mul(a, b) );
			System.out.println(a + "/" + b + "=" + div(a, b) + "..." + mod(a, b) );
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	
	
	
	private static int add(int a, int b) {
		return a+b;
	}
	
	private static int sub(int a, int b) {
		return a-b;
	}
	
	private static int mul(int a, int b) {
		return a*b;
	}
	
	private static int div(int a, int b) {
		return a/b;
	}
	
	private static int mod(int a, int b) {
		return a%b;
	}

}
