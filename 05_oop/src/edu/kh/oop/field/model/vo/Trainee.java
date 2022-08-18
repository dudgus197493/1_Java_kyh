package edu.kh.oop.field.model.vo;

public class Trainee {		// 훈련생
	public String name; 	// 이름
	public String phone; 	// 전화번호
	public String email = "aaa";		// 이메일(선택)
	public int salary;		// 급여(훈련수당)
	
	public static char classRoom;	// 강의장
	
	// 명시적 초기화 : 필드를 선언 시 동시에 초기화
	// ex) public String email = "없음";
	
	// 초기화 블럭 : 객체(instance) 객체의 필드를 초기화 하는 블럭 -> 많이 사용하지 않는다.
	// 1. instance block : static이 없는 필드 값 초기화(생성 시 마다)
	// 2. static block : static이 있는 필드 값 초기화(프로그램 실행 시 1회)
	
	{	// instance block
		email = "없음";
		salary = 116000;
		// classRoom = 'A';		// static 변수를 instance 초기화 블럭에서 초기화하면 인스턴스 생성 시 마다 스태틱영역의 변수를 초기화 -> 성능 낭비
	}
	
	static {
		classRoom = 'A';
	}
}
