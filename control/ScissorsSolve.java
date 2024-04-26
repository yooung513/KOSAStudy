package control;

import java.util.Scanner;

public class ScissorsSolve {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위 1, 바위 2, 보 3      입력 > ");
		
		int you = scanner.nextInt();
		int com = (int) (Math.random() * 3) + 1;
		
		/*
		 * 	< 예시 >
		 *  You : 가위 
		 *  Com : 보
		 *  당신의 승리입니다.
		 */
		
		int result = 0;			// 승 : y-1 / c-2 / 무: 0
		if (you > com) {
			if (you==3 && com==1) 		result = 2;
			else 						result = 1;
				
		} else if (com > you){
			if (com==3 && you==1) 		result = 1;
			else 						result = 2;
		}
		
		String msg;
		if (result == 0)			msg = "무승부 입니다.";
		else if (result == 1) 		msg = "당신의 승리입니다.";
		else 						msg = "컴퓨터의 승리입니다.";
		
		
		String yRsp;
		String cRsp;
		if 		(you == 1) 		yRsp = "가위";
		else if (you == 2) 		yRsp = "바위";
		else 					yRsp = "보";
		
		if		(com == 1) 		cRsp = "가위";
		else if (com == 2) 		cRsp = "바위";
		else 					cRsp = "보";
		
		System.out.println("You  : " + yRsp);
		System.out.println("Com  : " + cRsp);
		System.out.println("결과 : " + msg);
		
		
		scanner.close();
	}
}
