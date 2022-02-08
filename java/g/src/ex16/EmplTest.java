package ex16;

public class EmplTest {

	public static void main(String[] args) {
		Employee e = new Account("홍길동", "과장");
		Employee e1 = new Research("이순신", "선임연구원");
		e.getEmpInfo(e);
		e1.getEmpInfo(e1);
	}

}
