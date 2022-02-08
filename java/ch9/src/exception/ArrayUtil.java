package exception;

public class ArrayUtil {
	public void call() throws Exception {
		System.out.println("call 메서드 시작");
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		System.out.println("call 메서드 종료");
	}
}
