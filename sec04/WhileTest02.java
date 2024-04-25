package sec04;

public class WhileTest02 {
	public static void main(String[] args) {
		
		// 1부터 1000까지 수 중에 3의 배수만 합
		int sum = 0;
		int j = 3; 
		while (j <= 1000) {
			sum += j;
			j += 3;
		}
		
		System.out.println(sum);
	}
}
