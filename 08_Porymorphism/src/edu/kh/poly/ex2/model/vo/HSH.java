package edu.kh.poly.ex2.model.vo;

//클래스 상속 : extends
//-> 부모가 완성한 기능을 자식이 물려 받아서 사용
// 자식 기능 + 부모 기능 (객체의 크기가 확장)

//인터페이스 상속 : implements(구현하다)
//-> 부모가 이름만 있는 미완성 기능 물려줌
//-> 자식이 이름만 있는 메서드를 구현(오버라이딩)해서 완성시켜야됨.
public class HSH implements KH { // 황석현(A반 학생)
	public HSH() {
		super();	// Object의 생성자 : HSH의 메모리 안에 KH의 인스턴스는 생성되지 않는다.
	}
	
	@Override
	public void lesson() {
		System.out.println("A강의장에서 풀스택 웹개발 과정 수강");
	}	
}
