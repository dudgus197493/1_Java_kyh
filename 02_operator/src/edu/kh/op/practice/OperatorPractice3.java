package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	public static void main(String[] args) {
		// 연습 문제 3
		// 정수를 하나 입력 받아 양수/음수/0 을 구분하세요.
		
		// [실행화면]
		// 정수 입력 : 3
		// 양수 입니다.
		// 정수 입력 : -5
		// 음수 입니다.
		// 정수 입력 : 0
		// 0 입니다.

		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<3; i++) {
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			String result = input == 0 ? "0 입니다." : input > 0 ? "양수 입니다." : "음수 입니다.";
			System.out.println(result + "\n");
		}
	}

}
