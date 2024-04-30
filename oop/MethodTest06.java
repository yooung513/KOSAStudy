package oop;

import java.util.Arrays;

public class MethodTest06 {
	public static void main(String[] args) {
		int[] n = {1};
		
		System.out.println("main : " + n[0]);
		
		int[] copy = new int[n.length];
		System.arraycopy(n, 0, copy, 0, n.length); 	// 복제(1)
		callByRef(copy);
		callByRef(Arrays.copyOf(n, n.length));		// 복제(2) 개체를 보냄 = 원본 불변
		
		System.out.println("main : " + n[0]);
	}

	private static void callByRef(int[] n) {
		System.out.println("callByRef : " + n[0]);
		n[0]++;
		System.out.println("callByRef : " + n[0]);
	}
}
