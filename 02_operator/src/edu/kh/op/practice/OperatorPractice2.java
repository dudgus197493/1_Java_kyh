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
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f 입니다.", grade, cls, number, name, gender, score);
	}

}
