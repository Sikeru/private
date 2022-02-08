package ex01;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("홍길동");
		Student s2 = new Student("이순신", 3);
		Student s3 = new Student("아무개", 5, "라라ㅏㄹ라라ㅏ");

		String name = s.getName();
		int grade = s.getGrade();

//		s.setName("이순신");
		System.out.println("학생의 이름은 " + name + " 학년은" + grade);

		name = s2.getName();
		grade = s2.getGrade();
		System.out.println("학생의 이름은 " + name + " 학년은" + grade);

		name = s3.getName();
		grade = s3.getGrade();
		String address = s3.getAddress();
		System.out.println("학생의 이름은 " + name + " 학년은" + grade + " 주소는 " + address);
	}

}
