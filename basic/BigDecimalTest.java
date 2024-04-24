package basic;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalTest {
	public static void main(String[] args) {
		System.out.println(2 - 1.1);
		
		BigDecimal bd1 = new BigDecimal(2);
		BigDecimal bd2 = new BigDecimal(1.1);
		System.out.println(bd1.subtract(bd2));
		
		BigDecimal bd3 = new BigDecimal("2");		// 문자열로 값을 주는 것이 좋음
		BigDecimal bd4 = new BigDecimal("1.1");
		System.out.println(bd3.subtract(bd4));
		
		BigInteger bi = new BigInteger("2147483647000000000000000000000000");
		System.out.println(bi);
		
		int $i = 10;
		int _i = 10;
//		int _ = 10;				_하나만 작성하면 오류 발생
	}
}
