package designPattern;

public class Singleton {
//	private static Singleton singleton = null; 
	private final static Singleton singleton = new Singleton(); 	// final : 상수로 값 불변
	
	private Singleton() {		// 한 곳에서만 객체를 생성할 수 있도록 private
	
	}
	
	public static Singleton getInstacne() {
//		if (singleton == null) {
//			singleton = new Singleton();
//		}
		return singleton;
	}
}
