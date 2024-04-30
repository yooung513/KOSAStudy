package oop;


public class MethodTest07 {
	public static void main(String[] args) {
		print(1);
		print(2, 3);
		print(4, 5, 6);
	}

	private static void print(int... i) {	// 배열처럼 인식해서 가지고오게 됨
		/*
		for (int j=0; j<i.length; j++) {
			System.out.print(i[j] + " ");
		}
		System.out.println();
		*/
		
		for (int j : i) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
}
