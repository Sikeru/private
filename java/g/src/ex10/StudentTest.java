package ex10;

public class StudentTest {

	public static void main(String[] args) {
		Elementary e = new Elementary("이순신", 2);
		University u = new University("홍길동", 3, 20);

		System.out.println(e.getStudInfo());
		System.out.println(u.getStudInfo());
	}

}
