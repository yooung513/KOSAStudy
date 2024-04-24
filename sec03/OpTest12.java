package sec03;

public class OpTest12 {
	public static void main(String[] args) {
		
		// 삼항연산
		
		int n = 3;
//		System.out.println(n == 1 ? "남자" : n == 2 ? "여자" : "에러");
		
		System.out.println(				// 가독성
				n == 1 || n == 3 ? "남자" : 
				n == 2 || n == 4 ? "여자" : 
				 				   "에러"
		);
	}
}
