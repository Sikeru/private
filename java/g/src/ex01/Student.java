package ex01;

public class Student {
	private String name;
	private int grade;
	private String address;

	public Student(String _name, int _grade, String _address) {
		System.out.println("인자가 3개인 생성자 호출");
		name = _name;
		grade = _grade;
		address = _address;
	}

	public Student(String _name, int _grade) {
		System.out.println("인자가 2개인 생성자 호출");
		name = _name;
		grade = _grade;
	}

	public Student(String _name) {
		System.out.println("인자가 1개인 생성자 호출");
		name = _name;
	}

	public Student() {
		System.out.println("디폴트 생성자 호출");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
