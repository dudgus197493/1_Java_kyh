package edu.kh.array.ex;

class Element {
	public boolean chacked;
	public String element;
	
	public Element(String elem) {
		this.chacked = false;
		this.element = elem;
	}
}


class BingoInfo{
	private int size;
	private Element[][] map;
	
	public BingoInfo (int size){
		this.size = size;
		this.map = new Element[size + 1][size + 1]; 	// 빙고 상태 저장하기 위한 인덱스 1 추가 할당 (각 배열의 첫 번째 인덱스)
	}
	
	// 행 빙고 확인
	
	// 열 빙고 확인
		
	// 대각 선 빙고 확인
	
}













public class BingoGame {

	public static void main(String[] args) {
		
		// 자바로 빙고 구현
		
		
		

	}

}
