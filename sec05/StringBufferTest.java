package sec05;

public class StringBufferTest {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();	// 수정을 하기 위한 클래스
		sb.append("실수란 ");		printString(sb);
		sb.append("신을 ");			printString(sb);
		sb.append("용서하는 ");		printString(sb);
		sb.append("인간의 ");		printString(sb);
		sb.append("행위이다");		printString(sb);
		printString(sb);
		
		System.out.println(sb);
		
		
//		StringBuffer sb2 = "직접참조?"; 	// 불가
		StringBuffer sb2 = new StringBuffer("가능"); 	// 생성자 생성 후 참조는 가능
	}

	
	private static void printString(StringBuffer sb) {
		System.out.printf("%s: %s : %s\n", sb.length(), sb.capacity(), sb);
		// capacity 공간 확보를 통해서 문자열 수정을 가능케 한다.
		
	}
}
