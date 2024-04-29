package sec05;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		int[] n = new int[1];				// 배열은 변수와 다르게 자동으로 초기화가 되어있음
		System.out.println(n[0]);
		
		double[] d = new double[1];
		System.out.println(d[0]);
		
		boolean[] b = new boolean[1];
		System.out.println(b[0]);
		
		String[] s = new String[1]; 		// 참조형 배열은 모두 null로 초기화
		System.out.println(s[0]);
		
		int[][] n2 = new int[3][];			// 뒷 부분 생략 가능
//		int[][] n3 = new int[][1];			// 앞은 생략 불가능
		
	}
}
