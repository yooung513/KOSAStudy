package sec02;

public class RangeOfVariableUse {
	public static void main(String[] args) {
		
		int value1 = 3;
		{
			int value2 = 5;
			System.out.println(value1);
			System.out.println(value2);
		}
		
		System.out.println(value1);
//		System.out.println(value2); 		// 오류
		
		
		System.out.printf("%c\n", 65);
		char c = 66;
		System.out.println(c);
	}
}
