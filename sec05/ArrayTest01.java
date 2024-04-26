package sec05;

import java.util.Arrays;

public class ArrayTest01 {
	public static void main(String[] args) {
		
		int[] n = new int[3];
		n[0] = 100;
		n[1] = 200;
		n[2] = 300;
		
		int len = n.length;		// 값을 꺼내서 사용하는 것을 권장
		for (int i = 0; i < len; i++) {
			System.out.println(n[i]);
		}
		
		
//		System.out.println(n[0]);
//		System.out.println(n[1]);
//		System.out.println(n[2]);
		
		
		// 선언과 동시에 초기화 하는 경우
		int[] n2 = new int[] {100, 200, 300};		// int[]에 값을 정해주면 안됨
		int[] n3 = {100, 200, 300};					// 대중적으로 사용
		int n4[] = {100, 200, 300};	
		
		
		System.out.println();
		System.out.println("===============");
		System.out.println();
		System.out.println(Arrays.toString(n));		// 배열 전체 출력
		
	}
}
