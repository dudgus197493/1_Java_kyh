package edu.kh.variable.ex1;

public class VariableExample2 {
	public static void main(String[] args) {
		
		// 변수 선언 : 메모리에 값을 저장할 공간을 할당
		
		// 1. 논리형 변수 선언
		boolean booleanData;			
		// 논리 값(true/false)을 저장할 공간 1byte를 메모리에 할당하고,
		// 그 공간을 booleanData라고 부르겠다.
		
		// 2. 문자형 변수 선언 (
		char ch1;					// 2byte
		char ch2;
		// 3. 정수형 변수 선언 
		byte byteNum;				// 1byte
		short shortNum;				// 2byte
		// -> byte/short 는 거의 사용되지 않는 자료형
		// 	  별도의 리터럴 표기법이 없음 -> int 표기법을 같이 사용
		
		int intNum;					// 4byte
		long longNum;				// 8byte
		
		// 4. 실수형 변수 선언
		float fNum;					// 4byte
		double dNum;				// 8byte
		
		// 5. 문자열 변수 선언 
		String str;
		
		
		// 값 대입 : 선언된 변수에 값(리터럴)을 대입 하는 것
		booleanData = false;
		// boolean 자료형 변수는 true / false 만 저장할 수 있다.
		// -> boolean의 리터럴 표기법은 true / false
		
		
		byteNum = 127;
		shortNum = 1000;
		
		intNum = 1000000;
		// -> int의 리터럴 표기법은 기본적인 정수 표기법 ex) 100000
		// intNum = 10000000000; 컴파일러 오류
		// The literal 10000000000 of type int is out of range
		// -> int자료형의 범위를 넘어섰다.
		
		
		// longNum = 10000000000; 컴파일러 오류
		// 10000000000은 int 표기법이므로 int의 최대 크기를 넘어설 수 없다.
		longNum = 10000000000L;
		// -> long의 리터럴 표기법은 정수 뒤에 L 또는 l 작성.
		
		fNum = 3.14f;
		// -> float의 리터럴 표기법은 실수 뒤에 F 또는 f 작성
		dNum = 3.14;
		// -> double의 리터럴 표기법은 기본 실수 표기법
		
		ch1 = 'A';
		// -> char의 리터럴 표기법은 '' (홑따옴표)
		ch2 = 66;
		// char 자료형은 숫자-문자 형태의 문자표에서
		// 일치하는 문자나 숫자의 문자 부분만 출력

		System.out.println(booleanData);
		System.out.println(byteNum);
		System.out.println(shortNum);
		System.out.println(intNum);
		System.out.println(longNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch1);
		System.out.println(ch2);
		
		// 출력시 L, F 같은 리터럴 표기법은 생략된다.
	}
}
