package designPattern;

public class SingletonTest {
	public static void main(String[] args) {
		/*
		Singleton s1 = new Singleton();			// public인 경우
		Singleton s2 = new Singleton();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());		// s1과 s2는 서로 다른 인스턴스임을 알 수 있음 (해시코드가 다름)
		*/
		
		Singleton s1 = Singleton.getInstacne();
		Singleton s2 = Singleton.getInstacne();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());		// s1과 s2는 같은 해시코드를 가지고 있음
	}
}
