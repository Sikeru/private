package Cillection;

import java.util.HashMap;
import java.util.Map;

import javaextra.MyStudent;

public class HashMapTest1 {

	public static void main(String[] args) {
		Map<String, MyStudent> map = new HashMap<String, MyStudent>();

		map.put("third", new MyStudent("ÀÌ¼ø½Å"));
		MyStudent st = map.get("third");
		System.out.println(st);
		System.out.println(map.get("third"));
	}

}
