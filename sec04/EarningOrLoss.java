package sec04;

public class EarningOrLoss {
	public static void main(String[] args) {
		
		double seed_money = 1_000_000;
		
		for (int i=1; i<=50; i++) {			
			seed_money += seed_money/2 * 0.4;
			seed_money -= seed_money/2 * 0.3;
			
			System.out.println(i+ " : " + seed_money);
		}
		
		
	}
}
