package edu.kh.objectarray.model.vo;

// 값 저장용 클래스
// -> 객체로 만들어진 후 값을 저장하는 용도의 객체로 사용(데이터 관리)
public class Student {
	private int grade; 		// 학년
	private int classRomm; 	// 반
	private int number; 	// 번호
	private String name; 	// 이름
	
	private int kor;		// 국어 점수
	private int eng;		// 영어 점수
	private int math;		// 수학 점수
	
	// 기본 생성자
	public Student() { } 
	
	// 매개변수 생성자(오버로딩)
	public Student(int grade, int classRoom, int number, String name) {
		// this 참조변수 : 필드 명과 매개변수의 변수명이 같을 때 필드를 뜻하는 변수앞에 this를 붙여 멤버변수라는 것을 명시한다.
		this.grade = grade;
		this.classRomm = classRoom;
		this.number = number;
		this.name = name;
	}
	
	// 매개변수 생성자(오버로딩)
	public Student(int grade, int classRoom, int number, String name, int kor, int eng, int math) {
		// this() 생성자
		this(grade, classRoom, number, name);
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	// getter / setter
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	

	public int getClassRomm() {
		return classRomm;
	}
	public void setClassRomm(int classRomm) {
		this.classRomm = classRomm;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}
