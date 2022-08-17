package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
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
															// 
		
		// 랜덤 난수를 중복없이 채우기위한 배열
		int[] ranArr = new int[size*size];
		for(int i =0; i<ranArr.length; i++) {
			ranArr[i] = i+1;
		}
		
		// 난수 배열 섞기
		for(int i =0; i<ranArr.length; i++) {
			int ranPos1 = (int)(Math.random()*(size*size));
			int ranPos2 = (int)(Math.random()*(size*size));
			int tmp = ranArr[ranPos1];
			ranArr[ranPos1] = ranArr[ranPos2]; 
			ranArr[ranPos2] = tmp;
		}
		
		// 빙고맵 초기화 ===============================
		int count = 0;
		for(int i =0; i<map.length; i++) {
			for(int j = 0; j<map[i].length; j++) {
				map[i][j] = Integer.toString(ranArr[count++]);
			}
		}
		// 빙고맵 초기화 ===============================		
		
		
		
		// 빙고판 프린트 ================================
		for(int i =0; i<map.length; i++) {
			for(int j = 0; j<map[i].length; j++) {
				System.out.printf("%2s ", map[i][j]);
			}
			System.out.println();
		}
		// 빙고판 프린트 ================================		
		// 체크판 프린트
//		for(int i =0; i<check.length; i++) {
//			for(int j = 0; j<check[i].length; j++) {
//				System.out.printf("%d ", check[i][j]);
//			}
//			System.out.println();
//		}
		
		
		int bingoCnt = 0;
		
		System.out.println("=============빙고 게임 시작==========");
		// 반복 시작========================================================================================================================
		while(bingoCnt < 3) {
			bingoCnt = 0;
			System.out.print("정수를 입력하세요 : ");
			String input = sc.next();
			

			// 위치 가져오기 ==================================
			int[] pos = new int[2];
			for(int i =0; i<map.length; i++) {
				for(int j =0; j<map[i].length; j++) {
					if(map[i][j].equals(input)) {		// 맞는 위치를 찾았다면
						pos[0] = i;						// 위치 가져오기
						pos[1] = j;	
					}
				}
			}
//			System.out.printf("위치 : (%d, %d)\n", pos[0], pos[1]);
			// 위치 가져오기 ==================================
			
			// 빙고 출력 맵에 별 추가
			map[pos[0]][pos[1]] = "★";
			
			// 빙고 체크 배열에 체크
			check[pos[0]+1][pos[1]+1] = 1;		// 빙고체크는 빙고맵보다 인덱스가 1 높다
			
			// 행 빙고 검사
			int rowBingo = 0;
			int colBingo = 0;
			for(int i = 1; i<check.length; i++) {
				rowBingo += check[pos[0]+1][i];
			}
			if(rowBingo == size) {
				check[pos[0]+1][0] = 1;
			}
			// 열 빙고 검사
			for(int i = 1; i<check.length; i++) {
				colBingo += check[i][pos[1] + 1];
			}
			if(colBingo == size) {
				check[0][pos[1] + 1] = 1;
			}
			
			// 총 빙고 체크 =======================
			
			// 열 빙고 갯수
			for(int i = 1; i<check.length; i++) {
				bingoCnt += check[0][i];
			}
			
			// 행 빙고 갯수
			for(int i = 1; i<check.length; i++) {
				bingoCnt += check[i][0];
			}
			
			// 대각선 빙고 체크=====================
			int toRight = 0;
			int toLeft = 0;
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
