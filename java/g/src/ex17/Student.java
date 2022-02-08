package ex17;

public class Student extends Person {
	protected String name;
	protected int grade;

	public Student() {
		System.out.println("Student 부모 생성자 호출");
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public String getStudInfo() {
		System.out.println("Student 클래스의 getStdInfo() 호출");
		return "이름: " + name + ", 학년: " + grade + ", 성별" + gender + "나이" + age;
	}
}
