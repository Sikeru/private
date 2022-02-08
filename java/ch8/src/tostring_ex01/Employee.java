package tostring_ex01;

public class Employee {
	String name;
	String dept;
	String job;
	int salary;

	public Employee(String name, String dept, String job, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.salary = salary;
	}

	public String toString() {
		String data = "사원의 이름 : " + name + ", " + "사원의 부서 : " + dept + ", " + "사원의 직급 : " + job + ", " + "급여 : "
				+ salary + "원";
		return data;
	}
}
