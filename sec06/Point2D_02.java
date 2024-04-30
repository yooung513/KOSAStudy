package sec06;

public class Point2D_02 {	// 설계도
	private int x; 
	private int y;
	
	
	// 캡슐화
	// 내부를 감추고 (private) 기능으로 사용 (get/set)
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void print() {
		System.out.println("x = " + getX());
		System.out.println("y = " + this.getY());		// this로 표시 가능
//		System.out.println("z = " + this.getZ());		// 하위클래스에서 정의했기 때문에
														// 부모클래스에서는 모름
	}
}
