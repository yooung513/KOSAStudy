package sec07;

public class Point2D {		// 생성자
	
	int x;
	int y;

	
	public Point2D() { 		// 기본 생성자
//		x = 10;
//		y = 10;
		this(10, 20);		// 다른 생성자 오버로드 
		System.out.println("Point2D Constructor 수행");
	}
	
	public Point2D(int x, int y) {	// 생성자
//		super();					// Object 클래스
									// 어차피 비어있음 -> 지워도 됨
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x, y) Constructor 수행");
	}
	
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
}
