package edu.kh.poly.ex2.model.vo;


// 계산기 인터페이스
// -> 모든 계산기에 대한 공통 필드, 기능명을 제공하는 접점
public interface Calculator {
	public static final double PI = 3.14;
	static final int MAX_NUM = 1000000; 	// 100만
	final int MIN_NUM = -1000000; 			// -100만
	int P_NUM = 333;
	// --> 예약어 어떻게 작성되든 모든필드가 public static final
	
	public abstract int plus(int num1, int num2);	// 더하기
	
	abstract int minus(int num1, int num2);			// 빼기
	
	int multiple(int num1, int num2);				// 곱하기
	
	double divide(int num1, int num2);				// 나누기
	
	
	/**
	 * @param r	반지름
	 * @return 원의 넓이
	 */
	abstract double areaOfCircle(double r);			// 원의 넓이
	
	/**
	 * @param a
	 * @param b
	 * @return a의 b제곱
	 */
	double pow(double a, int b); 				// 거듭 제곱
}
