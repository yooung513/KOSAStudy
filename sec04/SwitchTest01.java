package sec04;

public class SwitchTest01 {
	public static void main(String[] args) {
		
		int n = 2;
		
		switch (n) {
			case 1:
			case 3: 	System.out.println("남자"); break;
			case 2:
			case 4:		System.out.println("여자"); break;
			default: 	System.out.println("에러"); break;	
		}
		
		switch (n) {
		case 1, 3: 	System.out.println("남자"); break;
		case 2, 4:	System.out.println("여자"); break;
		default: 	System.out.println("에러"); break;	
		}
		
		String cap = switch (n) {	// 자바 14버전, 스프링 4 버전 이후만 사용 가능
		case 1, 3    -> "남자";
		case 2, 4    -> "여자";
		default      -> "에러";
		};
		
	}
}
