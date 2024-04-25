package sec04;

public class ForControlStatement {
	public static void main(String[] args) {
		
		// for문 기본 문법 구조
		int a;
		
		for(a = 0; a < 3; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		for(int i = 0, j = 0; i < 10; i++, j++) {
			System.out.print(i + j + " ");
		}
		System.out.println();
		
/*		
		for(int i = 0; ; i++) {
			System.out.print(i + " ");
		}
		for(;;) {
			System.out.print("무한루프");
		}
*/
		
		// 무한 루프 탈출
		for (int i = 0; ; i++) {
			
			if(i>10) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("무한 루프 탈출");

	}
}
