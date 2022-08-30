package edu.kh.Employee.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.Employee.model.vo.Employee;

public class EmployeeManagementService {
	private List<Employee> employeeList = new ArrayList<>();
	
	public EmployeeManagementService() {
		employeeList.add(new Employee("홍길동", "930123-4421329", "rlfehd@gmail.com", "010-2345-6123", "경리부", "사원", 240));
		employeeList.add(new Employee("이순신", "920125-7691038", "tnstls@gmail.com", "010-4939-4352", "경리부", "팀장", 340));
		employeeList.add(new Employee("김심청", "850201-8504312", "tlacjd@gmail.com", "010-1205-6123", "경리부", "부장", 440));
		employeeList.add(new Employee("김상중", "910201-8571923", "dkdldjsaos@gmail.com", "010-4231-6147", "마케팅", "팀장", 440));
		employeeList.add(new Employee("이영돈", "920523-1507313", "tmkdlejaos@gmail.com", "010-8279-8271", "마케팅", "부장", 440));
	}
	
	
	/** 새로운 사원 정보 추가 서비스 메서드
	 * @param empId
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 * @return 추가 성공시 true반환, 실패시 false반환
	 */
	public boolean insertEmployee(String empName, String empNo, String email, String phone, String departmentTitle,
			String jobName, int salary) {		
		return employeeList.add(new Employee(empName, empNo, email, phone, departmentTitle, jobName, salary));
	}
	
	/** 모든 사원 정보 조회 서비스 메서드
	 * @return 모든 사원객체가 담긴 객체배열 employeeList반환 
	 */
	public List<Employee>selectAllEmployee() {
		return this.employeeList;
	}


	/** 사원 정보 조회(사원번호) 서비스 메서드
	 * @param empId 찾고자하는 사원의 사원번호
	 * @return 입력받은 사원번호를 가진 사원이 존재하면 해당 Employee객체 반환, 없으면 null반환
	 */
	public Employee selectEmployee(int empId) {
		for(Employee e : employeeList) {
			if(e.getEmpId() == empId) {
				return e;
			}
		}
		return null;
	}
	
	/** 사원 정보 수정(사원 번호) 서비스 메서드
	 * @param updateEmpId
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 * @return 입력받은 사원번호를 가진 사원이 없으면 false반환, 있으면 정보 수정후 true반환
	 */
	public boolean updateEmployee(int updateEmpId, String email, String phone, String departmentTitle, String jobName, int salary) {
		Employee emp = null;
		 
		if((emp = this.selectEmployee(updateEmpId)) == null) { ;
			return false;
		}
		emp.setEmail(email);
		emp.setPhone(phone);
		emp.setDepartmentTitle(departmentTitle);
		emp.setJobName(jobName);
		emp.setSalary(salary);
		
		return true;
	}
	
	/** 사원 정보 삭제(사원번호) 서비스 메서드
	 * @param delEmpId
	 * @return 삭제성공하면 true 반환, 실패하면 false반환
	 */
	public boolean deleteEmployee(int delEmpId) {
		for(Employee e : employeeList) {
			if(e.getEmpId() == delEmpId) {
				return employeeList.remove(e);
			}
		}
		return false;
	}
	
	/** 사원 정보 조회(부서명) 서비스 메서드
	 * @param department
	 * @return 해당 부서명을 가진 Employee객체를 담은 List반환
	 */ 
	public List<Employee> getEmployeeList(String department) {
		List<Employee> empList = new ArrayList<>();
		for(Employee e : employeeList) {
			if(e.getDepartmentTitle().equals(department)) {
				empList.add(e);
			}
		}
		return empList;
	}
	
	/** 사원 정보 조회(급여) 서비스 메서드
	 * @param salary
	 * @return 입력받은 급여이상의 급여를 받는 Employee객체를 담은 List반환
	 */
	public List<Employee> getEmployeeList(int salary) {
		List<Employee> empList = new ArrayList<>();
		for(Employee e : employeeList) {
			if(e.getSalary() >= salary) {
				empList.add(e);
			}
		}
		return empList;
	}
	/** 각 부서의 급여합 반환 서비스 메서드
	 * @return <Key : 부서명, Value : 해당 부서의 급여합>인 Map반환
	 */
	public Map<String, Integer> selectDepartmentalSalary() {
		Map<String, Integer> salaryHash = new HashMap<>();
		for(Employee e : employeeList) {
			String key = e.getDepartmentTitle();
			if(salaryHash.containsKey(key)) {
				salaryHash.put(key, salaryHash.get(key) + e.getSalary());
			} else {
				salaryHash.put(key, e.getSalary());
			}
		}
		return salaryHash;
	}
}
