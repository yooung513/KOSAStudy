package sec07;

public class EffectOfPrimaryDataArgument {
	public static void main(String[] args) {
		
		// Call By Value
		int a = 3;
		int result = twice(3);
		System.out.println(result);
		
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);			// 기본 자료형의 경우 값이 변하지 않음
	}

	private static int twice(int a) {
		a = a * 2;
		return a;
	}
}
