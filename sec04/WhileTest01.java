package sec04;

public class WhileTest01 {
	public static void main(String[] args) {
		
		int i = 1;
		do {
			System.out.println(i * 10 + ": 안녕하세요");
			i++;
		} while(i<=3);
		
		System.out.println("종료");
		
	}
}
