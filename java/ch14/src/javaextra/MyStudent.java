package javaextra;

public class MyStudent {
	private String name;
	private int grade;

	public MyStudent() {
		this("이순신", 2);
	}

	public MyStudent(String name) {
		super();
		this.name = name;
	}

	public MyStudent(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public String toSting() {
		return "학생 이름은" + name + ", 학년은" + grade + "학년입니다.";
	}
}
