package sec07;

public class AccountTest {
	public static void main(String[] args) {
		Account ac01 = new Account(1000);
		System.out.println(ac01);
		
		Account ac02 = new Account(1000);
		System.out.println(ac02);
		
		Account ac03 = new Account(1000);
		System.out.println(ac03);
		
		System.out.println(Account.money1);
//		System.out.println(Account.money2); 	// 불가
	}
}
