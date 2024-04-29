package sec05;

public class StringBuildTest {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();	
		sb.append("실수란 ");		printString(sb);
		sb.append("신을 ");			printString(sb);
		sb.append("용서하는 ");		printString(sb);
		sb.append("인간의 ");		printString(sb);
		sb.append("행위이다");		printString(sb);
		printString(sb);
		
		System.out.println(sb);
		
		
//		StringBuilder sb2 = "직접참조?"; 	// 불가
		StringBuilder sb2 = new StringBuilder("가능"); 	
	}

	
	private static void printString(StringBuilder sb) {
		System.out.printf("%s: %s : %s\n", sb.length(), sb.capacity(), sb);
		// capacity 공간 확보를 통해서 문자열 수정을 가능케 한다.
		
	}
}
