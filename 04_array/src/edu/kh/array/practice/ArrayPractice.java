package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
//		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//
//		[실행 화면]
//		1 2 3 4 5 6 7 8 9
//		짝수 번째 인덱스 합 : 25
		
		
		
		// 배열 선언 및 할당 arr
		int[] arr = new int[9];
		
		// 짝수 합 저장할 변수
		int sum = 0;
		// arr.length 만큼 반복 돌면서
		for(int i = 0; i<arr.length; i++) {
			// 1~9 까지 짝수의 합
			arr[i] = i + 1;
			
			// 각 인덱스의 1~9 할당
			if(i % 2 == 0) {
				sum += arr[i];
			}
			// 각 인덱스 출력
			System.out.printf("%d ", arr[i]);
			
			
		}
		System.out.printf("\n짝수 번째 인덱스 합 : %d", sum);
		
	}
	
	public void practice2() {
//		길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//
//		[실행 화면]
//		9 8 7 6 5 4 3 2 1
//		홀수 번째 인덱스 합 : 20
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i = arr.length - 1; i>= 0; i--) {
			arr[i] = i + 1;
			if(i % 2 != 0) {
				sum += arr[i];
			}
			System.out.printf("%d ", arr[i]);
		}
		System.out.printf("\n짝수 번째 인덱스 합 : %d", sum);
	}
	
	public void practice3() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//
//		[실행 화면]
//		양의 정수 : 5
//		1 2 3 4 5
//
//		[실행 화면]
//		양의 정수 : 8
//		1 2 3 4 5 6 7 8
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		for(int i =0; i <arr.length; i++) {
			arr[i] = i+1;
			System.out.printf("%d ", arr[i]);
		}
		
		
	}
	
	public void practice4() {
//		정수 5개를 입력 받아 배열을 초기화 하고
//		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
//		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
//
//		[실행 화면 1]
//		입력 0 : 5
//		입력 1 : 8
//		입력 2 : 9
//		입력 3 : 10
//		입력 4 : 4
//		검색할 값 : 8
//		인덱스 : 1
//
//		[실행 화면 2]
//		입력 0 : 5
//		입력 1 : 8
//		입력 2 : 9
//		입력 3 : 10
//		입력 4 : 4
//		검색할 값 : 1
//		일치하는 값이 존재하지 않습니다.
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i =0; i<5; i++) {
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = false;	
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == search) {
				System.out.printf("인덱스 : %d", i);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		int[] index = new int[str.length()];
		int count = 0;
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				index[count++] = i; 
			}
		}
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
		for(int i =0; i<index.length; i++) {
			if(index[i] != 0) {
				System.out.printf("%d ", index[i]);				
			}
		}
		System.out.printf("\n%c의 개수 : %d ", ch, count);
		
	}
	
	public void practice6() {
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//		[실행 화면]
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2 
//		총 합 : 2
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int N = sc.nextInt();
		int sum = 0;
		int[] arr = new int[N];
		
		for(int i =0; i<arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int num = sc.nextInt();
			sum += num;
			arr[i] = num;
		}
		
		for(int i =0; i< arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println("\n총 합 : " + sum);
	}
	
	
	public void practice7() {
//		주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
//		단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
//		[실행 화면]
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		
		char[] chArr = new char[str.length()];
		
		for(int i =0; i<str.length(); i++) {
			chArr[i] = str.charAt(i);
			if(i >= 8) {
				chArr[i] = '*';
			}
		}
		
		for(int i =0; i<chArr.length; i++) {
			System.out.print(chArr[i]);
		}
	}
	
	public void practice8() {
//		3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요.
		
//		[실행 화면]
//		정수 : 4
//		다시 입력하세요.
//		정수 : -6
//		다시 입력하세요.
//		정수 : 5
//		1, 2, 3, 2, 1
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		while (true) {
			if(input < 3 || input % 2 == 0) {
				System.out.println("다시 입력하세요.");
				continue;
			} 
			break;
		}
		
		int[] arr = new int[input];
		
		for(int i = 0; i<arr.length; i++) {
			if(i < (arr.length/2) + 1) {
				arr[i] = i + 1;
			} else {
				arr[i] = input - i;
			}
		}
		
		for(int i =0; i <arr.length; i++) {
			System.out.printf("%d", arr[i]);
			if(i != arr.length-1) {
				System.out.print(", ");
			}
		}
	}
	
	public void practice9() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
//		[실행 화면]
//		발생한 난수 : 9 7 6 2 5 10 7 2 9 6
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];

		System.out.print("발생한 난수 : ");
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.printf("%d ", arr[i]);
		}
	}
	
	public void practice10() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//		1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//		
