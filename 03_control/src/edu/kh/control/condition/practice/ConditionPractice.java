package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		/*
		 * 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고 짝수가 아니면 “홀수입니다.“를 출력하세요. 양수가 아니면
		 * “양수만 입력해주세요.”를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 0 ) {
			System.out.println("양수만 입력해주세요.");
		} else if (input % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
	
	public void practice2() {
		/*
		 * 메소드 명 : public void practice2(){} 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을
		 * 계산하고 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요. (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서
		 * 평균이 60점 이상일 경우) 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고 불합격인 경우에는
		 * “불합격입니다.”를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수");
		int kor = sc.nextInt();
		
		System.out.println("영어점수");
		int eng = sc.nextInt();
		
		System.out.println("수학점수");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n 평균 : %.1f\n축하합니다. 합격입니다!"
					, kor, eng, math, sum, avg);
			
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice3() {
		/*
		 * 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.) 잘못 입력한 경우 “OO월은 잘못 입력된
		 * 달입니다.”를 출력하세요. (switch문 사용)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		int day = 0;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			day = 31;
			break;
		case 2: case 4: case 6: case 9: case 11: 	
			day = 30;
			break;
		default :
			day = -1;
		}
		
		if(day < 0) {
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		} else {
			System.out.printf("%d월은 %d일까지 있습니다.", month, day);
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		String result = null;
		
		if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi < 23) {
			result = "정상체중";
		} else if(bmi < 25) {
			result = "과체중";
		} else if(bmi < 30){
			result = "비만";
		} else {
			result = "고도 비만";
		}
		System.out.printf("BMI 지수 : %f\n%s", bmi, result);
		
	}
	
	public void practice5() {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요. 평가 비율은 중간고사 20%, 기말고사 30%,
		 * 과제 30%, 출석 20%로 이루어져 있고 이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요. 70점
		 * 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 중간고사
		System.out.print("중간 고사 점수 : ");
		double midTest = sc.nextInt() * 0.2;
		
		// 기말고사
		System.out.print("기말 고사 점수 : ");
		double finalTest = sc.nextInt() * 0.3;
		
		// 과제점수
		System.out.print("과제 점수 : ");
		double homeWork = sc.nextInt() * 0.3;
		
		// 출석횟수 
		System.out.print("출석 점수 : ");
		double count = sc.nextDouble();
		
		// 평가비율(총점수) - 중간 0.2 / 기말 0.3 과제 0.3 + 출석
		double totalScore = midTest + finalTest + homeWork + count;
		
		String result = null;
		
		
		System.out.println("===========결과===========");
		
		if(count <= 14) {				// (20 * (1 - 0.3))
			System.out.printf("Fail [출석 횟수 부족(%d/20)]\n", (int)count);
		} else {
			if(totalScore < 70) {
				result = "Fail [점수 미달]";
			} else {
				result = "PASS";
			}
			System.out.printf("중간 고사 점수(20) : %.1f\n"
					+"기말 고사 점수 (30) : %.1f\n"
					+"과제 점수 (30) : %.1f\n"
					+"출석 점수 (20) : %.1f\n"
					+"총점 : %.1f\n"
					+"%s",
					midTest, finalTest, homeWork, count, totalScore, result);
		}
	}
}
