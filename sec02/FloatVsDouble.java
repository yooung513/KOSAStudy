package sec02;

public class FloatVsDouble {
	public static void main(String[] args) {
		
		// float의 정밀도 (대략 소수 7자리)
		float f1 = 1.0000001f;
		System.out.println(f1);				// 정상 출력
		
		float f2 = 1.00000001f;
		System.out.println(f2);				// 오차 발생
		
		
		// double의 정밀도 (대략 소수 15자리)
		double d1 = 1.000000000000001;
		System.out.println(d1);				// 정상출력
		
		double d2 = 1.0000000000000001;
		System.out.println(d2);				// 오차 발생
	}
}
