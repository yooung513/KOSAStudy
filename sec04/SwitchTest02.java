package sec04;

import java.util.Scanner;

public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scanner.nextInt();
		
		char grade;
		switch (score/10) {
		case 10:
		case  9: grade = 'A'; break;
		case  8: grade = 'B'; break;
		case  7: grade = 'C'; break;
		case  6: grade = 'D'; break;
		default: grade = 'F'; break;
		}
		
		System.out.println(score + "점은 " + grade + "학점 입니다.");
		
		char grade2 = switch (score/10) {
			case 10, 9 	-> 'A';
			case 8 		-> 'B';
			case 7 		-> 'C';
			case 6 		-> 'D';
			default 	-> 'F';
		};
		
		System.out.printf("%d점은 %c학점 입니다. \n", score, grade2);
		scanner.close();
	}
}
