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
}