package ex07;

import ex08.Person;

public class Student extends Person {
	protected String name;
	protected int grade;
//	String name;
//	int grade;

	public Student() {
		System.out.println("student 부모 생성자 호출");
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
}
