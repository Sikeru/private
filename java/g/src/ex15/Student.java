package ex15;

public class Student {

	String name;
	int grade;

	public Student() {
		System.out.println("student 생성자 호출");
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudInfo() 호출");
		return "이름: " + name + "학년: " + grade;
	}

	public void calcScore(Student s) {
		if (s instanceof University) {
			System.out.println("University 시험 점수 구하기");
		} else if (s instanceof Elementary) {
			System.out.println("Elementary 시험 점수 구하기");
		}
	}
}
