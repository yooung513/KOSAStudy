package sec04;

public class DoWhileTest01 {
	public static void main(String[] args) {
/*		
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + ": 안녕하세요");
		}
*/
		
		int i = 1;
		while(i<=3) {
			System.out.println(i * 10 + ": 안녕하세요");
			i++;
		}
		System.out.println("종료");
		
	}
}
