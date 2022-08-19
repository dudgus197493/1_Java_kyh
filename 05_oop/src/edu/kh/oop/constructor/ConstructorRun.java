package edu.kh.oop.constructor;

import edu.kh.oop.constructor.model.vo.Member;
import edu.kh.oop.constructor.model.vo.Temp;

public class ConstructorRun {

	public static void main(String[] args) {
		
		Member member1 = new Member();
							// 기본 생성자
		
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
		// 기본 생성자가 없어도 에러가 나지 않는다.
		// -> 클래스에 생성자가 하나도 작성되지 않으면
		//    컴파일러가 자동으로 기본생성자를 추가해준다.
		//    public Member(){} 	// Member 클래스에 자동 추가
		
		Member member5 = new Member("member22", "pass22@", "010-1234-5678", 24);
									// -> 전달 인자, 인자(Arguments)
		
		Member member6 = new Member("member1023", "pass1023", "010-1234-5678", 24);
		
		Member member7 = new Member("ididididid", "pwpwpwpwpw", "123456789", 999);
		
		Temp tmp = new Temp();
		
		
		
		
		
		
		
		System.out.println("프로그램 종료");
	}
}
