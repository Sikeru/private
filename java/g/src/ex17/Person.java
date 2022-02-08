package ex17;

public class Person {
	protected String gender;
	protected int age;

	public Person() {
		System.out.println("Person 생성자 호출");
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}
}
