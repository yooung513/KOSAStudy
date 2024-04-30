package oop;

import java.util.Scanner;

public class Scissors {
	public static void main(String[] args) {
		
		String[] caption = {"가위", "바위", "보"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위 1, 바위 2, 보 3      입력 > ");
		
		int you = scanner.nextInt();
		int com = (int) (Math.random() * 3) + 1;
		
		System.out.println( "You : " + caption[you-1]);
		System.out.println( "Com : " + caption[com-1]);
//		System.out.println( "You : " + check(you));
//		System.out.println( "Com : " + check(com));
		
		getMessage(you, com);
		System.out.println(getMessage(you, com));
		
		scanner.close();
	}

	private static String check(int val) {
		return val == 1 ? "가위" :
			   val == 2 ? "바위" : 
			   val == 3 ? "보" : "에러";
	}
	
	private static String getMessage(int you, int com) {
		if (you == com) {
			return "무승부 입니다.";
		} else if ((you-1)%3 == com%3) {
			return "당신이 이겼습니다.";
		} else {
			return "컴퓨터가 이겼습니다.";
		}
	}
}
