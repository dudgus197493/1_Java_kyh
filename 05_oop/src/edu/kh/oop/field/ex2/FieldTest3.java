package edu.kh.oop.field.ex2;

import edu.kh.oop.field.ex1.FieldTest;

public class FieldTest3 extends FieldTest{
// [접근제한자] [예약어] class 클래스명 [상속관계]
	
	public void ex() {
		System.out.println("다른 패키지, 다른 클래스");
		FieldTest f = new FieldTest();
		System.out.println(f.v1);	// public
		// System.out.println(f.v2);	// protected *에러 : 다른 패키지, 상속관계 x
		
		System.out.println(v2);			
		// int edu.kh.oop.field.ex1.FieldTest.v2
		// 상속 관계에선 protected 직접 접근 가능
		// System.out.println(f.v2); 상속 받은 v2가 아니라 새로만든 다른 인스턴스의 v2 (접근불가)
		
		// System.out.println(f.v3);	// default   *에러 : 다른 패키지
		// System.out.println(f.v4);	// private	 *에러 : 다른 클래스
	}
}
