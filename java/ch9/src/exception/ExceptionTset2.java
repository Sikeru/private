package exception;

public class ExceptionTset2 {

	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			num[0] = 1;
			num[1] = 2;
			num[2] = 3;
			System.out.println("Hello");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} finally {
			System.out.println("오류 발생 유무와 무관하게 반시 수행된다.");
		}
		System.out.println("World");
	}
}
