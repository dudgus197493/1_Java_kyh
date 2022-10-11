package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Bingo2 {

	public static void main(String[] args) {
//		1. 빙고판 크기를 입력 받아, 그 크기 만큼의 행과 열을 가지는 2차원 배열(빙고판)을 생성하고
//		1부터 크기*크기 사이의 정수 난수를 무작위 배치.
		
//		2. 정수를 입력 받아 빙고판에서 일치하는 부분을 찾아 해당 부분의 숫자를 “★“로 변경하고
//		현재 빙고 카운트가 몇인지 출력.
//		단, 빙고판에 없는 정수를 입력한 경우 “다시 입력해주세요.“ 출력
		
//		3. 가로, 세로, 대각선 한 줄이 모두 “★“로 변경되어 있을 경우 빙고 카운트를 1 증가
		
//		4. 빙고카운트가 3이상이 되면 “***Bingo!***” 를 출력하고 프로그램 종료.
		
		
		Scanner sc = new Scanner(System.in);
		
		// 빙고판 크기 입력 : 
		System.out.print("빙고판 크기 입력 : ");
		int size = sc.nextInt();
		
		// 빙고판 생성
		// 크기 : 입력받은크기*입력받은크기
		String[][] map = new String[size][size];
		int[][] check = new int[size+1][size+1];			// 빙고 여부를 체크할 인덱스 1 추가
															// ＊ 코드의 전체적인 동작 과정
															// 1. 배열의 모든 요소 0으로 초기화
															// 2. 유저가 입력한 좌표 (x, y) 1로 갱신
															// 3. 유저가 입력할 때마다 그 좌표가 속해있는 열과 행의 합을 각각 계산
															// 4. 합이 빙고판의 사이즈와 같다면 빙고(각 열과 행의 0번째 인덱스는 빙고 여부를 계산하기 위한 공간 0 : false / 1 : true)
															// 5. 유저가 입력할 때마다 각열과 대각선의 빙고수를 계산해서 3 이상 넘으면 break;
		// 빙고판 초기화
		initBingo(map);
		
		// 빙고판 출력
		printBingoMap(map);
		System.out.println();
		
		// 빙고 시작
		int bingoCount = startBingo(map, check);
		System.out.println("빙고 개수 : " + bingoCount);
	
		System.out.println("***** BINGO *****");
	}		

	
	public static void initBingo(String[][] bingoMap) {
		int size = bingoMap.length;
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
		for(int i =0; i<bingoMap.length; i++) {						// 빙고 배열을 돌면서 난수배열에 있는 숫자들을 하나씩 대입
			for(int j = 0; j<bingoMap[i].length; j++) {
				bingoMap[i][j] = Integer.toString(ranArr[count++]);
			}
		}
	}
	
	public static void printBingoMap(String[][] bingoMap) {
		for(int i =0; i<bingoMap.length; i++) {						// 사용자가 볼 빙고판 출력
			for(int j = 0; j<bingoMap[i].length; j++) {
				System.out.printf("%2s ", bingoMap[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int startBingo(String[][] bingoMap, int[][] check) {
		Scanner sc = new Scanner(System.in);
		int size = bingoMap.length;
		int bingoCnt = 0;
		System.out.println("=============빙고 게임 시작==========");
		// 반복 시작========================================================================================================================
		// 빙고가 3이상이면 게임 종료
		while(bingoCnt < 3) {										
			bingoCnt = 0;
			System.out.print("\n정수를 입력하세요 : ");					
			int num = sc.nextInt();									// 사용자 입력
			if(num < 1 || num > size*size) {						// 입력이 1보다 작거나 빙고판 범위보다 클경우 다시 입력
				continue;
			}
			
			String input = Integer.toString(num);					// 사용자입력을 정수로 받아 필요한 계산 끝낸후 비교를 위해 문자열로 형변환
			
			// 사용자가 입력한 숫자의 빙고판(2차원배열)에서의 위치 가져오기
			// 위치 가져오기 ==================================
			int[] pos = new int[2];									// 위치 정보를 가져오기 위한 배열 생성
			for(int i =0; i<bingoMap.length; i++) {						// 빙고판을 돌면서 
				for(int j =0; j<bingoMap[i].length; j++) {
					if(bingoMap[i][j].equals(input)) {			// 맞는 위치를 찾았다면
						pos[0] = i;							// 위치 가져오기
						pos[1] = j;	
					}
				}
			}
			
			// 사용자가 입력한 위치에 ★로 갱신
			bingoMap[pos[0]][pos[1]] = "★";						
			
			// 갱신된 빙고판 출력
			printBingoMap(bingoMap);
			
			// 빙고 체크 배열에 체크
			check[pos[0]+1][pos[1]+1] = 1;
			
			// 이번 입력으로 빙고가 생겼는지 체크
			int checkCount = checkBingo(check, pos);
			
			// 빙고가 생겼으면 총 빙고 갯수 카운트
			if(checkCount > 0) {
				bingoCnt = countTotalBingo(check);
			}
		}
		return bingoCnt;
	}
	
	public static int checkBingo(int[][] check, int[] pos) {
		int size = check.length -1;
		int rowBingo = 0;								// 행빙고 갯수
		int colBingo = 0;								// 열빙고 갯수
		int count = 0;
		// 행 빙고 검사
		for(int i = 1; i<check.length; i++) {
			rowBingo += check[pos[0]+1][i];				// 사용자가 입력한 위치좌표가 속해있는 열
		}
		if(rowBingo == size) {
			check[pos[0]+1][0] = 1;
			count++;
		}
		// 열 빙고 검사
		for(int i = 1; i<check.length; i++) {			 
			colBingo += check[i][pos[1] + 1];
		}
		if(colBingo == size) {
			check[0][pos[1] + 1] = 1;
			count++;
		}
		return count;	
	}
	
	public static int countTotalBingo(int[][] check) {
		int size = check.length - 1;
		int totalBingo = 0;
		
		for(int i = 1; i<check.length; i++) {
			totalBingo += check[0][i];
		}
		
		// 행 빙고 갯수
		for(int i = 1; i<check.length; i++) {
			totalBingo += check[i][0];
		}
		
		// 대각선 빙고 체크=====================
		int toRight = 0;
		int toLeft = 0;
		for(int i = 0; i < size; i++) {
			toRight += check[i+1][i+1]; 
			toLeft += check[i+1][size - i];
		}
		if(toRight == size) {
			totalBingo++;
		}
		if(toLeft == size) {
			totalBingo++;
		}
		
		return totalBingo;
	}
}
