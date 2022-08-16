package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice2 {
	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = 1; i<= N; i++) {
				System.out.printf("%d ", i);
			}
		}
		
		
		
	}
	
	public void practice2() {
		// 2중 for문을 이용하여 다음 모양을 출력하세요
		
		// [출력 예시]
		// 1
		// 12
		// 123
		// 1234
		
		for(int i =1; i<=4; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	public void practice3() {
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		
//		ex.
//		정수를 하나 입력하세요 : 8
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36

		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int N = sc.nextInt();
		char op;
		int sum = 0;
		for(int i = 1; i<= N; i++) {
			sum += i;
			if(i != N) {
				op = '+';
			} else {
				op = '=';
			}
			System.out.printf("%d %c ", i, op);
		}
		System.out.printf("%d", sum);
	}
	public void practice4() {
		// 2중 for문을 이용하여 다음 모양을 출력하세요
		
		// [출력 예시]
		// 4
		// 43
		// 432
		// 4321
		
		for(int i = 4; i >= 1; i--) {
			for(int j = 4; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void practice5() {
		// 2중 for문을 이용하여 다음 모양을 출력하세요
		
		// [출력 예시]
		// 입력된 정수 : 4
		// 4321
		// 432
		// 43
		// 4
		
		for(int i = 1; i <=4; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}
	public void practice6() {
		
	}
	public void practice7() {
		
	}
	public void practice8() {
		
	}
	public void practice9() {
		
	}
	public void practice10() {
		
	}
	public void practice11() {
		
	}
	public void practice12() {
		
	}
	public void practice13() {
		
	}
}
