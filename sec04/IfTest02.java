package sec04;

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		// Scanner를 사용해서 점수를 입력
		// 0~100 사이의 정수로 입력된 점수의 grade를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력 : ");
		int score = sc.nextInt();
		
		char grade = 'F';
		
		if 		(score >= 90) grade = 'A';
		else if (score >= 80) grade = 'B';
		else if (score >= 70) grade = 'C';
		else if (score >= 60) grade = 'D';
		
		System.out.println(score + "점은 " + grade + "입니다.");
		sc.close();
	}
}
