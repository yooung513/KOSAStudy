package sec05;

public class ArrayTest04 {
	public static void main(String[] args) {
		
		int[][][] score = 
			{	
				{
					{100, 90, 80, 70}, 
					{ 90, 80, 70, 60}, 
					{ 80, 70, 60, 50}, 
				},
				{
					{100, 100, 90, 80}, 
					{100,  90, 80, 70}, 
					{ 90,  80, 70, 60}, 
				}
			};
		
		for (int i=0; i<score.length; i++) {
			System.out.println("* " + (i+1) + "학기 *");
			System.out.println("국어\t수학\t영어\t철학\t총점\t평균");
			
			for (int x=0; x<score[i].length; x++) {
				int sum = 0;
				for (int y=0; y<score[i][x].length; y++) {
					sum += score[i][x][y];
					System.out.print(score[i][x][y] + "\t");
				}
				System.out.print(sum + "\t");
				System.out.print((double) sum/score[i][x].length + "\t");
				System.out.println();
			}
			System.out.println();
		}
		
		
	}
}
