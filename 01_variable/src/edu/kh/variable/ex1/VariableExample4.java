package edu.kh.variable.ex1;

public class VariableExample4 {
	public static void main(String[] args) {
		// 컴퓨터의 값 처리 원칙
		// 1. 같은 종류 자료형만 대입 가능
		// 2. 같은 종류 자료형만 계산 가능
		// 3. 계산의 결과도 같은 종류의 값이 나와야 함
		
		// 형변환 (Casting) - 값(Data)의 자료형을 바꾸는 것
		// 형변환은 왜 필요한가?
		// -> 컴퓨터의 값 처리 원칙을 위배하는 경우 이를 해결하기 위해
		
		
		// 자동 형변환
		// 자료형의 [값의 범위]가 서로 다른 두 값의 연산 시
		// [컴파일러]가 자동으로
		// [값의 범위]가 작은 자료형을 큰 자료형으로 변환
		
		// 자동 형변환 확인 1
		{
			int num1 = 10;
			long num2 = 100L;
			System.out.println("num1 + num2 = " + (num1 + num2));
		}
		
		// 자동 형변환 확인 2
		{
			int num1 = 300;
			double num2 = 1.1;
			
			// int result = num1 + num2;				// Type mismatch: cannot convert from double to int
					//   300  +  1.1 
					//   300.0 + 1.1 -> 자료형이 더 큰 num2의 자료형인 double로 자동 형변환됨
					// 	 double자료형인 num1 + num2의 결과값을 더 작은 자료형인 int형 변수에 저장을 시도하니 컴파일러 에러
			double result = num1 + num2;
			System.out.println(result);
		}
		
		// 자동 형변환 확인 3
		// char -> int 자동 형변환
		{
			int num1 = 'a';								// 대입도 연산이다.
			// int = char
			System.out.println(num1);
			
			char ch = 97;								// 형변환 에외 상황(큰->작은쪽으로 자동 형변환)
			System.out.println("ch : " + ch);
											
			char ch2 = '현';
			int result = ch2;
			System.out.println(ch2 + " Unicode Number : " + result);
			System.out.println("-----------------------------------------");
		}
		
		// 강제 형변환 - 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환
		// 강제 형변환 시 데이터 손실이 발생할 수 있음 -> 데이터의 변형, 손실을 감수하고 변형
		{
			System.out.println("*** 강제 형변환 ***");
			double temp = 3.14;
			// int result = temp;						// double -> int 자동형변환 불가 컴파일러 에러
			
			int result = (int)temp;						// 데이터 손실을 감수하고 강제 형변환
			System.out.println("result : " + result);	// 3.14 -> 3 실수를 (정수로 강제 형변환시 소숫점 이하 버림처리)
			
			int temp2 = 290;
			byte result2 = (byte)temp2;					// int -> byte 강제 형변환
			System.out.println(result2);	
		}
		
		// 강제 형변환의 다른 사용 예시
		// ** 강제 형변환은 값의 범위 관계 없이 원하는 자료형으로 변환 가능 **
		{
			int iNum1 = 1;
			int iNum2 = 2;
			System.out.println(iNum1 / iNum2);
							//   1   /   2  =  0.5
							//  int  /  int =  int
							// 컴퓨터의 값처리 원칙에서 계산의 결과도 같은 자료형의 결과가 나와야함
							// 결과값이 int형이어야 하므로 0.5 -> 0 소숫점을 버림
			System.out.println((double)iNum1 / iNum2);
							//          1.0  /  2.0 = 0.5
							//        double / int  = double
							//          -> double
							// 피연산자중 한개를 double로 강제형변환을 실시
							// 컴퓨터의 값처리 원칙에 따르면 같은 종류의 자료형만 계산 가능하므로 int형 값을 double형으로 자동형변환후 계산
			System.out.println((char)65);
			System.out.println((int)'A');
 		}
		
		// 변수의 메모리 구조
		// 지역변수는 메모리공간 중 STACK공간에 생성된다.
	}
}
