package edu.kh.oop.field.ex1;

public class FieldTest2 {
	
	public void ex() {
		
		FieldTest f1 = new FieldTest();
		
		System.out.println("같은 패키지, 다른 클래스");
		System.out.println(f1.v1);	// public
		System.out.println(f1.v2);	// protected
		System.out.println(f1.v3);	// default
		// System.out.println(f1.v4);	// private *에러
		// -> private은 같은 클래스 내부에서만 직접 접근 가능
		
	}
}
