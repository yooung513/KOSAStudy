package sec04;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		
		// 0부터 9까지 3자리 숫자 맞추기 (야구게임)
		int c1, c2, c3;		// 정답이 될 숫자
		int h1, h2, h3;		// 사람이 입력할 숫자
		int count = 0;		// 숫자를 입력한 횟수
		int s, b;			// Strike, Ball (자리 및 숫자의 맞춤 여부)
		
		
		// 중복된 값이 없도록 랜덤 값 배정 -> do-while문 사용
		c1 = (int) (Math.random() * 10);
		do {
			c2 = (int) (Math.random() * 10);
		} while (c1 == c2);
		do {
			c3 = (int) (Math.random() * 10);
		} while (c1 == c3 || c2 == c3);
//		System.out.println(c1 + " " + c2 + c3);
		
		
		// 값을 입력 받음
		Scanner scanner = new Scanner(System.in);
		
		
		// s, b 판별
		do {
			s = b = 0;
			count++;
			
			System.out.print("0~9 사이의 중복되지 않은 숫자 3개를 입력 ex) 1 2 3   > ");
			
			h1 = scanner.nextInt();
			h2 = scanner.nextInt();
			h3 = scanner.nextInt();
			
			if (h1 == c1) s++;
			else if (h1 == c2 || h1 == c3) b++;
			
			if (h2 == c2) s++;
			else if (h2 == c1 || h2 == c3) b++;
			
			if (h3 == c3) s++;
			else if (h3 == c1 || h3 == c2) b++;
			
			System.out.printf("%dS %dB\n", s, b);
			
		} while(s != 3);
		
		System.out.println("축하합니다. " + count + "번만에 맞추셨습니다.");
		
	}
}
