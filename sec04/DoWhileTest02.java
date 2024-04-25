package sec04;

public class DoWhileTest02 {
	public static void main(String[] args) {
		
		int d1, d2;
		
		d1 = (int) (Math.random() * 6) + 1;
		do {
			d2 = (int) (Math.random() * 6) + 1;
		} while (d2 == d1);
		
		System.out.println(d1 + ", " + d2);
		System.out.println("종료");
	}
}
