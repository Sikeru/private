package student;

public abstract class Student {
	String name;
	int grade;
	String teacher;

	public Student() {
		System.out.println("Student 생성자 호출");
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public String getStudlnfo() {
		System.out.println("Student 클래스의 getStudInfo() 메서드 호출");
		return "이름은 : " + name + ", 학년은" + grade;
	}

	public abstract String getTeacher();
}
