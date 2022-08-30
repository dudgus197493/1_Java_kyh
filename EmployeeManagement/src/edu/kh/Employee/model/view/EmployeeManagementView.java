package edu.kh.Employee.model.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import edu.kh.Employee.model.service.EmployeeManagementService;
import edu.kh.Employee.model.vo.Employee;

public class EmployeeManagementView {
	Scanner sc = new Scanner(System.in);
	EmployeeManagementService service = new EmployeeManagementService();
	
	public void displayMenu() {
		
		int input = -1;
		do {
			System.out.println("\n------------ 사원관리 프로그램 ------------");
			System.out.println("1. 새로운 사원 정보 추가");

			System.out.println("2. 전체 사원 정보 조회");

			System.out.println("3. 사번이 일치하는 사원 정보 조회");

			System.out.println("4. 사번이 일치하는 사원 정보 수정");

			System.out.println("5. 사번이 일치하는 사원 정보 삭제");

			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");

			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");

			System.out.println("8. 부서별 급여 합 전체 조회");

			System.out.println("0. 프로그램 종료");
			System.out.print("입력 >> ");
			try {
				input = sc.nextInt();
				switch(input) {
				case 1 : this.insertEmployee(); break;
				case 2 : this.selectAllEmployee(); break;
				case 3 : this.selectEmployee(); break;
				case 4 : this.updateEmployee();	break;
				case 5 : this.deleteEmployee(); break;
				case 6 : this.selectDepartmentTitle(); break;
				case 7 : this.selectSalay(); break;
				case 8 : this.selectDepartmentalSalary(); break;
				case 0 : System.out.println("프로그램을 종료합니다."); break;
				default : System.out.println("잘못 입력하셨습니다."); break;
				}
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력해주세요");
				input = -1;
				sc.nextLine();
			}
		} while (input != 0);
	}
	
	private void insertEmployee() {
		
		System.out.print("사원 이름 : ");
		String empName = sc.next();
		
		System.out.print("주민등록번호 : ");
		String empNo = sc.next();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("전화번호 : ");
		String phone = sc.next();;
		
		System.out.print("부서명 : ");
		String departmentTitle = sc.next();
		
		System.out.print("직급명 : ");
		String jobName = sc.next();
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		if(service.insertEmployee(empName, empNo, email, phone, departmentTitle, jobName, salary)) {
			System.out.println("새로운 사원 정보가 추가되었습니다.");
		} else {
			System.out.println("정보 추가 도중 에러가 발생했습니다.");
		}
	}
	
	private void selectAllEmployee() {
		List<Employee> employeeList = service.selectAllEmployee();
		if(employeeList.isEmpty()) {
			System.out.println("등록된 사원이 없습니다.");
		} else {
			printEmployeeList(employeeList);
		}
	}

	private void selectEmployee() {
		Employee result = null;
		System.out.println("사원 정보 조회(사원 번호)");
		System.out.print("사원번호 입력 : ");
		int searchEmpId = sc.nextInt();
		sc.nextLine();
		if((result = service.selectEmployee(searchEmpId)) != null) {
			System.out.println(result);
		} else {
			System.out.println("해당하는 번호를 가진 사원이 없습니다.");
		}
	}
	
	private void updateEmployee() {
		System.out.println("사원 정보 수정(사원 번호)");
		
		System.out.print("정보를 수정할 직원 사원번호 : ");
		int updateEmpId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수정할 이메일 : ");
		String updateEmail = sc.next();
		
		System.out.print("수정할 전화번호 : ");
		String updatePhone = sc.next();
		
		System.out.print("수정할 부서명 : ");
		String updateDepartmentTitle = sc.next();
		
		System.out.print("수정할 직급명 : ");
		String updateJopName = sc.next();
		
		System.out.print("수정할 급여 : ");
		int updateSalary = sc.nextInt();
		
		if(service.updateEmployee(updateEmpId, updateEmail, updatePhone, updateDepartmentTitle, updateJopName, updateSalary)) {	// 사원 정보 수정에 성공하면
			System.out.println("사원 정보 수정이 완료되었습니다.");
		} else {
			System.out.println("해당하는 번호를 가진 사원이 없습니다.");
		}
	}
	
	private void deleteEmployee() {
		System.out.print("정보를 삭제할 사원의 사원번호 : ");
		int delEmpId = sc.nextInt();
		
		if(service.deleteEmployee(delEmpId)) {
			System.out.println("사원 정보 삭제가 완료되었습니다.");
		} else {
			System.out.println("해당하는 번호를 가진 사원이 없습니다.");
		}
	}
	
	private void printEmployeeList(List<Employee> empList) {
		System.out.println("사원번호|  이름  |      주민번호      |      이메일      |     전화번호    | 부서명 | 직급명 | 급여");
		for(Employee e : empList) {
			System.out.println(e);
		}
	}
	
	private void selectDepartmentTitle() {
		List<Employee> empList = null;
		System.out.print("부서명 입력 : ");
		String departmentTitle = sc.next();
		
		if((empList = service.getEmployeeList(departmentTitle)).size() == 0) {
			System.out.println("입력한 부서에 해당하는 사원이 없습니다.");
		} else {
			printEmployeeList(empList);
		}
	}
	
	private void selectSalay() {
		List<Employee> empList = null;
		System.out.println("기준 급여 입력 : ");
		int salary = sc.nextInt();
		
		if((empList = service.getEmployeeList(salary)).size() == 0) {
			System.out.println("입력한 급여이상을 받는 사원이 없습니다.");
		} else {
			printEmployeeList(empList);
		}
	}
	
	private void selectDepartmentalSalary() {
		Map<String, Integer> salaryHash = null;
		if((salaryHash = service.selectDepartmentalSalary()).size() != 0) {
			for(String key : salaryHash.keySet()) {
				System.out.printf("부서명 : %s , 급여합 : %d\n", key, salaryHash.get(key));
			}
		}
	}
}
