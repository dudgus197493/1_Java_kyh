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
				rowBingo += check[pos[0]+1][i];				// 사용자가 입력한 위치좌표가 속해있는 열
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
	
	public void BingoGame() {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("빙고판 크기 지정 : ");
	      int row = sc.nextInt();
	      
	      boolean flag = false;
	      String[][] array = new String[row][row];
	      for(int i=0; i< array.length; i++) {
	         for(int y=0; y< array[i].length; y++) {					// 배열 돌면서
	            int ran = (int)(Math.random()*row*row+1);				// 난수 생성
	             array[i][y]= String.valueOf(ran);						// 정수형 난수를 문자열로 바꿔 대입		
	            flag = false;	// 중복여부 확인 위한 논리값
	            for(int ix =0; ix <= i; ix++) {
	               if(flag) {
	                  break;
	               }
	               for(int x=0; x < array[i].length; x++) {
	                  if((i) == ix && x >=y) {
	                     flag = true;
	                     break;
	                  }
	                  //System.out.println(x+":"+array[i][x].equals(String.valueOf(ran)));
	                  if(array[ix][x].equals(String.valueOf(ran))) {
	                     //array[i][x]==String.valueOf(ran)
	                     y--;
	                     flag = true;
	                     break;
	                  }
	               }   
	            }
	         }
	      }
	      for(int i=0; i< array.length; i++) {
	            for(int y=0; y< array[i].length; y++) {
	               System.out.print(array[i][y]+" ");
	            }
	            System.out.println();
	         }   
	      System.out.println("============빙고게임 시작============");
	      
	      while(true) {
	         int roundCount =0;
	         int[][] bingoCount = new int[row+1][row+1];
	         System.out.print("정수를 입력하시오 : ");
	         int bingo = sc.nextInt();
	         if(1 > bingo || bingo > row*row) {
	            System.out.println("다시 입력해수세요");
	            continue;
	         }
	         for(int i=0; i< array.length; i++) {
	             for(int y=0; y< array[i].length; y++) {
	                if(array[i][y].equals(String.valueOf(bingo))) {
	                   array[i][y] ="★";
	                }
	                System.out.print(array[i][y]+" ");
	             }
	             System.out.println();
	          }
	         for(int i=0; i< array.length; i++) {
	             for(int y=0; y< array[i].length; y++) {
	                if(array[i][y].equals("★")) {
	                   bingoCount[i][row] +=1;
	                   bingoCount[row][y] +=1;
	                   if(i==y) {
	                      bingoCount[row][row]+=1;
	                   }
	                   if((i==0&&y==4)||(i==1&&y==3)||(i==2&&y==2)||(i==3&&y==1)||(i==4&&y==0)) {
	                      bingoCount[0][0]+=1;
	                   }
	                }
	             }
	          }
	         for(int y=0; y< bingoCount.length; y++) {
	            if(bingoCount[5][y]==5) {
	               roundCount++;
	            }
	            if(bingoCount[0][y]==5) {
	               roundCount++;
	            }
	         }
	         for(int i=0; i< bingoCount.length-1; i++) {
	            if(bingoCount[i][5]==5) {
	               roundCount++;
	            }
	         }
	         
	         
	         System.out.printf("현재 %d빙고\n",roundCount);
	         if(roundCount>=3) {
	            System.out.println("***** BINGO!!! *****");
	            break;
	         }
	      }                                                  
	      
	      
	   }
}
