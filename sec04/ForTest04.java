package sec04;

import javax.swing.plaf.FontUIResource;

public class ForTest04 {
	public static void main(String[] args) {

		// 1부터 1000까지의 3의 배수의 합계
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 != 0) continue;
			
			sum += i;
		}
		System.out.println("1부터 100까지 3의 배수의 합계는? " + sum);
	}
}
