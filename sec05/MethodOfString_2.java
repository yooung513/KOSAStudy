package sec05;

import java.util.Arrays;

public class MethodOfString_2 {
	public static void main(String[] args) {
		
		// 문자열 수정
		// @toLowerCase(), toUpperCase()
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		
		// @Replace()
		System.out.println(str1.replace("Study", "공부"));
		
		
		// @Substring()
		System.out.println(str1.substring(0, 3));		// end-1까지 출력
		System.out.println(str1.substring(0, 4));
		
		
		// @Split()
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		String[] strArray2 = "abc/def-ghi jkl".split("/|-| ", 2);
		System.out.println(Arrays.toString(strArray));
		System.out.println(Arrays.toString(strArray2));
		
		
		// @trim()
		System.out.println("   abc   ".trim());
		System.out.println();
		
		
		
		// 문자열의 내용 비교
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("Java");
		String str5 = new String("JAVA");
		
		
		// @stack 메모리 비교 (==) : 위치 (번지) 비교
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		System.out.println();
		
		
		// @equals(), equalsIgnoreCase() : 내용 비교
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str5));
		System.out.println(str3.equalsIgnoreCase(str4));
		System.out.println(str4.equalsIgnoreCase(str5));		// 대소문자 상관없이 비교
		
		
	}
}
