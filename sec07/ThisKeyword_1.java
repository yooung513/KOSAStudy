package sec07;

class A_05 {
	int m;
	int n; 
	
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;			// this.를 생략했을 때 자동으로 추가됨
		this.n = b;
	}
	
	void work() {
		this.init(2, 3);	// this.를 생략했을 때 자동으로 추가됨
	}
}


public class ThisKeyword_1 {
	public static void main(String[] args) {
		// 클래스 객체 생성
		A_05 a = new A_05();
		
		// 메서드 호출 / 필드값 활용
		a.work();
		System.out.println(a.m);
	}
}
