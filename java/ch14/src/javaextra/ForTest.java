package javaextra;

public class ForTest {

	public static void main(String[] args) {
		String[] str = { "world", "hello", "love", "victory", "truth" };
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		System.out.println("\n향상된 for문으로 출력하기");
		for (String temp : str) {
			System.out.println(temp);
		}
	}

}
