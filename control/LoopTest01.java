package control;

public class LoopTest01 {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("종료");
		System.out.println();
		System.out.println("=========================================");
		System.out.println();
		
		// 1행 ; *을 1열까지 출력
		// 2행 ; *을 2열까지 출력 ...
		// 1행 - 5행
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
