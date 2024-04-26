package sec05;

public class ArrayTest03 {
	public static void main(String[] args) {
		
		int[][] score = 
			{
				{100, 90, 80, 70}, 
				{ 90, 80, 70, 60}, 
				{ 80, 70, 60, 50}, 
			};
		
		System.out.println(score[0][0]);
		System.out.println(score[2][3]);
		
		System.out.println("국어\t수학\t영어\t철학\t총점\t평균");
		for (int row=0; row<score.length; row++) {
			
			int sum = 0;
			for (int col=0; col<score[row].length; col++) {
				sum += score[row][col];
				System.out.print(score[row][col] + "\t");
				
			}
			System.out.print(sum + "\t");
			System.out.print((double) sum/score[row].length + "\t");
			System.out.println();
		}
	}
}
