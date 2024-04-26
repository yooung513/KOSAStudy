package control;

import java.util.Scanner;

public class Scissors {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위 1, 바위 2, 보 3      입력 > ");
		
		int you = scanner.nextInt();
		int com = (int) (Math.random() * 3) + 1;
		
		System.out.println( "You : " + (you == 1 ? "가위" :
										you == 2 ? "바위" : "보") );
		System.out.println( "Com : " + (com == 1 ? "가위" :
										com == 2 ? "바위" : "보") );
		
		// 가위 바위 보 가위
		//    1   2   3   4
		if (you == com) {
			System.out.println("무승부 입니다.");
		} else if (you%3 == (com-1)%3) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else {
			System.out.println("당신이 이겼습니다.");
		}
		
		
		// 보 가위 바위 보 
		//  0   1   2   3
		if (you == com) {
			System.out.println("무승부 입니다.");
		} else if ((you-1)%3 == com%3) {
			System.out.println("당신이 이겼습니다.");
		} else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
		
		switch(you-com) {
		case -2, 1:
			System.out.println("당신의 승리입니다."); break;
			
		case -1, 2:
			System.out.println("컴퓨터의 승리입니다."); break;
			
		case 0:
			System.out.println("무승부 입니다."); break;
		}
		
		switch((you-com+3) % 3) {
		case 1:
			System.out.println("당신의 승리입니다."); break;
			
		case 2:
			System.out.println("컴퓨터의 승리입니다."); break;
			
		case 0:
			System.out.println("무승부 입니다."); break;
		}
		
		
		
		if (you == com) {
			System.out.println("비겼습니다.");
		} else if (you==1 && com==3 ||
				   you==2 && com==1 ||
				   you==3 && com==2) {
			System.out.println("you의 승리입니다.");
		} else {
			System.out.println("com의 승리입니다.");
		}
		
		
		scanner.close();
		
	}
}
