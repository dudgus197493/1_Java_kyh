package edu.kh.array.ex;

import java.util.Scanner;

public class BingoGame2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 호랑이 팽귄 원숭이 코끼리 사자 여우 강아지 고양이 표범
		
		
		// 빙고 주제 입력
		System.out.print("빙고 주제를 입력해주세요 : ");
		String theme = sc.next();
		
		// 빙고 크기 입력
		System.out.print("빙고판 크기를 입력해주세요[3 ~ 9] : ");
		int N = sc.nextInt();
		
		// 빙고 판 생성
		String[][] bingoMap = setBingo(theme, N);
		
		// 빙고 체크 배열
		int[][] checkBingo = new int[N + 1][N + 1]; 	// 빙고 달성 여부를 저장할 공간 추가 할당
		
		startBingo(bingoMap, checkBingo, N);
	}
	
	// 빙고판 세팅
	public static String[][] setBingo(String theme, int size) {
		Scanner sc = new Scanner(System.in);
		
		String[][] map = new String[size][size];
		
		for(int i =0; i<map.length; i++) {
			for(int j = 0; j<map[i].length; j++) {
				printMap(map);
				System.out.printf("\n주제에 맞는 키워드를 입력하세요 [%s] : ", theme);
				map[i][j] = sc.next();
			}
		}
		
		System.out.println("\n======= 최종 빙고 판 =======");
		printMap(map);
		
		return map;
	}
	
	// 빙고 시작
	public static void startBingo(String[][] map, int[][] checkMap, int size) {
		Scanner sc = new Scanner(System.in);
		
		int bingoCnt = 0;				// 3이 되면 게임 종료
		
		while(bingoCnt < 3) {
			
			System.out.print("빙고판에 있는 키워드중 하나를 입력하세요! : ");
			String keyword = sc.next();
			
			int[] pos = getPos(map, keyword);
			
			printMap(map);
			
			// 키워드 체크
			if(checkMap[pos[0] + 1][pos[1] + 1] == 1) {			// 이미 체크된 키워드면
				System.out.println("이미 체크된 키워드입니다. 다시 입력해주세요.");
				continue;
			}
			
			checkMap[pos[0] + 1][pos[1] + 1] = 1;
			
			// 행 빙고
			checkRow(checkMap, pos[0]+1, size);
			// 열 빙고
			checkCol(checkMap, pos[1]+1, size);
			
//			printCheck(checkMap);			  내부 동작 로그 확인 
			
			bingoCnt = countBingo(checkMap, size);	// 빙고 갯수 확인
			System.out.println("현재 빙고 수 : " + bingoCnt);
		}
		System.out.println("\n목표 빙고 달성!\n");
		System.out.printf("달성한 빙고 수 : %d", bingoCnt);
	}
	
	public static void checkRow(int[][] checkMap, int row, int size) {
		int sum = 0;
		for(int i =1; i < checkMap[row].length; i++) {
			sum += checkMap[row][i];
		}
		
		if(sum == size) {	// 해당 행이 빙고면
			checkMap[row][0] = 1;
		}
		
//		return sum == size;
	}
	public static void checkCol(int[][] checkMap, int col, int size) {
		int sum = 0;
		for(int i = 1; i<checkMap[col].length; i++) {
			sum += checkMap[i][col];
		}
		if(sum == size) {	// 해당 열이 빙고면
			checkMap[0][col] = 1;
		}
//		return sum == size;
	}
	
	// 대각 빙고 체크
	public static int checkCross(int[][] checkMap, int size) {
		int count = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i<size; i++) {
			sum1 += checkMap[i+1][i+1];
			sum2 += checkMap[i+1][size - i];
		}
		if(sum1 == size) {
			count++;
		}
		if(sum2 == size) {
			count++;
		}
		
		return count;
	}
	
	public static int countBingo(int[][]checkMap, int size) {
		int cnt = 0;
		
		
		// 열 빙고 갯수 새기
		for(int i =1; i<checkMap.length; i++) {
			cnt += checkMap[0][i];
		}
			
			
		// 행 빙고 갯수 새기
		for(int i =1; i<checkMap.length; i++) {
			cnt += checkMap[i][0];
		}
		
		
		// 대각 선 빙고 갯수 새기
		cnt += checkCross(checkMap, size);
		
		return cnt;
	}
	
	
	// 키워드 위치(좌표) 반환
	public static int[] getPos(String[][] map, String keyword) {
		int[] pos = new int[2];
		
		for(int i =0; i<map.length; i++) {
			for(int j =0; j<map[i].length; j++) {
				if(map[i][j].equals(keyword)) { 		// 해당 좌표의 문자열이 키워드와 같으면
					map[i][j] += " O";					// 빙고판에 이미 불린 키워드 체크
					pos[0] = i;
					pos[1] = j;
				}
			}
		}
		return pos;
	}
	
	// 빙고판 출력 함수
	public static void printMap(String[][] map) {
		for(int i =0; i < map.length; i++){
			for(int j = 0; j<map[i].length; j++) {
				System.out.printf("%5s", map[i][j]);
			}
			System.out.println();
		}
	}
	
	// 체크판 출력 함수
	public static void printCheck(int[][] map) {
		for(int i =0; i < map.length; i++){
			for(int j = 0; j<map[i].length; j++) {
				System.out.printf("%3d", map[i][j]);
			}
			System.out.println();
		}
	}
	
}
