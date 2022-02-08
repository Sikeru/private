package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			num[0] = 1;
			num[1] = 2;
			num[2] = 3;
			System.out.println("1 2 3 입력");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 처리");
		}
		System.out.println("마지막 구문");
	}

}
