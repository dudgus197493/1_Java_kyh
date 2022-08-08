package edu.kh.op.ex;

public class OperatorExample2 {

	public static void main(String[] args) {
		// 증감 연산자 : ++, --
		// 피연산자의 값에 1을 더하거나 빼는 연산자로 위치에 따라 결과 값이 다르게 나타남
		// 1. 전위 연산(++a , --a) : 먼저 연산 후 다른 연산 실행
		// -> a를 먼저 1 증가/감소 시키고 다른 연산을 수행
		{
			int a = 10;
			int b = ++a;									// a를 10 -> 11로 증가 시킨후 b에 대입
			
			System.out.println("###### int b = ++a ######");
			System.out.printf("a : %d\nb : %d\n", a, b);	// 11, 11
			
		}
		
		// 2. 후위 연산(a++, a--) : 다른 연산 우선 실행 후 연산
		// -> 다른 연산 먼저 다 수행 후 a를 1 증가/감소 시킴
		{
			int a = 10;
			int b = a++;									// b에 a의 값 10을 대입 시킨 후 a를 10 -> 11로 증가시킴
			
			System.out.println("###### int b = a++ ######");
			System.out.printf("a : %d\nb : %d\n", a, b);	// 11, 10
		}
		
		// 연습 문제
		{
			System.out.println("##### 연습 문제 #####");
			int a = 3;
			int b = 5;
			int c = a++ + --b;
			
			// 최종적으로 a,b,c 는 각각 얼마인가?
			// 풀이
			// c = 3++(a) + --5(b);
			// c = 3++(a) + 4(b);
			// c = 7;
			
			// a = 4
			// b = 4
			// c = 7
			
			System.out.printf("a : %d\nb : %d\nc : %d", a, b, c);
		}
	}

}
