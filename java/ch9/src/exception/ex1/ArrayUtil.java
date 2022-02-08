package exception.ex1;

import java.io.IOException;

public class ArrayUtil {
	public void call() throws IOException {
		System.out.println("call 메서드 시작");
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;

		if (num.length == 2)
			throw new IOException("배열크기가 2");

		System.out.println("call 메서드 종료");
	}
}
