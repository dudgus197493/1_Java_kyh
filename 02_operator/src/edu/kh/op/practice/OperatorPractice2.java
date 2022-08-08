package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {
		// 연습 문제 2
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		
		// ex.
		// 이름 : 홍길동
		// 학년(정수) : 3
		// 반(정수) : 4
		// 번호(정수) : 15
		// 성별(남학생/여학생) : 남학생
		// 성적(소수점 아래 둘째 자리까지) : 85.75
		// 3학년 4반 15번 홍길동 남학생의 성적은 85.75점 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수) : ");
		int cls = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int number = sc.nextInt();
		
		sc.nextLine();										// 입력 버퍼 맨 앞에 남은 엔터를 꺼내옴 -> 입력 버퍼 청소
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.nextLine();
		
		// String gender = sc.nextLine();					// 버퍼의 맨 앞에 엔터를 꺼내와서 입력을 못하고 넘어 간다.
		// ** 해결 방법 **
		// 입력버퍼 맨 앞에 있는 엔터(개행문자)를 제거
		
		// 맨 앞에 엔터(개행문자)가 남는 경우
		// -> next(), nextInt(), nextFloat(), nextDouble() 등....
		//    nextLine()을 제외한 모두
		//	  뒤에 sc.nextLine() 을 한번 더 작성
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f 입니다.", grade, cls, number, name, gender, score);
	}

}
