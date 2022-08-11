package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
	/*
	 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요. 단, 입력한 수는 1보다 크거나 같아야 합니다. 만일
	 * 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요
	 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력하세요");
		} else {
			for(int i = 1; i<= input; i++) {
				System.out.printf("%d ", i);
			}
		}
		
		
	}
	
	public void practice2() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력하세요");
		} else {
			for(int i = input; i >= 1; i--) {
				System.out.printf("%d ", i);
			}
		}
	}
	
	public void practice3() {
		/* 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요. */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=input; i++) {
			sum += i;
			if(i == input) {
				System.out.printf("%d = ", i);
			} else {
				System.out.printf("%d + ", i);
			}
		}
		System.out.printf("%d", sum);
	}
	
	public void practice3v2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		char op;
		
		for(int i = 1; i<=input; i++) {
			sum += i;
			if(i == input) {
				op = '=';
			} else {
				op = '+';
			}
			System.out.printf("%d %c ", i, op);
		}
		System.out.printf("%d", sum);
	}
	
	public void practice4() {
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 == 0 || num2 == 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else if(num1 < num2) {
			for(int i = num1; i<= num2; i++) {
				System.out.printf("%d ", i);
			}
		} else {
			for(int i = num2; i<= num1; i++) {
				System.out.printf("%d ", i);
			}
		}
	}
	
	public void practice4v2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 == 0 || num2 == 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if(num1 > num2) {			// 먼저 입력한 숫자가 더 작으면
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			for(int i = num1; i <=num2; i++) {
				System.out.printf("%d ", i);
			}
		}
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		System.out.printf("===== %d =====\n", input);
		for(int i =1; i<10; i++) {
			System.out.printf("%d * %d = %d", input, i = input*i);
		}
		System.out.println();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input < 2 || input > 9) {
			System.out.println("2 ~ 9 사이 숫자만 입력해주세요.");
		} else {
			for(int i = input; i<10; i++) {
				System.out.printf("===== %d단 =====\n", i);
				for(int j = 1; j<10; j++) {
					System.out.printf("%d X %d = %d\n", i, j, i*j);
				}
				System.out.println();
			}			
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i<=input; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i<=input; i++) {
			for(int j = 0; j<input - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void practice9() {
		
//		다음과 같은 실행 예제를 구현하세요.
		
//		ex.
//		정수 입력 : 4
//		   *
//		  **
//		 ***
//		****
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		//input = 4;
		
		for(int i = 1; i<= input; i++) {
			
			// 내가 푼 방법
			for(int j = 0; j<input - i; j++) {		// 3 2 1	 
				System.out.print(" ");
			}
			
			// 초기식을 input으로 주고 증감식으로 감소시키는 방법
//			for(int j = input - i; j > 0; j--) {		// 3 2 1 
//				System.out.print(" ");
//			}
			
			// 초기식을 input -1로 고정하고 조건식을 증감식으로 감소시키는 방법
//			for(int j = input - 1; j >= i; j--) {		// 3 2 1 
//				System.out.print(" ");
//			}
			
			// 1 2 3 4 반복
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	// if 문을 활용한 풀이
	public void practice9v2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row<=input; row++) {
			for(int col = 1; col <= input; col++) {
				if(col <= input - row) {
					System.out.println(" ");
				} else {
					System.out.println("*");
				}
			}			
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		// 위쪽 삼각형
		for(int i=1; i<=input; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 아랫쪽 삼각형
		for(int x = 1; x <= input - 1; x++) {	// 2 
			for(int k = 0; k < input - x; k++) {			// 2 1
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	public void practice10v2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<= input*2-1; row++) {
			
			if(row < input) {
				for(int col = 1; col <= row; col++) {
					System.out.print("*");
				}
			} else {
				for(int col = input; col <= row-input; col--) {
					System.out.print("*");
				}
			}
			
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i<= input; i++) {
			for(int j = 0; j<input - i; j++) {		// 3 2 1 
				System.out.print(" ");
			}
			
			// 1 2 3 4 반복
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			
			// 0 1 2 3 반복
			for(int x = 1; x < i; x++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void practice11v2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		for(int i = 1; i <= input; i++) {
			for(int j = 0; j < input - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// for문 하나로 출력
	public void practice11v3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row <= input; row++) {
			
			for(int col = 1; col <= input * 2 -1; col++) {
				if(col <= input - row || col >= input+row) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int col = 0;
		for(int row = 1; row<=input; row++) {				// input번 반복
			if(row == 1 || row == input) {					// row이 1 또는 input일때 (첫 번째 / 마지막 줄, 칸일 때만 * 출력)
				for(col = 1; col<=input; col++) {
					System.out.print("*");
				}
			} else {
				for(col = 1; col <=input; col++) {
					if(col == 1|| col == input) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
	
	public void practice12v2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
//		if(row == 1||  row == input || col == 1 || col == input) {
//			System.out.print("*");
//		} else {
//			System.out.print(" ");
//		}
	}
	
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.printf("%d ", i);
			}
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		System.out.printf("\ncount : %d", count);
	}
	
	
	public void practice13v2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.printf("%d ", i);
				
				if(i % 2 == 0 && i % 3 == 0) {				// if 문을 따로사용하기보다 중첩하면 비교식을 좀더 효율적으로 줄일 수 있다.
					count++;
				}
			}
		}
	}
}
