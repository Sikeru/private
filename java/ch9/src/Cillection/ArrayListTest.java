package Cillection;

import java.util.ArrayList;
import java.util.List;

import javaextra.MyStudent;

public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("Hello");
		list.add(new Integer(178));
		list.add(new MyStudent());
		list.add(new Float(4.56F));
		list.add("Hello");
		list.add(new Integer(178));

		String name = (String) list.get(0);
		Integer i1 = (Integer) list.get(1);
		MyStudent s = (MyStudent) list.get(2);
		System.out.println("name=" + name);
		System.out.println("i1=" + i1);
		System.out.println(s);
		System.out.println();
		list.remove(2);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
	}

}
