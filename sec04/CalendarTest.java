package sec04;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();		// new 생성자 부분이 감춰져 있다고 생각하면 됨
		
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, 100);
		System.out.println( new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()) );
		
		System.out.println();
		System.out.println("======================================");
		System.out.println();
		
		
		// 달력을 만들때 가장 중요한 것 두 가지
		// 1. 1일이 며칠인지?
		// 2. 마지막 날짜까 며칠인지?
		// 	  2-1. 다음 월 구한 후 -1 해서 추출하기
		//    2-2. 함수 사용하기 (getActualMaximum)
		
		Calendar cal = Calendar.getInstance();
		cal.set(2024, 4-1, 1);				// 월은 0부터 시작하므로 -1
		System.out.println( new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()) );
		System.out.println( cal.get(Calendar.DAY_OF_WEEK) ); 		// 요일 추출
		// 일:1, 월:2, 화:3, 수:4, 목:5, 금:6, 토:7
		System.out.println( cal.getActualMaximum(Calendar.DAY_OF_MONTH)) ; 		// 가장 마지막 날 추출
		System.out.println();
		System.out.println("=======================================");
		System.out.println();
		
		
		System.out.println( new SimpleDateFormat("yyyy년 MM월").format(cal.getTime()) );
		int w = cal.get(Calendar.DAY_OF_WEEK);			// 요일
		int endDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); 	// 마지막 일
		
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		
		// 처음 시작 요일까지 공백 
		for (int week = 1; week < w; week++) {
			System.out.print("   ");
		}
		
		// 날짜 출력
		for (int d = 1, week = w; d <= endDay; d++, week++) {
			System.out.printf("%2d ", d);
//			System.out.print(d > 9 ? d + " " : " " + d + " ");
			
			if (week % 7 == 0) System.out.println();
			
		}
		
	}
}
