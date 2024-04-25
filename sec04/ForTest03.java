package sec04;

import java.util.concurrent.ForkJoinTask;

import javax.imageio.event.IIOReadWarningListener;

public class ForTest03 {
	public static void main(String[] args) {
		
		int a = 10;
//		for(int a=1; a<=3; a++) {	// 하나의 메소드 안에서는 같은 이름의 변수 선언 불가
//			
//		}
		
		
		// 단 for문 내부 변수의 경우 for문이 종료되면 소멸되므로 같은 이름의 변수 사용 가능
		for(int i=1; i<=3; i++) {
			
		}
		for (int i=1; i<=3; i++) {
			
		}
		
		
		
	}
}
