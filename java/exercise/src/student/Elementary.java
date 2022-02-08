package student;

public class Elementary extends Student {

	public static void main(String[] args) {
		System.out.println("Elementary 생성자 호출");
//		super.name = name;
//		super.grade = grade;
//		super.teacher = teacher;
	}

	public String getTeacher() {
		return "담임선생님 : " + super.teacher;
	}
}
