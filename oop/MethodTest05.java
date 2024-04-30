package oop;


public class MethodTest05 {
	public static void main(String[] args) {
		int[] n = {1};
		System.out.println("main : " + n[0]);
		
		callByRef(n);		// call By Reference : 참조에 의한 호출
		
		System.out.println("main : " + n[0]);
	}

	private static void callByRef(int[] n) {
		System.out.println("callByRef : " + n[0]);
		n[0]++;
		System.out.println("callByRef : " + n[0]);
	}
}
