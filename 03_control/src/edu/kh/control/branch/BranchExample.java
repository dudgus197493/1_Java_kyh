package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	public void ex1() {
		
		// break 문 : 가장 가까운 반복문을 빠져 나간다. ()
		
		for(int i = 1; i <=10000; i++) {
			
			System.out.println(i);
			
			// i가 20일 때 반복 종료
			if(i == 20) break;
		}	
		
		System.out.println("-----------------------");
		
		
		for(int row = 1; row <= 5; row++) {
			
			for(int col = 1; col <= 30; col++) {
				System.out.printf("(%d , %d) ", row, col);
				
				if(col == 3) {
					break;
				}
			}
			
			System.out.println(); // 줄 바꿈
			
			if(row == 3) {
				break;
			}
		}
	}
	
	public void ex2() {
		
		// 0이 입력될 때 까지의 입력된 정수의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		
		while(true) {			// 조건식에 강제로 true 작성 == 무한 반복
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			sum += input;
		}
		System.out.println("합계 :" + sum);
		// Unreachable code : 도달할 수 없는 코드 -> 해석이 될 수 없다.
	}
	
	public void ex3() {
		
		// "exit@" 문자열이 입려괼 때 까지 문자열 누적하기
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		System.out.println("--- 문자열 입력 (종료 시 : exit@) ---");
		while(true) {
			String input = sc.nextLine(); 	// 한 줄 입력
			
			// 비교 연산자는 보통 기본 자료형의 값 비교만 가능하다.
			// -> String은 기본 자료형 x, 참조형 O
//			if(input == "exit@") {
//				break;
//			}
			// -> 참조형은 A.equals(B) 값을 비교할 수 있다!
			if(input.equals("exit@")) {
				break;
			}
			str += input + "\n";	// 누적하면서 줄 바꿈
		}
		System.out.println(str);
	}
	
	public void ex4() {
		
		// continue : 다음 반복으로 넘어감
		
		// 1부터 30까지 5의 배수를 제외하고 출력 (continue 사용)
		
		for(int i=1; i<=30; i++) {
			
			if(i % 5 == 0) {
				continue; // 다음 반복으로 이동(증감식 부분으로 이동)
			}
			System.out.println(i);
		}
	}
	
	public void ex5() {
		// 1 ~ 100 까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을 때 반복을 멈춤
		
		int N = 1;
		System.out.printf("%d ", N);
		while(N <= 40) {
			if(N % 5 == 0) {
				++N;
				continue;
			}
			System.out.printf("%d ", ++N);
		}
		
	}
	public void ex5v2() {
		
	}
	
	
	public void upDownGame() {
		
		// 프로그램 시작 시 1 ~ 50 사이의 임의의 수 (난수)를 하나 생성하여
		// 사용자가 몇 회 만에 맞추는지 카운트
		
		// 만약 틀렸을 경우 난수가 입력한 수 보다 크면 UP / 작으면 DOWN 출력
		
		// [출력 예시]
		// 임의의 수 30
		
		// 1번 입력 :
		// UP
		
		// 2번 입력 :
		// DOWN
		
		// 3번 입력 : 30
		// 정답 입니다! (총 입력 횟수 : 3회)
		
		// 난수 생성 : Math.random()		-> Java에서 제공해주는 난수 생성 방법
		// 0.0 <= x < 1.0      0.0 이상 1.0미만 난수 생성(double 형)
		
		int ran = (int)(Math.random() * 50 + 1); 
		System.out.println("임의의 수 : " + ran);
		// 0.0 <= x < 1.0
		// 0.0 <= x < 50.0
		// 1.0 <= x < 51.0
		// 1   <= x < 51
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		while(true) {
			System.out.printf("%d번 입력 : ", count);
			int input = sc.nextInt();
			
			if(input > ran) {
				System.out.println("Down\n");
			} else if(input < ran) {
				System.out.println("UP\n");
			} else {
				System.out.printf("정답입니다! (총 입력 횟수 : %d회)\n", ++count);
				break;
			}
			count++;
		}
	}
	public void upDownGameV2() {
		
		Scanner sc = new Scanner(System.in);
		int ran = (int)(Math.random() * 50 + 1);
		System.out.println("임의의 수 : " + ran);
		
		
		int count = 0;
		int input;
		do {	
			System.out.printf("%d번 입력 : ", count + 1);
			input = sc.nextInt();
			if(input > ran) {
				System.out.println("Down\n");
			} else if(input < ran) {
				System.out.println("UP\n");
			}
			count++;
		} while(input != ran);
		
		System.out.printf("정답입니다! (총 입력 횟수 : %d회)\n", count);
	}
	
	// 강사님 풀이
	public void upDownGameV3() {
		Scanner sc = new Scanner(System.in);
		int ran = (int)(Math.random() * 50 + 1);
		System.out.println("임의의 수 : " + ran);
		int count = 1;
		
		while(true) {
			System.out.printf("%d번 입력 : ", count);
			int input = sc.nextInt();
			
			if(ran == input) {
				System.out.printf("정답입니다! (총 입력 횟수 : %d회)\n", count);
				break;
			} else if(ran > input) {
				System.out.println("UP\n");
			} else {
				System.out.println("down\n");
			}
			count++;
		}
	}
	
	public void RPSGame() {
		// 가위 바위 보 게임

		// 컴퓨터 가위/바위/보
		// (int)(Math.random() * 3)	--> 0/1/2
		
		
		// [출력 예제]
		// 몇판? : 3
		
		// 1번째 게임
		// 가위/바위/보 중 하나를 입력 해주세요 :  가위
		// 컴퓨터는 [보]를 선택했습니다.
		// 플레이어 승!
		// 현재 기록 : 1승 0무 0패
		
		// 2번째 게임
		// 가위/바위/보 중 하나를 입력 해주세요 :  보
		// 컴퓨터는 [보]를 선택했습니다.
		// 비겼습니다.
		// 현재 기록 : 1승 1무 0패
		
		// 3번째 게임
		// 가위/바위/보 중 하나를 입력 해주세요 :  가위
		// 컴퓨터는 [바위]를 선택했습니다.
		// 졌습니다ㅠㅠ
		// 현재 기록 : 1승 1무 1패
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇판? :");
		int round = sc.nextInt();
		int win = 0;
		int lose = 0;
		int draw = 0;
		String result = "";
		String com = "";
		int player = 0;
		for(int i = 1; i<=round; i++) {
			System.out.printf("%d번째 게임\n", i);
			
			// 컴퓨터 결정
			int ran = (int)(Math.random() * 3);
			switch(ran) {
			
			case 0: com = "보"; break;			
			case 1: com = "바위"; break;
			case 2: com = "가위"; break;
			}
						
			// 플레이어 결정
			System.out.print("가위/바위/보 중 하나를 입력 해주세요 : ");
			String input = sc.next();
			
			switch(input) {
			case "보" : player = 0; break;
			case "바위" : player = 1; break;
			case "가위" : player = 2; break;
			}
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);
			
			// 플레이어가 비겼을 때
			if(player - ran == 0) {
				result = "비겼습니다"; draw++;
			} else if(player - ran == -1 || player - ran == 2) {
				result = "이겼습니다;"; win++;
			} else {
				result = "졌습니다"; lose++;
			}
			System.out.println(result);
			System.out.printf("%s승 %s무 %s패\n", win, draw, lose);
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
}
