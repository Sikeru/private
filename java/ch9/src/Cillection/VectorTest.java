package Cillection;

import java.util.Vector;

import javaextra.MyStudent;

public class VectorTest {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("È«±æµ¿");
		v.addElement("ÀÌ¼ø½Å");
		v.addElement(new Integer(123));
		v.addElement("È«±æµ¿");
		v.addElement(new Integer(123));
		v.addElement(new MyStudent());

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println(v);
	}

}
