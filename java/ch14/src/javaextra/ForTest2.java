package javaextra;

import java.util.ArrayList;
import java.util.List;

public class ForTest2 {

	public static void main(String[] args) {
		List<MyStudent> list = new ArrayList<MyStudent>();
		list.add(new MyStudent());
		list.add(new MyStudent("홍길동", 2));
		list.add(new MyStudent("임꺽정", 2));
		list.add(new MyStudent("차범근", 2));
		list.add(new MyStudent("차두리", 2));

		for (MyStudent st : list) {
			System.out.println(st);
		}
	}
}
