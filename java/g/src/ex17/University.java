package ex17;

public class University extends Student {
	private int courses;

	public University(String name, int grade, int courses, String gender, int age) {
		System.out.println("University 생성자 호출");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
		super.gender = gender;
		super.age = age;
	}

	public University(String name, int grade, int courses) {
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}

	public int getCourses() {
		return courses;
	}
}
