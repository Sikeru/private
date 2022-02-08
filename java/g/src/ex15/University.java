package ex15;

public class University extends Student {
	private int courses;

	public University(String _name, int _grade, int _courses) {
		System.out.println("University 생성자 호출");
		name = _name;
		grade = _grade;
		courses = _courses;
	}

	public University() {
		this("이순신", 2, 20);
	}

	public int getCourses() {
		return courses;
	}

	public String getStudInfo() {
		System.out.println("UnivUersity 클래스의 getStudInfo 메서드호출");
		return "이름은>>" + name + ", 학년은>>" + grade + ", 신청학점은>>" + courses;
	}
}
