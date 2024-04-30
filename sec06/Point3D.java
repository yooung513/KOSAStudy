package sec06;

public class Point3D extends Point2D_02{
	
	// 상속
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	
	@Override		// 어노테이션
	public void print() {
		super.print();		// 부모 클래스의 메소드 수행
		System.out.println("z = " + this.getZ());
	}
	
}
