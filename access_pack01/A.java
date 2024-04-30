package access_pack01;

public class A {
	public int a = 1;
	protected int b = 2;
	int c = 3;
	private int d = 4;
	
	public void print() {
		// 같은 패키지, 같은 클래스 내부
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print(c + " ");
		System.out.print(d + " ");
		System.out.println();
	}
}
