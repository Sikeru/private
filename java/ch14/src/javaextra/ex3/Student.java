package javaextra.ex3;

import java.io.Serializable;

public class Student implements Serializable {
	String name;
	int grade;
	String subject;
	int point;

	public Student(String name, int grade, String subject, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.subject = subject;
		this.point = point;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}
