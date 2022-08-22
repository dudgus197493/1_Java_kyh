package edu.kh.objectarray.model.service;

import edu.kh.objectarray.model.vo.Student;

// model : 비즈니스 로직(데이터 가공, 관리, DB 연결 등)
// service : 기능 제공용 클래스
/**
 * @author 김영현
 *
 */
public class StudentManagementService {
	
	// Student (참조 변수 5칸) 객체 배열 생성
	private Student[] stdArr = new Student[5];
	
	
	// 기본 생성자
	public StudentManagementService() {	
		stdArr[0] = new Student(3, 5, 17, "홍길동", 100, 30, 70);
		stdArr[1] = new Student(2, 3, 11, "박철수", 50, 100, 80);
		stdArr[2] = new Student(1, 7, 13, "김미영", 100, 100, 30);
		stdArr[3] = new Student(3, 8, 6, "장원영", 50, 70, 100);
	}
	
	
	/** 학생 추가 서비스 메서드
	 * @param grade
	 * @param classRoom
	 * @param number
	 * @param name
	 * @return 0(null 인덱스 없음) 1(null인 인덱스가 있어서 학생 객체 주소 추가)
	 */
	public int addStudent(int grade, int classRoom, int number, String name) {
		// 배열 요소 중 아무것도 참조하지 않는 (null)인 인덱스 찾기
		// 단, 모든 인덱스가 참조 중인 경우 0 반환
		
		// null인 인덱스 0 -> 해당 인덱스에 객체 주소 대입 후 1 반환
		// null인 인덱스 x -> 0 반환
		int idx = -1;	// null인 인덱스가 몇 번째인지 저장하는 변수
		for(int i =0; i<stdArr.length; i++) {
			if(stdArr[i] == null) {	// 새로운 학생이 추가될 수 있는 자리가 있는 경우
				idx = i;
				break;
			} 
		}
		
		if(idx == -1) {	// null인 인덱스가 없는 경우
			return 0;	// 현재 메서드를 종료하고 호출한 곳으로 0을 가지고 돌아감
		}
		
		// null인 인덱스에 학생 객체를 생성해서 주소를 대입
		stdArr[idx] = new Student(grade, classRoom, number, name);
		
		return 1;
	}
	
	/** 학생 1명 정보 조회(인덱스) 서비스 메서드
	 * @param idx(검색할 인덱스 번호)
	 * @return idx 값에 따른 결과 문자열
	 */
	public String selectIndex(int idx) {
		
		// stdArr의 인덱스 범위 : 0 ~ 4
		if(idx < 0 || idx >= stdArr.length) {	// 찾는 인덱스가 배열 범위 초과시
			return "입력된 값이 인덱스 범위를 초과했습니다.";
		} else {
			if(stdArr[idx] == null) {			// 조회할 인덱스가 비어있을 경우
				return "해당 인덱스에 학생 정보가 존재하지 않습니다.";
			} else {							// 범위 초과 X, null X -> 학생 정보 존재
				String str = "이름 : " + stdArr[idx].getName();
				str += "\n학년 : " + stdArr[idx].getGrade();
				str += "\n반 : " + stdArr[idx].getClassRomm();
				str += "\n번호 : " + stdArr[idx].getNumber();
				str += "\n국어 : " + stdArr[idx].getKor() + "점";
				str += "\n영어 : " + stdArr[idx].getEng() + "점";
				str += "\n수학 : " + stdArr[idx].getMath() + "점";
				
				return str;
			}
		} 
	}
	
	/** 학생 정보 수정 서비스 메서드
	 * @param idx
	 * @param kor
	 * @param eng
	 * @param math
	 * @return
	 * 	-1 : idx가 stdArr 배열의 범위를 초과한 경우
	 * 	0  : stdArr[idx] 인덱스가 null인 경우(참조 X)
	 * 	1  : 정상적으로 수정이 된 경우
	 */
	public int updateStudent(int idx, int kor, int eng, int math) {
		if(idx < 0 || idx >= stdArr.length) {	// idx가 음수거나 배열의 범위보다 클 때
			return -1;
		} else if(stdArr[idx] == null) {		// 접근하고자 하는 idx가 null일 때
			return 0;
		} else {								// 정상적으로 수정이 됐을 때
			stdArr[idx].setKor(kor);
			stdArr[idx].setEng(eng);
			stdArr[idx].setMath(math);
			return 1;
		}
	}
	
	/** 학생 정보 조회(이름) 서비스 메서드
	 * @param name (입력받은 이름)
	 * @return
	 * null : 검색 결과 X
	 * resultArr(null 아님) : 검색 결과 O
	 */
	public Student[] selectName(String name) {
		// stdArr 객체 배열의 각 인덱스가 참조하는 Student 객체가 있음.
		// Student 객체의 필드 값 중 name과 입력받은 name이 일치하면
		// 해당 Student 객체의 주소를 별도 객체 배열에 저장해서
		// 메서드 종료 시 반환
		
		// 반환할 검색 결과 저장용 객체 배열
		Student[] resultArr = new Student[stdArr.length];
		
		// resultArr에서 값을 대입할 인덱스 번호를 나타내는 변수
		int resultIdx = 0;
		for(int i =0; i<stdArr.length; i++) {
			if(stdArr[i] == null) {	// 더 이상 비교할 이름이 없다면
				break;				// break
			}
			
			if(stdArr[i].getName().equals(name)) {	// 학생 이름 == 입력 이름
				resultArr[resultIdx++] = stdArr[i];
				// resultIdx++ : 대입되는 인덱스를 다음으로 이동
			}
		}
		
		if(resultIdx == 0) {	// 아무것도 검색 되지 않은 경우
			return null;
		} else {
			return resultArr;
		}
	}
	
	
	public Student[] getStdArr() {
		
		return stdArr;
	}
}