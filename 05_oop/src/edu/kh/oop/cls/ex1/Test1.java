package edu.kh.oop.cls.ex1;

class Test1 {	// Illegal modifier for the class Test1; only public, abstract & final are permitted
	
	/* 접근 제한자 : 다른 클래스에서 해당 클래스로 접근할 수 있는 범위를 제한하는 키워드
	 * 
	 * 1. public		: 같은 프로젝트 내 어디서든지 접근 가능
	 * 2. protected		: default 범위 + 상속 관계
	 * 3. (default) 	: 같은 패키지 내에서 접근 가능
	 * 					  직접 작성하지 않고 생략
	 * 4. private		: 해당 클래스 내부에서만 접근 가능(다른 클래스 직접 접근 불가)
	 * 
	 * 필드를 작성 할때
	 * 캡슐화의 원칙(직접 접근 제한)을 위해서 보통 private을 사용한다.
	 * 
	 * */
	
	/* 클래스 : 객체의 속성, 기능을 정리한 문서(설계도)
	 * 
	 * [작성법]
	 *  // [] : 선택
	 * [접근제한자] [예약어] class 클래스명 [상속관계] {}
	 * 
	 * 클래스는 public, (default) 두 접근 제한자만 작성 가능
	 * */
	
	public void ex() {
		Test100 t100 = new Test100();
		System.out.println(t100.a);
	}
}
