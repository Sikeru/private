package stringmethod_ex01;

public class StringMethodTest {

	public static void main(String[] args) {
		String s = "Hello World";

		System.out.println(s.concat(" and Java!!"));
		System.out.println(s.replace('o', 'c'));
		System.out.println(s.substring(2, 4));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println("Hello World".toUpperCase());
		System.out.println(s.endsWith("world"));
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		System.out.println("hello world".length());
		System.out.println(s);
		System.out.println(s.indexOf("o"));
		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("o"));

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			System.out.println(ch);
		}
	}

}
