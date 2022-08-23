package edu.kh.inheritance.model.vo;

public class Student extends Person{
	// 자식 Student 클래스에
	// 부모 Person 클래스의 멤버(필드, 메서드)를 상속
	
	// extends : 확장하다
	// -> 자식이 자기의 멤버 + 부모의 멤버를 가지게 되어
	//    몸집이 커짐(확장됨)
	
	
//	private String name;
//	private int age;
	
	private int grade;
	private int classRoom;
	
	public Student() {
		// Person(); // 부모 생성자 상속 x
		
		super();	// super 생성자
		// 부모의 생성자를 참조하기 위해서 사용하는 생성자
		// 자식 생성자 내부 첫 번째 줄에만 작성 가능
		
		// -> 자식 객체 생성 시 내부에
		// 	  부모 객체를 생성할 때 사용한다.
		
		// -> 자식 생성자 첫 번째줄에
		// super() 생성자 미작성 시 컴파일러가 자동 추가.
	}
	
	// 매개변수 생성자
	public Student(String name, int age, int grade, int classRoom) {
//		this.name;
//		this.age;
		// -> 모든 클래스는 캡슐화 원칙에 의해 특별한 이유가 없으면 접근제한자로 private를 쓴다.
		// -> 상속 받은 자식도 부모의 private 필드에 직접 접근은 불가능 하다.
		
		// 부모 클래스 필드 초기화 방법
		// 1. 부모의 getter/setter 이용
//		setName(name);
//		super.setAge(age); super 참조 변수
		// 2. super() 생성자 이용
		super(name, age);
		
		
		this.grade = grade;
		this.classRoom = classRoom;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}

	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	// Person으로 부터 상속 받은introduce() 메서드 오버라이딩(재정의)
	@Override
	public void introduce() {
//		System.out.println("이름 : " + super.getName());
//		System.out.println("나이 : " + super.getAge());
		super.introduce();
		// 오버라이딩 되지 않은 부모의 introduce() 메서드를 호출
		// -> 오버라이딩한 메서드에 부모의 메서드와 중복되는 코드가 있을 때
		System.out.println("학년 : " + this.getGrade());
		System.out.println("반 : " + this.getClassRoom());
	}
	
//	@Override
//	public void ex10() {	// 에러
//		
//	}
	// 오버로딩과 오버라이딩
	// 오버로딩 : 매개변수 타입, 개수 , 순서, 1개라도 달라야 함
	// 오버라이딩 : 부모 메서드와 똑같이 작성하는게 보통
	
	/* Annotaion(@) : 컴파일러용 주석
	 * -> 컴파일러에게 해당 코드가 무엇을 의미하는지
	 *    아니면 해당 코드를 수행하기 전에 무엇을 해야하는지 등을 알려줌
	 * 
	 * 	  @Override
	 *    1. 커마일러에게 해당 메서드는 오버라이딩 되었음을 알려줌
	 *    2. 오버라이딩이 가능한지, 잘못 작성되지 않았는지 검사
	 * */
}
