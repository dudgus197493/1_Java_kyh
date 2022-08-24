package edu.kh.exception.model.vo;

import java.io.EOFException;

public class Child extends Parent {

	@Override
	public void method() throws EOFException { // Exception Exception is not compatible with throws clause in Parent.method()
							// IOException -> Exception : 변경 불가
							// Exception이 더 넓은(많은) 예외 처리가 가능
		
							// IOException -> EOFException : 변경 가능
							// Exception이 더 좁은(구체적인) 예외 처리이기 때문에 가능
	}
}
