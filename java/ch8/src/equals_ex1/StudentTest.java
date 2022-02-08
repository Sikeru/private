package equals_ex1;

public class StudentTest {

	public static void main(String[] args) {
		MyStudent s = new MyStudent("이순신", 2);

		System.out.println(s);
		System.out.println(s.toString());

//		MyStudent s2 = new MyStudent("이순신", 2);

//		if (s == s2) {
//			System.out.println("두 학생의 이름과 학년이 같습니다.");
//		} else {
//			System.out.println("두 학생의 이름과 학년이 다릅니다.");
//		}
//
//		if (s.equals(s2)) {
//			System.out.println("두 학생의 이름과 학년이 같습니다.");
//		} else {
//			System.out.println("두 학생의 이름과 학년이 다릅니다.");
//		}
	}

}
