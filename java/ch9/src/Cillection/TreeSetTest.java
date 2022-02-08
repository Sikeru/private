package Cillection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("홍길동");
		ts.add("차범근");
		ts.add("유재석");
		ts.add("유재석");
		ts.add("박명수");
		ts.add("김유신");
		ts.add("홍길동");

		Iterator ite = ts.iterator();
		System.out.println("오름차순으로 출력하기");
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		System.out.println("\n내림차순으로 출력하기");
		Iterator ite2 = ts.descendingIterator();
		while (ite2.hasNext()) {
			System.out.println(ite2.next());
		}
		System.out.println(ts);
	}

}
