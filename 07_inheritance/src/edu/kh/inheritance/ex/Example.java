package edu.kh.inheritance.ex;

import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class Example {
	
	public void ex1() {
		// 상속 확인
		
		// Student 자식 객체 생성
		Student s1 = new Student();
		
		// 자식만의 기능/필드 (grade, classRoom)
		s1.setGrade(2); 	// setGrade(int grade) : void - Student (Student의 메서드)
		s1.setClassRoom(3); // - Student
		
		s1.setName("홍길동");	// setName(String name) : void - Person (Person의 메서드)
							// -> 부모인 Person으로 부터 상속 받은 메서드라는 뜻
		s1.setAge(24);		// - Person
		
		// int edu.kh.inheritance.model.vo.Student.getGrade()
		System.out.println(s1.getGrade());
		System.out.println(s1.getClassRoom());
		
		// String edu.kh.inheritance.model.vo.Person.getName()
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		Person p1 = new Person();
		
		// int java.lang.Object.hashCode()
		// -> Object 클래스는 모든 클래스의 최상위 부모
		// == 모든 클래스는 Object 클래스의 후손
		System.out.println(p1.hashCode());
		
		System.out.println(s1.hashCode());
		// -> 상속은 누적
		// Object -> Person -> Student
		
		Student s2 = new Student("김학생", 17, 1, 5);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getGrade());
		System.out.println(s2.getClassRoom());
	}
	
	public void ex2() {
		// 오버라이딩 : 재정의
		
		Person p1 = new Person("홍길동", 15);
		Student s1 = new Student("김학생", 17, 1, 5);
		
		p1.introduce();
		System.out.println("------------");
		s1.introduce(); // Person 상속 받음
		// void edu.kh.inheritance.model.vo.Student.introduce()
		// -> 오버라이딩 진행 시 Student의 메서드로 인식됨

	}
}
