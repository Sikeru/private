package exception.ex1;

import java.io.IOException;

public class ThrowTest {

	public static void main(String[] args) {
		ArrayUtil t = new ArrayUtil();
		try {
			t.call();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("마지막 부분");
	}

}
