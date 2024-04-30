package oop;

public class MethodTest04 {
	public static void main(String[] args) {
		int a = 7, b = 4; 
		int c = add(a, b);		// call by value : 값에 의한 호출
		
		System.out.println("main.a = " + a);
		System.out.println(c);
		
		String str1 = "a";
		String str2 = "b";
		System.out.println(add(str1, str2));
		System.out.println(str1);
		
	}

	
	private static String add(String str1, String str2) {
		str1 = str1 + "aabb";
		return str1+str2;
	}


	private static int add(int a, int b) {
		int c = a + b; 
		a++;
		
		System.out.println("add.a = " + a);		// add 메소드 내의 a만 증가
		return c;
	}
	
}
