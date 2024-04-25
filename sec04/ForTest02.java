package sec04;

import javax.swing.plaf.FontUIResource;

public class ForTest02 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1; i<=3; i++) {
			sum += i;
		}
		System.out.print("1 ~ 3까지의 정수의 합은? ");
		System.out.println(sum);
		
		for (int j=0; j!=6;	j+=2) {		// 조건식이 false인 경우 for문 종료
			System.out.print(j+" ");
		}
		System.out.println();
		
		
		// 1부터 1000까지의 3의 배수의 합계
		int result = 0;
		for (int k=3; k<=1000; k+=3) {
			result += k;
		}
		System.out.println(result);
	}
}
