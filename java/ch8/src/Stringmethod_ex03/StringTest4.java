package Stringmethod_ex03;

public class StringTest4 {

	public static void main(String[] args) {
//		String[] str = { "hello", "world", "love", "victory", "truth" };
		String[] str = { "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l",
				"z", "x", "c", "v", "b", "n", "m" };
		String temp = null;

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
