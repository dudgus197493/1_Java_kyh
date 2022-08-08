package edu.kh.op.ex;

public class OperatorExample3 {

	public static void main(String[] args) {
		// 비교 연산자 : ==, !=, >, <, >=, <=
		// 두 개의 피연산자의 크기를 비교할 때 쓰이며 항상 결과값은 논리 값(true, false)으로 나타남.
		// 복합 기호에서 '=' 기호가 항상 오른쪽에 붙음.
		
		// 1. a == b : a와 b가 같으면 true, 다르면 false
		// 2. a != b : a와 b가 다르면 true, 같으면 false
		// 3. a > b  : a가 b 초과면 true, 아니면 false
		// 4. a < b  : a가 b 미만이면 true, 아니면 false
		// 5. a >= b : a가 b 이상이면 true, 아니면 false;
		// 6. a <= b : a가 b 미만이면 true, 아니면 false;

		{
			int a = 10;
			int b = 20;
			
			System.out.println(a == b); 			// false
			System.out.println(a != b);				// true
			System.out.println(a < b);				// true
			System.out.println((a < b) != false);	// true
			
			System.out.println("--------------------------");
			
			System.out.println(4 % 2 == 0);			// 4를 2로 나눴을 때 나머지가 0과 같은가? (true)
			
			System.out.println( 222 % 2 == 0); 		// -> 나머지(%)가 0인 경우 == 나누어 떨어지는 경우 == x의 배수
			
			System.out.println("463984 는 짝수인가? : " + (463984 % 2 == 0));
			System.out.println("463984 는 짝수인가? : " + (463984 % 2 != 1));
			
			System.out.println("463984 는 3의 배수인가? : " + (463984 % 3 == 0)); 
			System.out.println("463984 는 4의 배수인가? : " + (463984 % 4 == 0)); 
			System.out.println("463984 는 5의 배수인가? : " + (463984 % 5 == 0)); 
			
		}
	}
}
