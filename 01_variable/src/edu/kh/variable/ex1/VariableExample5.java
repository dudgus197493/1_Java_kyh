package edu.kh.variable.ex1;

public class VariableExample5 {
	public static void main(String[] args) {
		/* 출력 메서드
		 * 
		 * System.out.print([내용])
		 * -> () 안의 내용 출력 (줄바꿈 x)
		 * 
		 * System.out.println([내용])
		 * -> () 안의 내용 출력 (줄바꿈 o)
		 * 
		 * System.out.printf("내용 + 패턴" , 패턴에 들어갈 값)
		 * 
		 * 
		 * 
		 * 
		 * */
		
		System.out.print("aaaaa");
		System.out.print("bbbbb");
		System.out.println("ccccc");
		System.out.print("ddddd\n");
		
		String name = "김영현";
		int age = 24;
		char gender = '남';
		double height = 168.8;
		boolean tf = true;
		
		
		// 김영현님은 24세 남성, 키는 168.8cm 입니다 (true)
		System.out.println(name + "님은 " + age + "세 " + gender + "성, 키는 " + height + "cm 입니다 (" + tf + ")");
		
		System.out.printf("%s님은 %d세 %c성, 키는 %.1fcm 입니다 (%b)\n", name, age, gender, height, tf);
		// \n : 줄바꿈(개행)을 나타내는 탈줄(escape)문자
		System.out.println("줄 바꼈나요?");	
		
		System.out.println("새로운 내용 추가");
	}
}
