package ex06;

public class ex1 {

	public static void main(String[] args) {
		int[] num;
		char[] ch;
		num = new int[5];
		ch = new char[5];
		int i, j;

		for (i = 0; i < num.length; i++) {
			num[i] = i;
		}

		for (i = 0; i < ch.length; i++) {
			ch[i] = (char) (97 + i);
		}

		for (i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "]=" + num[i]);
		}
		for (i = 0; i < ch.length; i++) {
			System.out.println("ch[" + i + "]=" + ch[i]);
		}
	}

}
