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
	}
}
