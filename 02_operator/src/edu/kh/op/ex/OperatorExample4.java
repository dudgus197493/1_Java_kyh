package edu.kh.op.ex;

public class OperatorExample4 {

	public static void main(String[] args) {
		// 논리 연산자 : &&(AND), ||(OR)
		// 1. &&(AND) : 둘 다 true일때만 true, 나머진 false
		// ~와, 그리고, ~이고, ~이면서, ~부터 ~까지, ~사이
		{
			int a = 101;
			// a 는 100 이상 이면서 짝수인가?
			boolean result1 = a >= 100;
			boolean result2 = a % 2 == 0;
			
			System.out.println("a는 100 이상이면서 짝수인가? : " + (result1 && result2));
			
			int b = 5;
			// b는 1부터 10사이의 정수인가?
			boolean result3 = b >= 1;				// b는 1 이상인가?
			boolean result4 = b <= 10;				// b는 10 이하인가?
			
			System.out.println("b는 1부터 10사이의 정수인가? : " + (result3 && result4));
		}
		
		
		// 2. ||(OR)  : 둘 다 false일때만 false, 나머진 true (AND의 반대)
		// 또는, ~거나, ~이거나
		{
			int a = 10;
			// a는 홀수 이거나 10을 초과한 수인가?
			System.out.print("a는 홀수 이거나 10을 초과한 수인가? : ");
			System.out.println(a % 2 == 1 || a > 10);			// false
			
			int b = 20;
			// b는 1 부터 100 사이 숫자 또는 음수인가?
			System.out.print("d는 1 부터 100 사이 숫자 또는 음수인가? : ");
			boolean result = (1 <= b && b <= 100) || b < 0; 	// true
			System.out.println(result);
			
			// 논리 부정 연산자 : !(NOT)
			// 논리 값을 부정하여 반대 값으로 변경
			System.out.println("---------------------------");
			System.out.println("!result : " + !result);			// false
		}
		// 연습 문제
		{
			System.out.println("##### 연습 문제 #####");
			int a = 3;
			boolean result = a >= 1 && a < 5;		// a는 1이상, 5미만인가?
			boolean result2 = a < 1 || a >= 5;		// a는 1미만, 5이상인가? (!result)
			
			// result와 result2 
			System.out.print("result의 반대가 result2와 같은가? : ");
			System.out.println(!result == result2); // false == false (true)
		}
	}

}
