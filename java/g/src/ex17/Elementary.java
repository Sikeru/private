package ex17;

public class Elementary extends Student {

	public Elementary(String name, int grade) {
		System.out.println("Elementary 생성자 호출");
		this.name = name;
		this.grade = grade;
	}

	public Elementary(String name, int grade, String gender, int age) {
		System.out.println("인자 4개인 Elemntary 생성자 호출");
		this.name = name;
		this.grade = grade;
		super.gender = gender;
		super.age = age;
	}
}
