package edu.kh.test;

// 한 줄 주석 : 컴파일러(번역기)가 해석하지 않는 부분

/* 범위 
 * 
 * 
 * 
 * 
 * 
 * 주석*/

// class : 자바 코드가 작성되는 영역
public class JavaTest {
	
	// main 메서드 : 자바 애플리케이션(프로그램) 실행하기 위해서 반드시 필요한 구문
	public static void main(String[] args) {
		System.out.println("println()은 한 줄 출력입니다.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println(1221 + 124234);
		
		// 변수
		// 메모리(RAM)에 값을 기록하기 위한 공간
		{
			byte var1 = 1;
			// 변수에 기록되는 값은 계속 변할 수 있다.
			var1 = 2;
			var1 = 3;
		}
		
		
	}
}


