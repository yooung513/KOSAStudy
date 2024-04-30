package oop;

import java.util.Scanner;

public class MethodTest09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("넓이를 계산할 도형은? 1.원, 2.사각형, 3.삼각형 > ");
		int shape = sc.nextInt();
		
		String[] sp = {"원", "사각형", "삼각형"};
		System.out.println(sp[shape-1] + "의 넓이를 계산합니다.");
		
		double area;
		switch (shape) {
			case 1: {
				System.out.print("반지름을 입력하세요 > ");
				int r = sc.nextInt();
				System.out.println("원의 넓이는 " + getArea(shape, r) +"입니다." );
				area = circleArea(sc);		// 스캐너를 넘겨줌 -> 하나의 장소에서만 스캐너 객체를 생성하는게 좋음
				break;
			}
			case 2: {
				System.out.print("가로 길이를 입력하세요 > ");
				int a = sc.nextInt();
				System.out.print("세로 길이를 입력하세요 > ");
				int b = sc.nextInt();
				System.out.println("사각형의 넓이는 " + getArea(shape, a, b) +"입니다." );
				area = rectangleArea(a, b);
				break;
			}
			case 3: {
				System.out.print("밑변 길이를 입력하세요 > ");
				int a = sc.nextInt();
				System.out.print("높이 길이를 입력하세요 > ");
				int b = sc.nextInt();
				System.out.println("삼각형의 넓이는 " + getArea(shape, a, b) +"입니다." );
				area = triangleArea(a, b);
				break;
			}
		
		}
		
		sc.close();
		
	}


	private static double getArea(int shape, int... nextInt) {
		double result = switch (shape) {
			case 1 -> 3.14 * nextInt[0] * nextInt[0];
			case 2 -> nextInt[0] * nextInt[1];
			case 3 -> 0.5 * nextInt[0] * nextInt[1];
			default -> throw new IllegalArgumentException("Unexpected value: " + shape);
		};
		return result;
	}
	
	private static double circleArea(Scanner sc) {
		int r = sc.nextInt();
		return r * r * Math.PI;
	}
	
	private static double rectangleArea(int w, int h) {
		return w * h;
	}
	
	private static double triangleArea(int w, int h) {
		return 0.5 * w * h;
	}
	

}
