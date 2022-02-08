package ex15;

public class StudentTest {

	public static void main(String[] args) {
		University u = new University("홍길동", 2, 24);
		Elementary e = new Elementary("박지성", 23);

		u.calcScore(u);
		e.calcScore(e);
	}

}
