package strem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardTest {

	public static void main(String[] args) {
		String mesg = null;

		InputStreamReader ir = new InputStreamReader(System.in);
		// System.in은 node에 해당된다.
		// InputStreamReader는 System.in을 감싸고있는 필터에 해당된다.
		BufferedReader in = new BufferedReader(ir);
		// BufferedReader는 InputStreamReader와 System.in을 감싸고있는 필터에 해당된다.
		System.out.println("exit:Ctrl+Z");

		try {
			mesg = in.readLine();
			while (mesg != null) {
				System.out.println("읽기 : " + mesg);
				mesg = in.readLine();
			}
			in.close();
			ir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
