package sec09;

class D {
	int a; 
	static int b;
	
	static {	// 정적 초기화 블록
		b = 5;
		System.out.println("클래스 D가 로딩됐습니다.");
	}
	
	D() {
		a = 3;	// 인스턴스 필드의 초기화는 일반적으로 생성자에서 수행한다.
	}
}
public class StaticInitialBlock {
	// 정적 초기화 블록
	
	public static void main(String[] args) {
		System.out.println(D.b);		// 메모리가 로딩될 때 초기화 블록 실
	}
}
