package sec06;

public class PointTest02 {
	public static void main(String[] args) {
		Point3D pt = new Point3D();		// object, instance
												// GC가 메모리를 삭제할 수도 있으므로 참조
		pt.setX(100);
		pt.setY(200);
		pt.setZ(300);
		
		pt.print();
	}
}
