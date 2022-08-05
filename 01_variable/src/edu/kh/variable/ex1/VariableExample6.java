package edu.kh.variable.ex1;

import java.util.Scanner;	// 자바에서 미리 만들어 둔 Scanner를 얻어옴
							// -> 해당 클래스에 사용 가능
public class VariableExample6 {
	public static void main(String[] args) {
		// Scanner Class : 프로그램 실행 중 키보드 입력을 받을수 있게 함
		// 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스
		// 1. class 위에 import java.util.Scanner;  작성
		
		// 2. 얻어온 Scanner 생성
		Scanner sc = new Scanner(System.in);
		// -> sc 라는 이름으로 Scanner 사용 가능
		
		// 3. Scanner로 입력 받기
		// 정수 : sc.nextInt();
		System.out.println("입력 받은 두 정수의 합 구하기");
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt();
		// 키보드로 부터 다음 정수를 입력 받아 
		// 그 값을 input1변수에 대입
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		System.out.printf("%d + %d = %d\n", input1, input2, input1 + input2 );
		
		System.out.println("입력 받은 두 실수의 합 구하기");
		System.out.print("실수 입력1 : ");
		double input3 = sc.nextDouble();
		// 키보드로 부터 다음 실수를 입력 받아
		// 그 값을 input3변수에 대입
		System.out.print("실수 입력2 : ");
		double input4 = sc.nextDouble();
		System.out.printf("%.2f + %.2f = %.2f\n", input3, input4, input3 + input4);
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();		// sc.next()는 다음 공백 전까지 입력되는 단어 하나를 name 변수에 저장
		System.out.println(name + "님 오늘 하루도 고생하셨습니다");
		
	}
}