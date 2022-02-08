package strem;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerTest {

	public static void main(String[] args) {
		Employee p = new Employee("박지성", "대전", "1111-222222", "123-1234");
		Employee p2 = new Employee("차범근", "서울", "33333-4444444", "987-6543");

		ArrayList list = new ArrayList();
		list.add(p);
		list.add(p2);

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("serial.ser")));
			oos.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
