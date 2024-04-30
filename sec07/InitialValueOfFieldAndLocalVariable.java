package sec07;

// 클래스 생성 (정의)
class A_01 {
	boolean m1;
	int m2; 
	double m3;
	String m4;
	
	void printFieldValue() {		// 필드 => 강제 초기화
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	
	void printLocalVariable() {
		int k;
//		System.out.println(k);		// 오류 : 지역변수의 경우 직접 초기화해야함 
	}
}


public class InitialValueOfFieldAndLocalVariable {
	public static void main(String[] args) {
		// 클래스를 활용해 객체 생성
		A_01 a = new A_01();
		
		// 객체 활용
		a.printFieldValue();
	}
}
