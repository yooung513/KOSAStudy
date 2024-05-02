package oop7;

import java.lang.foreign.ValueLayout.OfBoolean;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		System.out.println(a1);
		System.out.println();
		
//		System.out.println(a1 instanceof Bird);		// 다운캐스팅 false
		
		
		Bird b1 = new Bird();
		System.out.println(b1);
		
		Animal a2 = b1; 		// 업캐스팅
		System.out.println(a2);
		System.out.println();
		
		if (a2 instanceof Bird) {		 // 다운 캐스팅
			Bird b2 = (Bird) a2;
			System.out.println(b2);
			
			if (b2 instanceof Condor) {
				Condor c1 = (Condor) b2;
			} else {
				System.out.println("Bird 인스턴스는 Condor로 다운캐스팅 불가");
			}
		}
		System.out.println();
		
		Duck d1 = new Duck();
		Bird b3 = d1;
		System.out.println(d1);
		
		if (b3 instanceof Condor) {
			Condor c2 = (Condor) b3;
			System.out.println(c2);
		} else {
			System.out.println("Duck 타입 인스턴스는 Condor로 다운캐스팅 불가");
		}
		System.out.println();
		
		
		Animal a3 = b3;
		System.out.println(a3);
		
		
	}
}
