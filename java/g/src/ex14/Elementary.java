package ex14;

public class Elementary extends Student {

	public Elementary(String _name, int _grade) {
		System.out.println("Elementary 생성자 호출");
		name = _name;
		grade = _grade;
	}

	public Elementary(String _name, int _grade, String _gender, int _age, String gender, int age) {
		System.out.println("인자 4개인 Elemntary 생성자 호출");
		name = _name;
		grade = _grade;
		gender = _gender;
		age = _age;
	}
}
