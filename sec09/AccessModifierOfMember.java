package sec09;

import access_pack01.A;
import access_pack01.B;
import access_pack02.C;
import access_pack02.D;

public class AccessModifierOfMember {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();
		b.print();
		c.print();
		d.print();
	}
}
