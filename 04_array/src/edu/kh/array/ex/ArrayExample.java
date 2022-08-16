package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	
	// 배열 ( 자료 구조 )
	// - 1개의 자료형, n개의 값 저장
	// - 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	// - 묶여진 변수들은 하나의 이름(배열명)으로 불러지고
	//   각 변수들은 index를 이용하여 구분함.
	
	public void ex1() {	
		
		// 배열 맛보기
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num1 + num2 + num3 + num4);
		
		
		
		// 배열 이용
		int[] arr = new int[4];		// [] : 배열 기호
		// int형 변수 4개를 묶음으로 다룰 수 있는 배열을 생성하고 
		// 이를 arr이라고 부름
		
		// int[] arr;
		// int[]을 참조하는 변수 arr(int[] 시작 주소를 저장)
		
		// new int[4];
		// Heap 영역에 int형 변수 4개짜리 배열 할당
		
		
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		int sum = 0;
		
		for(int i = 0; i<4; i++) {
			System.out.println(arr[i]);
			
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
		
	}
	
	public void ex2() {
		
		// int[]을 참조하는 변수 arr 선언
		int[] arr; // 배열 시작주소 저장
		
		
		arr = new int[4];
		// heap 영역에 int 4칸짜리 배열을 할당(생성) 하고
		// 할당된 배열의 시작주소를 arr에 대입
		
		// 배열 길이(크기) : 4
		System.out.println("배열 길이 : " + arr.length);
		// arr.length : arr이 참조하고 있는 배열의 길이
		
		System.out.println("컴파일러가 정말로 0으로 다 초기화 해줬을까?");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		
		// stack 영역은 컴파일러가 알아서 초기화 X
		// heap 영역은 컴파일러가 알아서 초기화 0
		
		int a;
		//System.out.println(a);
		// The local variable a may not have been initialized
		
		System.out.println("=========================");
		
		// 배열 초기화
		
		// 1) 인덱스를 이용한 초기화
		arr[0] = 100;	// arr int[] 참조형 변수가 참조하고 있는 배열의 0번 인덱스
						// 0번 인덱스에 100을 대입
		arr[1] = 200;	
		
		arr[2] = 300;
		
		arr[3] = 400;
		
		// ** for문을 이용한 배열에 저장된 모든 값 출력 **
		for(int i =0; i< arr.length; i++) {
			// i == index
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		
		
		System.out.println("====================");
		
		// 2) for문을 이용한 초기화
		// -> 배열의 각 인덱스에 대입되는 값이 일정한 규칙성이 있을 경우 사용
		
		// int 10개를 저장하는 배열의 각 인덱스에 요소
		// 10, 20, 30 ~ 100 까지 대입
		
		int[] arr2 = new int[10];	// input 0 ~ 9 
		
		for(int i =0; i<arr2.length; i++) {
			arr2[i] = 10 * (i + 1);
		}
		
		// 출력
		for(int i =0; i<arr2.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr2[i]);
		}
	}
	
	public void ex3() {
		// 2) for문을 이용한 초기화
		
		// 5) 5명의 키(cm)를 입력 받고 평균 구하기
		
		// [출력 예시]
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 184.3
		// 4번 키 입력 : 190.2
		// 5번 키 입력 : 174.4
		
		// 입력 받은 키 : 170.5  165.7  184.3  190.2  174.4
		// 평균 : 177.02cm
		
		Scanner sc = new Scanner(System.in);
		
		
		// heights   ->   이렇게 선언하는 것보다 뒤에 자료구조명을 붙이는게 더 좋다.
		
		double[] heightArr = new double[5];
		
		for(int i =0; i<heightArr.length; i++) {
			System.out.printf("%d번 키 입력 : ", i + 1);
			
			heightArr[i] = sc.nextDouble();
		}
		
		// 배열에 값이 잘 대입 되었는지 임시 확인
//		System.out.println(heightArr); // 배열의 주소가 출력됨(주소를 노출시키지 않기위해 자바가 만든 해시코드)
		
		// 배열의 주소가 출력됨
		// -> 왜? heightArr 참조 변수에는
		//	  베열의 시작 주소가 저장되어 있기 때문에
		
		// Arrays : Array를 다루기 위한 기능들을 담은 자바의 유틸 클래스
//		System.out.println(Arrays.toString(heightArr));
		
		System.out.println();	// 줄 바꿈
		
		double sum = 0;			// 합계
		
		System.out.print("입력 받은 키 : ");
		for(int i =0; i < heightArr.length; i++) {
			sum += heightArr[i];
			System.out.print(heightArr[i] + " ");
		}
		System.out.printf("\n평균 : %.2f\n", sum / heightArr.length);
	}

	public void ex4() {

		int[] arr = new int[3];
		
		for(int i =0; i <= arr.length; i++) {
			System.out.println(arr[i]);
			
			// ArrayIndexOutOfBoundsException : 
			// Index 3 out of bounds for length 3
			// -> 배열 인덱스 범위 초과
			// -> 배열의 길이는 3인데 index 3을 접근하려 했다.
		}
	}
	
	public void ex5() {
		
		// 3) 배열 선언과 동시에 (할당 및) 초기화
		
		int[] arr = {10, 20, 30, 40};
		// new int[4];
		// arr[0] = 10;
		// arr[1] = 20;
		// arr[2] = 30;
		// arr[3] = 40;
		
		// 1. int[] 을 참조하는 변수 arr 선언 (int[] arr)
		// 2. int형 4칸짜리 배열을 heap 영역에 할당(생성) 후
		// 	  각각의 인덱스를 10, 20, 30, 40으로 초기화
		// 3. 할당된 배열의 첫번째 주소값을 arr에 대입
		
		System.out.println("배열 길이 : " + arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	public void ex6() {
		// 점심 메뉴 뽑기 프로그램
		
		String[] menuArr = {"김밥+라면", "햄버거", "맘스터치", "서브웨이" 
							,"백반", "순대국", "곰탕", "파스타", "삼겹살", "떡볶이"};
		
		// 배열 index 범위 내 난수 발생
		int ran = (int)(Math.random() * menuArr.length);		// 0 ~ 9 난수     
		
		System.out.println("오늘의 점심 메뉴 : " + menuArr[ran]);
	}
	
	/*=============================================== 배열 응용 ===============================================*/
	
	
	
	
	public void ex7() {
		
		// 인원 수를 입력 받아 그 크기만큼의 정수 배열을 선언 및 할당
		// 인원 수 만큼 점수를 입력 바아
		// 합계, 평균, 최고점, 최저점
		
		// [출력 예시]
		// 1번 점수 입력 : 100
		// 2번 점수 입력 : 80
		// 3번 점수 입력 : 50
		// 4번 점수 입력 : 60
		
		// 합계 : 290
		// 평균 : 72.5
		// 최고점 : 100
		// 최저점 : 50
		
		int sum = 0;
		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원 수 : ");
		int size = sc.nextInt();
		
		int[] scoreArr = new int[size];
		for(int i =0; i< scoreArr.length; i++) {
			System.out.printf("%d번 점수 입력 : ", i + 1);
			sum += scoreArr[i] = sc.nextInt();  // 점수를 입력 받자마자 sum에 누적
		}
		

		
		{
			// 최고 / 최저점 구하기
			int max = scoreArr[0];
			int min = scoreArr[0];
			
			// 배열의 첫 번째 인덱스값을 최고/최저의 비교 기준으로 삼음.
			for(int i = 1; i < scoreArr.length; i++) {
				if(scoreArr[i] > max) {	// 기존 최고점 보다 scoreArr[i] 값이 더 큰 경우
					max = scoreArr[i];
				}
			}
			
			for(int i = 1; i < scoreArr.length; i++) {
				if(scoreArr[i] > max) {	// 기존 최고점 보다 scoreArr[i] 값이 더 작은 경우
					min = scoreArr[i];
				}
			}
		}
	
		// 최솟값, 최댓값 찾기
		int min = scoreArr[0];
		int max = scoreArr[0];

		
		// for문 디버깅 요령 
		// -> for문에 break point를 지정하면 증감식이 해석되기 전에 멈춘다.
		for(int i =1; i<scoreArr.length; i++) {
			if(scoreArr[i] < min) {
				min = scoreArr[i];
			}
			if(scoreArr[i] > max) {
				max = scoreArr[i];
			}
			
			// else - if 로도 사용 할 수 있다.
		}
		
		System.out.println();	// 줄 바꿈
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum / scoreArr.length);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
	}
	
	public void ex8() {
		
		// 배열 내 데이터 검색
		
		// 입력 받은 정수가 배열에 존재하면 몇 번 인덱스에 존재하는지 출력
		// 단, 없다면 "존재하지 않습니다." 출력
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int search = sc.nextInt();
		
		boolean flag = true;
		// for 문이 종료된 후에도 true : 존재하지 않는다.
		// for 문이 종료된 후에 false : 존재한다.
		
		// arr배열 순차 접근(반복 접근)
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == search) {	// arr[i] 값이 입력 받은 값과 같다면
				System.out.println(i + "번째 인덱스에 존재합니다.");
				flag = !flag;
				break;				// 중복 데이터가 없을 시 추가 검색 하지 않아도 됨 (데이터 무결성)
			}
		}
		if(flag) {
			System.out.println("존재하지 않습니다.");
		}
	}
	
	// 로또 번호 생성기
	public void createLottoNumber() {
		// 배열을 이용한 중복 데이터 제거 + 정렬
		
		// 1. 1 ~ 45 사이의 중복되지 않은 난수 6개
		// 2. 생성된 난수를 오름 차순 정렬
		
		System.out.println("***** 로또 번호 생성기 *****");
		
		// 난수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int[6];
		
		// 난수를 생성하여 lotto 배열에 추가
		for(int i =0; i< lotto.length; i++) {
			int ran = (int)(Math.random() * 45 + 1);	// 1 ~ 45 사이 난수
			
			lotto[i] = ran;								// 난수를 배열 요소에 대입
			
			for(int j =0; j < i; j++) {					// 현재 인덱스 이전의 요소를 순차 접근
				
				// (lotto[j] == lotto[i]와 결과는 같으나 코드 가독성이 떨어짐
				if( lotto[j] == ran) {					// 값이 중복이면
					i--;								// i 값을 인위적으로 감소시켜
														// 바깥쪽 for의 증감식 (i++)이 실행 되었을 때
														// i 값이 현재 값을 유지하도록 만든다.
														// (현재 커서를 왼쪽 1칸 + 오른쪽 1칸 == 제자리)
						
					break;								// 추가 검사가 불필요 하기 때문에 멈춤 (중복이 2개이상 나올 일이 없다.)								
				}
			}
			
		}
		// lotto 배열에 저장된 모든 값 출력
		System.out.println(Arrays.toString(lotto));
		
		// Arrays.sort(배열명) : 베열 내 값을 오름 차순으로 정렬해주는 유틸클래스 함수
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
	}
	
	public void ex9() {
		
		// 얕은 복사
		// - 참조하는 주소만을 복사하여
		//   서로 다른 참조 변수가 하나의 배열(또는 객체)를 참조하게 하는 복사방법
		
		// 특징 : 하나의 배열을 참조하기 때문에 값을 공유하게 된다.
		
		int[] arr = {99, 70, 80, 50, 40};
		
		// arr 변수의 저장된 배열의 시작 주소를 copyArr에 대입(얕은 복사) ex. 윈도우의 바로가기
		int[] copyArr = arr;
		
		// 주소 확인
		System.out.println("arr : " + arr);
		System.out.println("copyArr : " + copyArr);
		
		System.out.println("[변경 전]");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr : " + Arrays.toString(copyArr));
		
		// 복사본의 값을 변경 -> 원본도 값이 변함 == 값을 공유(얕은 복사 특징)
		copyArr[2] = 10000;
		
		System.out.println("[변경 후]");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr : " + Arrays.toString(copyArr));
	}
	
	public void ex10() {
		
		// 깊은 복사
		// - 원본과 같은 자료형, 크기의 새로운 배열을 만들어 
		//   원본의 데이터를 모두 복사하는 방법
		//  == 복제
		
		// -> 원본 데이터를 보존하면서 
		// 	  복사본의 데이터 가공을 진해아는 경우
		int[] arr = {99, 70, 80, 50, 40};
		
		// 깊은 복사를 위한 배열 선언 및 할당
		int[] copyArr = new int[arr.length];
		
		// 원본 데이터를 모두 복사
		
		// 1) for문을 이용한 방법 (index가 동일하다는 특징을 이용)
//		for(int i =0; i<arr.length; i++) {
//			copyArr[i] = arr[i];
//		}
	
		// 2. System.arraycopy(원본배열, 원본 복사 시작 인덱스, 
		//               복사배열, 복사배열의 삽입 시작 인덱스, 복사길이);
		// System.arraycopy(arr, 0, copyArr, 0, arr.length);
		
		// 3. Arrays.copyOf(원본배열, 복사할 길이)
		// copyArr = Arrays.copyOf(arr, arr.length);	// 3번은 많이 사용 x
		
		// 주소 확인
		System.out.println("arr : " + arr);
		System.out.println("copyArr : " + copyArr);
		
		System.out.println("[변경 전]");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr : " + Arrays.toString(copyArr));
		
		// 복사본의 값을 변경 -> 데이터 공유 X -> 서로 다른 배열
		
		copyArr[2] = 10000;
		
		System.out.println("[변경 후]");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr : " + Arrays.toString(copyArr));
	}
	
	public void ex11() {
		// null 의미
		// - 참조 하는 것(배열, 객체) 이 없다를 의미하는 값
		
		int[] arr1 = new int[3];
		
		System.out.println(arr1 == null);
		// arr1 == null   -> false == arr1 참조 변수가 무언가를 참조하고 있다.
		
		if(arr1 != null) {		// arr1이 참조하는 배열이 있을 때에만 수행
			System.out.println(arr1[0]);
		}
		
		System.out.println("========================================");
		
		// int[] arr2;						// 배열 참조 변수 선언
		// System.out.println(arr2);		// The local variable arr2 may not have been initialized
											// 배열 참조 변수를 선언만 했을 때 == 저장된 값이 없다.
											// 배열 참조 변수 선언 및 null 초기화
		
		int[] arr2 = null;					// 배열 참조 변수 null 선언
		System.out.println(arr2);			// == 값은 있으나 참조하는게 없다라는 뜻
		
		if(arr2 == null) {					// arr2가 참조하는 배열이 없을 때
			arr2 = new int[4];				// 새로운 배열을 생성하여 그 시작 주소를 arr2에 대입
		}
		System.out.println(arr2);
	}
	
	
}
