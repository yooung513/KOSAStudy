package sec07;

import javax.management.loading.MLet;

class A_06 {
	int m;
	int n;
	void init(int n, int m) {
		m = m;			// 지역변수로 할당 -> 값 변화 없음
		n = n;
	}
}

class B_02 {
	int m; 
	int n; 
	void init(int m, int n) {
		this.m = m;		// 전역 변수(필드)에 할당
		this.n = n;
	}
}
public class ThisKeyword_2 {
	public static void main(String[] args) {
		
		// 필드명과 지역 변수명이 같고, this 키워드를 사용하지 않음
		A_06 a_06 = new A_06();
		a_06.init(2, 3);
		System.out.println(a_06.m);
		System.out.println(a_06.n);
		System.out.println();
		
		B_02 b_02 = new B_02();
		b_02.init(2, 3);
		System.out.println(b_02.m);
		System.out.println(b_02.n);
	}
}
