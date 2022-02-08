package Cillection;

import java.util.Stack;

import javaextra.MyStudent;

public class StackTest {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("홍길동");
		s.push("이순신");
		s.push(new Integer(111));
		s.push(new MyStudent());

		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
