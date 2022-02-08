package ex07;

public class StudentTest {

	public static void main(String[] args) {
		String sinsang = null;
		String gender = null;
		int age = 0;
		Elementary e = new Elementary("이순신", 2, "남", 15);
//		University u = new University("홍길동", 3, 20);

		sinsang = e.getStudInfo();
		System.out.println("학생 정보: " + sinsang);
//		sinsang = u.getStudInfo();
		gender = e.getGender();
		age = e.getAge();
		System.out.println("학생의 성별 : " + gender + ", 학생의 나이 : " + age);
	}

}
