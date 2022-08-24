package edu.kh.poly.ex2.model.vo;

public abstract class Animal {
	// breath() 라는 추상 메서드를 포함하고 있기 때문에
	// 해당 클래스는 추상 클래스가 된다. (abstract 작성)
	
	// 필드
	private String type;	// 종
	private String eatType; // 식성
	
	// 생성자
	public Animal() { }
	// -> 추상 클래스는 직접적인 객체 생성이 불가능해서
	//	  생성자가 필요 없을 것 같지만
	//    자식 객체 생성 시
	//    내부 부모 객체 생성에 사용 (super 키워드로 호출)
	// - 추상 메서드 부분은 자식이 오버라이딩 하여 동적 바인딩으로 처리한다.
	
	// getter / setter 
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	
	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	public String getEatType() {
		return this.eatType;
	}	
	
	// 미완성된 기능(추상 메서드)
	public abstract void breath(); // The abstract method breath in type Animal can only be defined by an abstract class
	// -> 자식 클래스에 추상 메서드의 이름만을 공통적으로 제공
	//    상속 받은 자식이 해당 메서드를 오버라이딩
}
