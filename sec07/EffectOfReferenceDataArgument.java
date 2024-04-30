package sec07;

import java.util.Arrays;

public class EffectOfReferenceDataArgument {
	public static void main(String[] args) {
		
		// Call By Ref
		int[] array = new int[] {1, 2, 3};
		modifyData(array);
		printArray(array);
		
	}

	private static void modifyData(int[] a) {		// 참조 자료형은 값이 바뀜
		a[0] = 4; 
		a[1] = 5; 
		a[2] = 6; 
	}

	private static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