//		[실행 화면]
//		발생한 난수 : 5 3 2 7 4 8 6 10 9 10 
//		최대값 : 10
//		최소값 : 2
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.printf("%d ", arr[i]);
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i =1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.printf("\n최대값 : %d\n최소값 : %d", max, min);
	}
	
	public void practice11() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//		[실행 화면]
//		4 1 3 6 9 5 8 10 7 2 
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		
		for(int i =0; i<arr.length; i++) {
			int ran = (int)(Math.random() * 10 + 1);
			arr[i] = ran;
			
			// 중복 확인
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {	//중복이면
					i--;
				}
			}
		}
		
		for(int i =0; i< arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
	
	public void practice12() {
//		로또 번호 자동 생성기 프로그램을 만들기.
//		(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
//		[실행 화면]
//		3 4 15 17 28 40
		
		int[] lotto = new int[6];
		
		for(int i = 0; i< lotto.length; i++) {
			int ran = (int)(Math.random() * 45 + 1);
			lotto[i] = ran;
			
			for(int j = 0; j<i; j++) {
				if(lotto[i] == lotto[j]) {	//중복이면
					i--;
				}
			}
		}
		
		// 오름차순 정렬
		for (int i =1; i <lotto.length - 1; i++) {
			for(int j = 0; j<lotto.length - i; j++) {
				if(lotto[j] > lotto[j+1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j + 1] = tmp;
				}
			}
		}
		
		for(int i =0; i<lotto.length; i++) {
			System.out.printf("%d ", lotto[i]);
		}
	}
	
	public void practice13() {
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//		문자의 개수와 함께 출력하세요. (중복 제거)
//		[실행 화면]
//		문자열 : application
//		문자열에 있는 문자 : a, p, l, i, c, t, o, n
//		문자 개수 : 8
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] chArr = new char[str.length()];
		
		for(int i =0; i<str.length(); i++) {
			chArr[i] = str.charAt(i);
		}
		
		// 문자 출력
		System.out.print("문자열에 있는 문자 : ");
		for(int i =0; i<chArr.length; i++) {
			System.out.printf("%c", chArr[i]);
			if(i != chArr.length - 1) {
				System.out.print(", ");
			}
		}
		// 문자 개수 출력
		System.out.println("\n문자 개수 : " + chArr.length);
	}

	public void practice14() {
		
//		사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당하고
//		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
//		(배열의 얕은 복사, 깊은 복사를 이용하는 문제)

//		[실행 화면]
//		배열의 크기를 입력하세요 : 3
//		1번째 문자열 : 자바의 정석
//		2번째 문자열 : 알고리즘
//		3번째 문자열 : C프로그래밍
//		더 값을 입력하시겠습니까?(Y/N) : y
//		더 입력하고 싶은 개수 : 2
//		4번째 문자열 : 인간관계
//		5번째 문자열 : 자기계발
//		더 값을 입력하시겠습니까?(Y/N) : y
//		더 입력하고 싶은 개수 : 1
//		6번째 문자열 : 영단어600
//		더 값을 입력하시겠습니까?(Y/N) : n
//		[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
		
		
		Scanner sc = new Scanner(System.in);
		
		int usedSize = 0;
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int arrSize = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[arrSize];
		
		for(int i =0; i<arrSize; i++) {
			System.out.printf("%d번째 문자열 : ", usedSize+1);
			arr[i]= sc.nextLine();
			usedSize++;
		}
		
		System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
		String add = sc.next(); 
		while(add.equals("y")) {
			System.out.print("더 입력하고 싶은 갯수 : ");
			int plusSize = sc.nextInt();
			sc.nextLine();
			// 배열 확장
			String[] copyArr = new String[arr.length + plusSize];
			for(int i =0; i<arr.length; i++) {
				copyArr[i] = arr[i];
			}
			arr = copyArr;
			
			for(int i = usedSize; i<arr.length; i++) {
				System.out.printf("%d번째 문자열 : ", usedSize+1);
				arr[i]= sc.nextLine();
				usedSize++;
			}
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			add = sc.next(); 
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice15() {
//		3행 3열짜리 문자열 배열을 선언 및 할당하고
//		인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
//		[실행 화면]
//		(0, 0)(0, 1)(0, 2)
//		(1, 0)(1, 1)(1, 2)
//		(2, 0)(2, 1)(2, 2)
		
		String[][] arr = new String[3][3];
		
		
		// 저장
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = "("+i+", "+j+")";
			}
		}
		
		// 출력
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void practice16() {
//		행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 1 ~ 16까지 값을 차례대로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.
//		[실행 화면]
//		1 2 3 4 
//		5 6 7 8 
//		9 10 11 12 
//		13 14 15 16
		
		int[][] arr = new int[4][4];
		
		int num = 1;
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice17() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.
		
//		[실행 화면]
//		16 15 14 13 
//		12 11 10 9 
//		8 7 6 5 
//		4 3 2 1
		
		int[][] arr = new int[4][4];
		
		int num = 16;
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = num--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice18() {
//		4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
//		아래의 내용처럼 처리하세요.
//		[실행 화면]
//		9 3 7 19 
//		3 6 9 18 
//		6 10 10 26 
//		18 19 26 63

		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][4];
		
		for(int i =0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length -1; j++) {
				int ran = (int)(Math.random()*9 + 1);
				
				arr[i][j] = ran;
				
				arr[i][arr[i].length-1] += ran;
				arr[arr.length-1][j] += ran;
				arr[arr.length-1][arr[i].length-1] += ran;
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice19() {
//		2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
//		“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
//		크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
//		(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)
		
//		[실행 화면]
//		행 크기 : 5
//		열 크기 : 4
//		T P M B 
//		U I H S 
//		Q M B H 
//		H B I X 
//		G F X I 
		
		Scanner sc = new Scanner(System.in);
		int rowSize = 0;
		int colSize = 0;
		
		boolean flag = false;
		
		
		while(!flag) {
			System.out.print("행 크기 : ");
			rowSize = sc.nextInt();
			
			System.out.print("열 크기 : ");
			colSize = sc.nextInt();
			if(rowSize >= 1 && rowSize <= 10 && colSize >= 1 && colSize <= 10) {
				flag = true;
			}
		}
		
		
		
		
		
		char[][] chArr = new char[rowSize][colSize];
		
		for(int i =0; i< chArr.length; i++) {
			for(int j = 0; j<chArr[i].length; j++) {
				int ran = (int)(Math.random()*26) + 65;
				
				chArr[i][j] = (char)ran;
			}
		}
		
		for(int i =0; i< chArr.length; i++) {
			for(int j = 0; j<chArr[i].length; j++) {
				System.out.printf("%c ", chArr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice20() {
//		사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
//		문자형 가변 배열을 선언 및 할당하세요.
//		그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
//		[실행 화면]
//		행의 크기 : 4
//		0열의 크기 : 2
//		1열의 크기 : 6
//		2열의 크기 : 3
//		3열의 크기 : 5
//		a b 
//		c d e f g h 
//		i j k 
//		l m n o p 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");
		int rowSize = sc.nextInt();
		
		char[][] chArr = new char[rowSize][]; 
		
		for(int i =0; i<chArr.length; i++) {
			System.out.printf("%d열의 크기 : ", i);
			int colSize = sc.nextInt();
			
			chArr[i] = new char[colSize];
		}
		
		char ch = 'a';
		for(int i =0; i<chArr.length; i++) {
			for(int j = 0; j<chArr[i].length; j++) {
				chArr[i][j] = ch++;
				System.out.printf("%c ", chArr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice21() {
//		1차원 문자열 배열에 학생 이름 초기화되어 있다.
//		3행 2열 짜리 2차원 문자열 배열 2개를 새로 선언 및 할당하여
//		학생 이름을 2차원 배열에 순서대로 저장하고 아래와 같이 출력하시오.
//		(첫 번째 2차원 배열이 모두 저장된 경우 두 번째 2차원 배열에 저장 진행)
//		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
//		"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
//		[실행 화면]
//		== 1분단 ==
//		강건강 남나나
//		도대담 류라라
//		문미미 박보배
//		== 2분단 ==
//		송성실 윤예의
//		진재주 차천축
//		피풍표 홍하하
		
		int count = 0;
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		System.out.println("== 1분단 ==");
		for(int i =0; i<arr1.length; i++) {
			for(int j = 0; j<arr1[i].length; j++) {
				if(students.length <= count) {	// 더이상 남은 학생이 없다면
					break;
				} 
				arr1[i][j] = students[count++];
				System.out.printf("%3s ", arr1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i =0; i<arr2.length; i++) {
			for(int j = 0; j<arr2[i].length; j++) {
				if(students.length <= count) {	// 더이상 남은 학생이 없다면
					break;
				} 
				arr2[i][j] = students[count++];
				System.out.printf("%3s ", arr2[i][j]);
			}
			System.out.println();
		}
	}

	public void practice22() {
//		위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여
//		해당 학생이 어느 자리에 앉았는지 출력하세요.
		
//		[실행 화면]
//		== 1분단 ==
//		강건강 남나나
//		도대담 류라라
//		문미미 박보배
//		== 2분단 ==
//		송성실 윤예의
//		진재주 차천축
//		피풍표 홍하하
//		============================
//		검색할 학생 이름을 입력하세요 : 차천축
//		검색하신 차천축 학생은 2분단 2번째 줄 오른쪽에 있습니다.
		
		Scanner sc = new Scanner(System.in);		
		int count = 0;
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		System.out.println("== 1분단 ==");
		for(int i =0; i<arr1.length; i++) {
			for(int j = 0; j<arr1[i].length; j++) {
				if(students.length <= count) {	// 더이상 남은 학생이 없다면
					break;
				} 
				arr1[i][j] = students[count++];
				System.out.printf("%3s ", arr1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i =0; i<arr2.length; i++) {
			for(int j = 0; j<arr2[i].length; j++) {
				if(students.length <= count) {	// 더이상 남은 학생이 없다면
					break;
				} 
				arr2[i][j] = students[count++];
				System.out.printf("%3s ", arr2[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.print("검색할 학생 이름을 검색하세요 : ");
		String target = sc.next();
		
		boolean flag = false;
		
		for(int i =1; i<=2; i++) {			// 1분단 2분단 두번 검색
			if(flag) break;
			
			switch(i) {
			
			case 1:
				for(int j =0; j<arr1.length; j++) {
					for(int k = 0; k < arr1[j].length; k++) {
						if(arr2[j][k] != null && arr1[j][k].equals(target)) {
							String LR = k != 0 ? "오른쪽" : "왼쪽";
							System.out.printf("%d분단 %d번째 %s에 있습니다.", i, j+1, LR);
							flag = true;
							break;
						}
					}
				}
				break;
			case 2:
				for(int j =0; j<arr2.length; j++) {
					for(int k = 0; k < arr2[j].length; k++) {
						if(arr2[j][k] != null && arr2[j][k].equals(target)) {
							String LR = k != 0 ? "오른쪽" : "왼쪽";
							System.out.printf("%d분단 %d번째 %s에 있습니다.", i, j+1, LR);
							break;
						}
					}
				}
			}
		}
	}
	
	public void practice23() {
//		String 2차원 배열 6행 6열을 만들고 행의 맨 위와 제일 앞 열은 각 인덱스를 저장하세요.
//		그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 “X”로 변환해 2차원 배열을 출력하세요.
//		[실행 화면]
//		행 인덱스 입력 : 4
//		열 인덱스 입력 : 2
//		  0 1 2 3 4
//		0 
//		1
//		2
//		3
//		4 X
		Scanner sc = new Scanner(System.in);
		String[][] strArr = new String[6][6];
		
		for(int i =0; i<strArr.length; i++) {
			for(int j =0; j<strArr[i].length; j++) {
				
				// 윗줄 인덱스
				if(i == 0 && j == 0) {		// 둘다 0이면
					strArr[i][j] = " ";
				} else if(i == 0) {
					strArr[i][j] = Integer.toString(j-1);
				} else if (j == 0){
					strArr[i][j] = Integer.toString(i-1);
				} else {
					strArr[i][j] = " ";
				}
			}
		}
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();
		
		strArr[row+1][col+1] = "X";

		for(int i =0; i<strArr.length; i++) {
			for(int j =0; j<strArr[i].length; j++) {
				System.out.printf("%s ", strArr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void practice24() {
		Scanner sc = new Scanner(System.in);
		String[][] strArr = new String[6][6];
		
		for(int i =0; i<strArr.length; i++) {
			for(int j =0; j<strArr[i].length; j++) {
				
				// 윗줄 인덱스
				if(i == 0 && j == 0) {		// 둘다 0이면
					strArr[i][j] = " ";
				} else if(i == 0) {
					strArr[i][j] = Integer.toString(j-1);
				} else if (j == 0){
					strArr[i][j] = Integer.toString(i-1);
				} else {
					strArr[i][j] = " ";
				}
			}
		}
		
		while(true) {
			System.out.print("행 인덱스 입력 : ");
			int row = sc.nextInt();
			if(row == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.print("열 인덱스 입력 : ");
			int col = sc.nextInt();
			if(col == 99) {
				System.out.println("프로그램 종료");
				break;
			}

			strArr[row+1][col+1] = "X";
			
			for(int i =0; i<strArr.length; i++) {
				for(int j =0; j<strArr[i].length; j++) {
					System.out.printf("%s ", strArr[i][j]);
				}
				System.out.println();
			}
		}
	}
	
	
	
	
	public static void Bingo() {
//		1. 빙고판 크기를 입력 받아, 그 크기 만큼의 행과 열을 가지는 2차원 배열(빙고판)을 생성하고
//		1부터 크기*크기 사이의 정수 난수를 무작위 배치.
		
//		2. 정수를 입력 받아 빙고판에서 일치하는 부분을 찾아 해당 부분의 숫자를 “★“로 변경하고
//		현재 빙고 카운트가 몇인지 출력.
//		단, 빙고판에 없는 정수를 입력한 경우 “다시 입력해주세요.“ 출력
		
//		3. 가로, 세로, 대각선 한 줄이 모두 “★“로 변경되어 있을 경우 빙고 카운트를 1 증가
		
//		4. 빙고카운트가 3이상이 되면 “***Bingo!***” 를 출력하고 프로그램 종료.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("빙고판 크기 입력 : ");
		int size = sc.nextInt();
		
		String[][] map = new String[size][size]; 
		int[][] check = new int[size+1][size+1];			// 빙고 여부를 체크할 인덱스 1 추가
															// ＊ 코드의 전체적인 동작 과정
															// 1. 배열의 모든 요소 0으로 초기화
															// 2. 유저가 입력한 좌표 (x, y) 1로 갱신
															// 3. 유저가 입력할 때마다 그 좌표가 속해있는 열과 행의 합을 각각 계산
															// 4. 합이 빙고판의 사이즈와 같다면 빙고(각 열과 행의 0번째 인덱스는 빙고 여부를 계산하기 위한 공간 0 : false / 1 : true)
															// 5. 유저가 입력할 때마다 각열과 대각선의 빙고수를 계산해서 3 이상 넘으면 break;
		// 랜덤 난수를 중복없이 채우기위한 배열
		int[] ranArr = new int[size*size];					// 빙고판 사이즈만큼의 배열 생성
		for(int i =0; i<ranArr.length; i++) {				// 1 ~ 빙고판 사이즈사이의 숫자를 for문을 이용한 초기화
			ranArr[i] = i+1;
		}
		
		// 난수 배열 섞기
		for(int i =0; i<ranArr.length; i++) {				// 랜덤으로 자리 두곳을 뽑아 배열 사이즈만큼 돌면서 위치 변경
			int ranPos1 = (int)(Math.random()*(size*size));
			int ranPos2 = (int)(Math.random()*(size*size));
			int tmp = ranArr[ranPos1];
			ranArr[ranPos1] = ranArr[ranPos2]; 
			ranArr[ranPos2] = tmp;
		}
		
		// 빙고맵 초기화 ===============================
		int count = 0;
		for(int i =0; i<map.length; i++) {						// 빙고 배열을 돌면서 난수배열에 있는 숫자들을 하나씩 대입
			for(int j = 0; j<map[i].length; j++) {
				map[i][j] = Integer.toString(ranArr[count++]);
			}
		}
		// 빙고맵 초기화 ===============================		
		
		
		
		// 빙고판 프린트 ================================
		for(int i =0; i<map.length; i++) {						// 사용자가 볼 빙고판 출력
			for(int j = 0; j<map[i].length; j++) {
				System.out.printf("%2s ", map[i][j]);
			}
			System.out.println();
		}
		// 빙고판 프린트 ================================		
		// 체크판 프린트											// 내부 실행현황을 볼수 있는 check배열 출력 코드
//		for(int i =0; i<check.length; i++) {
//			for(int j = 0; j<check[i].length; j++) {
//				System.out.printf("%d ", check[i][j]);
//			}
//			System.out.println();
//		}
		
		
		int bingoCnt = 0;
		
		System.out.println("=============빙고 게임 시작==========");
		// 반복 시작========================================================================================================================
		while(bingoCnt < 3) {										// 빙고가 3이상이면 게임 종료
			bingoCnt = 0;
			System.out.print("\n정수를 입력하세요 : ");					
			int num = sc.nextInt();									// 사용자 입력
			if(num < 1 || num > size*size) {						// 입력이 1보다 작거나 빙고판 범위보다 클경우 다시 입력
				continue;
			}
			
			String input = Integer.toString(num);					// 사용자입력을 정수로 받아 필요한 계산 끝낸후 비교를 위해 문자열로 형변환
			
			// 위치 가져오기 ==================================
			int[] pos = new int[2];									// 위치 정보를 가져오기 위한 배열 생성
			for(int i =0; i<map.length; i++) {						// 빙고판을 돌면서 
				for(int j =0; j<map[i].length; j++) {
					if(map[i][j].equals(input)) {			// 맞는 위치를 찾았다면
						pos[0] = i;							// 위치 가져오기
						pos[1] = j;	
					}
				}
			}
//			System.out.printf("위치 : (%d, %d)\n", pos[0], pos[1]);
			// 위치 가져오기 ==================================
			
			// 빙고 출력 맵에 별 추가
			map[pos[0]][pos[1]] = "★";						// 사용자가 입력한 위치에 ★로 갱신
			
			// 빙고 체크 배열에 체크
			check[pos[0]+1][pos[1]+1] = 1;					// 빙고갯수를 확인할 수 있는 check배열에 해당위치 1로 갱신(빙고체크는 빙고맵보다 인덱스가 1 높다)
			
			int rowBingo = 0;								// 행빙고 갯수
			int colBingo = 0;								// 열빙고 갯수
			// 행 빙고 검사
			for(int i = 1; i<check.length; i++) {
				rowBingo += check[pos[0]+1][i];				// 사용자가 입력한 위치좌표가 속해있는 행
			}
			if(rowBingo == size) {							// 행에 저장된 값이 빙고 사이즈와 같으면
				check[pos[0]+1][0] = 1;						// 해당 행의 빙고 여부 저장 인덱스의 값을 1로 갱신
			}
			// 열 빙고 검사
			for(int i = 1; i<check.length; i++) {			
				colBingo += check[i][pos[1] + 1];			// 사용자가 입력한 위치좌표가 속해있는 열
			}
			if(colBingo == size) {							// 열의 저장된 값이 빙고 사이즈와 같으면
				check[0][pos[1] + 1] = 1;					// 해당 열의 빙고 여부 저장 인덱스의 값을 1로 갱신
			}
			
			// 총 빙고 체크 =======================
			
			// 열 빙고 갯수
			for(int i = 1; i<check.length; i++) {			// 열의 빙고 여부 저장 인덱스의 값을 카운트
				bingoCnt += check[0][i];
			}
			
			// 행 빙고 갯수
			for(int i = 1; i<check.length; i++) {			// 행의 빙고 여부 저장 인덱스의 값을 카운트
				bingoCnt += check[i][0];
			}
			
			// 대각선 빙고 체크=====================
			int toRight = 0;								// 오른쪽을 향하는 대각선 빙고
			int toLeft = 0;									// 왼쪽을 향하는 대각선 빙고 
			for(int i = 0; i < size; i++) {
				toRight += check[i+1][i+1]; 
				toLeft += check[i+1][size - i];
			}
			if(toRight == size) {
				bingoCnt++;
			}
			if(toLeft == size) {
				bingoCnt++;
			}
			
			// 빙고판 프린트 ================================
			for(int i =0; i<map.length; i++) {
				for(int j = 0; j<map[i].length; j++) {
					System.out.printf("%2s ", map[i][j]);
				}
				System.out.println();
			}
			// 빙고판 프린트 ================================		
			// 체크판 프린트
//			for(int i =0; i<check.length; i++) {
//				for(int j = 0; j<check[i].length; j++) {
//					System.out.printf("%d ", check[i][j]);
//				}
//				System.out.println();
//			}
			// 총 빙고 체크 =======================		
			System.out.println("빙고 개수 : " + bingoCnt);
		}
		System.out.println("***** BINGO *****");
	}
}
