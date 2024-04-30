package oop;

import java.util.Scanner;

public class MethodTest09_sol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("넓이를 계산할 도형은? 1.원, 2.사각형, 3.삼각형 > ");
		int shape = sc.nextInt();
		
		String[] sp = {"원", "사각형", "삼각형"};
		System.out.println(sp[shape-1] + "의 넓이를 계산합니다.");
		
		double area;
		switch (shape) {
			case 1: {
				area = circleArea(sc);
				System.out.println("원의 넓이는 " + area +"입니다." );
				break;
			}
			case 2: {
				area = rectangleArea(sc);
				System.out.println("사각형의 넓이는 " + area +"입니다." );
				break;
			}
			case 3: {
				area = triangleArea(sc);
				System.out.println("삼각형의 넓이는 " + area +"입니다." );
				break;
			}
		}
		
		sc.close();
		
	}


	private static double circleArea(Scanner sc) {
		System.out.print("반지름을 입력하세요 > ");
		int r = sc.nextInt();
		return r * r * Math.PI;
	}
	
	private static double rectangleArea(Scanner sc) {
		System.out.print("가로 길이를 입력하세요 > ");
		int w = sc.nextInt();
		System.out.print("세로 길이를 입력하세요 > ");
		int h = sc.nextInt();
		return w * h;
	}
	
	private static double triangleArea(Scanner sc) {
		System.out.print("밑변 길이를 입력하세요 > ");
		int w = sc.nextInt();
		System.out.print("높이 길이를 입력하세요 > ");
		int h = sc.nextInt();
		return 0.5 * w * h;
	}
	

}
