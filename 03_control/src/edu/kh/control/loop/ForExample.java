package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	/* for문
	 * - 끝이 정해져 있는 경우 사용하는 반복문
	 *   (== 반복 횟수 지정되어 있는 경우)
	 *   
	 *   [작성법]
	 *   for(초기식; 조건식; 증감식){
	 *   	// 조건식이 true일 때 반복 수행할 코드
	 *   }
	 * 
	 * 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 * 조건식 : for문의 반복 여부를 지정하는 식
	 * 		  조건식이 true인 경우에 반복을 수행
	 * 		  보통 초기식에 사용된 변수를 이용해서 조건식을 작성
	 * 증감식 : for문이 끝날 때 마다 특정 값을 변화 시키는 식
	 * 
	 * */
	
	// for문 기초 사용법
	public void  ex1() {
		
		// for문 기초 사용법 1
		// 1~10 까지 반복 출력
		
		for(int i = 1; i <= 10 ;   i++) {
		// 1)초기식    ; 2,5)조건식;  4,7)증감식
			
			// 3,6) 반복 수행할 코드
			System.out.println(i+"출력");
			// 1,2,3,4 수행 후 -> 5 ~ 7 반복
		}
	}
	
	public void ex2() {
		
		// for문 기초 사용법 2
		// 5부터 12까지 1씩 증가하면서 출력
		
		for(int i = 5; i < 13; i++) {
		
			System.out.println(i + "출력");
			
		}
		
		System.out.println("---------------");
		
		// 1 부터 50까지의 모든 정수의 합
		
		int sum = 0;	// 합계 저장용 변수
		// 왜 0으로 초기화 하는가?
		// -> 0이라는 값은 더하거나 뺄 때 아무런 영향이 없어
		//    누적이 필요한 상황에서 기준점으로 사용하기 적합
		for(int i = 1; i <= 100; i++) {
			// i 값이 1~100까지 1씩 증가
			// -> 이 i 값을 sum 변수에 계속 누적
			// sum = sum + i;
			sum += i;
		}
		System.out.println("1 ~ 100까지의 합 : " + sum);
	}
	
	public void ex3() {
		
		// for 기초 사용법 3
		// 두 정수를 입력 받아
		// 두 정수 사이의 모든 정수 합을 출력
		// 단, 첫 번째 입력이 두 번째 입력 보다 작아야 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 입력2 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		for(int i = num1; i<= num2; i++) {
			sum += i;
		}
		System.out.printf("%d 부터 %d까지의 합 : %d\n", num1, num2, sum);
	}
	
	public void ex4() {
		
		// for 기초 사용법 4
		// 1부터 100까지 3씩 증가하며 출력
		
		// [출력 예제]
		// 1 4 7 10 13 16 19 22 25 ...
		
		for(int i = 1; i <= 100; i += 3) {
			
			// 1씩 증가 == i+= == i = i + 1;
			// 3씩 증가 == i += 3 == i = i + 3;
			
			System.out.print(i + " ");
		}
		
		System.out.println("========================");
		
		// 10부터 20까지 0.5씩 증가
		
//		for(int i=10; i<=20; i += 0.5) {
//			System.out.println(i + " ");
//		}
		// 결과 10 출력 무한루프
		// why?
		// 증감식 i += 0.5에서
		// int i = (int) + (double)
		// 위 과정에서 서로다른 자료형을 더하는 과정에서 자동 형변환이 일어나
		// 결과값은 double형으로 나오지만
		// 결과를 int형 변수에 넣는 과정에서 강제형변환이 일어나
		// 소숫점이 버려져 i에 무한하게 10만 대입된다.
		
		for(double i = 10.0; i <= 20.0; i += 0.5) {
			System.out.println(i + " ");
		}
		
	}
	
	public void ex5() {
		
		// for문 + char + 강제 형변환 응용
		// A ~ Z 까지 출력
		
//		for(int i = 'A' ; i <= 'Z'; i++) {
//			
//			System.out.println((char)i);
//		}
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		}
		// 작동방식
		// 증감식 i++에서
		// i++ == i = i + 1
		// (char) = (char) + (int)
		// 계산도중 char가 int로 자동형변환 하여 결과값은 int형 값
		// char형 변수에 int형 값을 대입하면서 강제형 변환이 일어남
	}
	
	public void ex6() { 	// [응용]
		
		// 10부터 1까지 1씩 감소하면서 출력
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	
	public void ex7() {		// [응용]
		
		// 입력, sum, for 응용
		// 정수 5개를 입력 받아서 합계 구하기
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
//		System.out.println("입력 1 : ");
//		int num1 = sc.nextInt();
//		System.out.println("입력 2 : ");
//		int num2 = sc.nextInt();
//		System.out.println("입력 3 : ");
//		int num3 = sc.nextInt();
//		System.out.println("입력 4 : ");
//		int num4 = sc.nextInt();
//		System.out.println("입력 5 : ");
//		int num5 = sc.nextInt();
		
		for(int i = 1; i<6; i++) {
			System.out.print("입력 "+i+" : " );
			sum += sc.nextInt();
			// 입력 버퍼에서 다음 정수를 얻어와
			// sum 변수에 누적
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void ex8() { 	// [응용]
		
	      // 정수를 몇 번 입력 받을지 먼저 입력 받고
	      // 입력된 정수의 합계를 출력
	      
	      // ex)
	      // 입력 받을 정수의 개수 : 3
	      // 입력 1 : 10
	      // 입력 2 : 20
	      // 입력 3 : 30
	      // 합계 : 60
	      
	      // ex)
	      // 입력 받을 정수의 개수 : 2
	      // 입력 1 : 10
	      // 입력 2 : 20
	      // 합계 : 30
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("입력 받을 정수의 개수 : ");
		int N = sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			System.out.printf("정수 입력 %d : ", i);
			sum += sc.nextInt();
		}
		System.out.println("합계 : " + sum);
	}
	
	public void ex9() {		// [기초]
		
		// for, %, if-else
		
		// 1부터 20까지 1씩 증가하며 출력
		// 단, 5의 배수에는 ()를 붙여서 출력
		// ex) 1 2 3 4 (5) 6 7 8 9 (10) 11 ...
		
		for(int i=1; i<21; i++) {
			if(i % 5 == 0) {
				System.out.printf("(%d) ", i);	
			} else {
				System.out.printf("%d ", i);
			}			
		}
	}
	
	public void ex9v2() {
		
		// ex9 switch 버전
		for(int i =1; i<21; i++) {
			switch (i%5) {
			case 0 :
				System.out.printf("(%d) ", i);	
				break;
			default :
				System.out.printf("%d ", i);
			}
		}
	}
	
	public void ex10() {	 // [응용]
		
		// for, if, Scanner, 논리연산지, print 메서드
		// 구구단 출력
		
		// 2 ~ 9 사이 수를 하나 입력 받아
		// 해당하는 수의 단을 출력
		// 단, 입력 받은 수가 2 ~ 9사이가 아니라면
		// "잘못 입력하셨습니다." 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 [2 ~ 9] : ");
		int dan = sc.nextInt();
		
		if(dan < 2 || dan > 9) {		// dan이 2 ~ 9 사이가 아니라면 
			// !(dan >= 2 && dan <= 9)
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
		}
		
		System.out.println("==============");
		
		// 역순 출력
		// 2 X 9 = 18
		// 2 X 8 = 18
		// 2 X 7 = 18
		// ...
		
		// 2 X 1 = 2
		
		if(dan < 2 || dan > 9) {		// dan이 2 ~ 9 사이가 아니라면 
			// !(dan >= 2 && dan <= 9)
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for (int i = 9; i > 0; i--) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
		}	
	}
	// ==============================================================================
	// ================================= [중첩 반복문] =================================
	// ==============================================================================
	
	public void ex11() {
		
		// [출력예시]
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int j =0; j<4; j++) {
			for(int i = 1; i<=5; i++) {
				System.out.print(i);
			}
			System.out.println();	// 줄 바꿈 (개행)
		}
	}
	
	public void ex12() { 	// [응용]
		// 구구단 2단부터 9단까지 모두 출력
		
		// [출력 예시]
		// 2x1=2 2x2=4 2x3=6 ...
		// 3x1=2 3x2=4 3x3=6 ...
		// 4x1=2 5x2=4 6x3=6 ...
		// ...
		// 9x1=2 9x2=4 9x3=6 ...
		
		
		
		
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%dx%d=%2d ", i, j, i*j);
				// %2d : 정수가 출려괼 칸을 2칸 확보하고 오른쪽 정렬하여 출력
			}
			System.out.println();		// 줄 바꿈
		}
	}
	
	public void ex13() {
		
		// 2중 for문을 이용하여 다음 모양을 출력하세요
		
		// [출력 예시]
		// 1
		// 12
		// 123
		// 1234
		
		for(int i = 1; i <= 4; i++) {	// 4번 반복
			
			// 1234
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();	// 줄 바꿈
		}
	}
	
	public void ex14() {
		// 2중 for문을 이용하여 다음 모양을 출력하세요
		
		// [출력 예시]
		// 4
		// 43
		// 432
		// 4321
		
		// 4번
		
		// 4321
		
//		for(int i =4; i>=1; i--) {
//			for(int j = 4; j >= i; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 4; j >= 5-i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void ex15() {
		// 2중 for문을 이용하여 다음 모양을 출력하세요
		
		// [출력 예시]
		// 입력된 정수 : 4
		// 4321
		// 432
		// 43
		// 4
		
		// 입력된 정수 : 5
		// 54321
		// 4321
		// 321
		// 21
		// 1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력된 정수 : ");
		int input = sc.nextInt();
		
		for (int i = input; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void ex16() {
		
		// 2중 for문을 이용하여 다음 모양을 출력하세요.
		
		// *
		// **
		// ***
		// ****
		// *****
		
		// row == 행(한 줄), col == 열(한 칸)
		for(int row=1; row<=5; row++) {
			for(int col=0; col<row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void ex16v2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		
	}
	
	public void ex17() {
		
		// 합계 : sum
		// 개수 : count
		
		// * count, %, for문을 이용한 검색
		
		// 1부터 20사이의 3의 배수의 개수
		int sum = 0;
		int count = 0;			// 수를 셀 때는 0부터 1씩 증가시키면서 세는 것이 보통
		
		for(int i =1; i<=20; i++) {
			switch(i % 3) {
			case 0 : 
				System.out.printf("%d ", i); 
				sum += i;	// 누적
				count++;	// 1증가
			}
		}
		System.out.printf("\ncount : %d\nsum : %d", count, sum);
	}
	
	public void ex18() {
		
		// 2중 for문과 count를 이용해서 아래 모양 출력하기
		
		// 1  2  3  4
		// 5  6  7  8
		// 9 10 11 12
		
//		for(int i = 1; i<=12; i++) {
//			System.out.printf("%2d ", i);
//			if(i % 4 == 0) {
//				System.out.println();
//			}
//		}
		
		int count = 1;
		
		for(int row=1; row<=3; row++) {
			for(int col=1; col<=4; col++) {
				System.out.printf("2d ", count++);
				// 후위 증감 연산을 이용하여
				// 출력 후 count 값을 1 증가
				
//				count++;
			}
			System.out.println();
		}
		
	}
}