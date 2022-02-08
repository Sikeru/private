package strem;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class UnSerTest {

	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("serial.ser")));
			ArrayList list = (ArrayList) ois.readObject();

			Iterator ite = list.iterator();
			System.out.println("사원 정보 출력\n");
			while (ite.hasNext()) {
				Employee p = (Employee) ite.next();
				System.out.println("이름" + p.getName());
				System.out.println("주민번호" + p.getJumin());
				System.out.println("주소" + p.getAddr());
				System.out.println("전화번호" + p.getPhone());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
