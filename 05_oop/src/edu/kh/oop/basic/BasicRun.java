package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {
		
		KYH 김영현 = new KYH();	// heap 영역에 KYH 클래스에 정의된 내용을 이용하여
								// KYH객체 생성(할당)

		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : " + 김영현.name);
		System.out.println("나이 : " + 김영현.age);
		System.out.println("생년월일 : " + 김영현.birthday);
		// System.out.println("비밀번호 : " + 김영현.password);	// The field KYH.password is not visible
		
		// 비밀번호를 볼수 있는 기능을 호출 == 간접 접근 방법
		김영현.showPassword();
		
		// 객체가 가지고 있는 기능 수행
		김영현.eat();
		김영현.study();
		김영현.plus(50, 100);
		
	}

}
