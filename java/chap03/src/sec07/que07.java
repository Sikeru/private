package sec07;

import java.util.Scanner;

public class que07 {

	public static void main(String[] args) {
		String c = input("Ã¶¼ö");
		String y = input("¿µÈñ");
		whosWin(c, y);
	}

	public static String input(String p) {
		Scanner in = new Scanner(System.in);

		System.out.print(p + " : ");
		return in.nextLine();
	}

	public static void whosWin(String p1, String p2) {
		if (p1.equals(p2))
			System.out.println("ºñ°å½À´Ï´Ù.");
		else if (p1.equals("°¡À§")) {
			if (p2.equals("¹ÙÀ§"))
				System.out.println("¿µÈñ, ½Â!");
			else
				System.out.println("Ã¶¼ö, ½Â!");
		} else if (p1.equals("¹ÙÀ§")) {
			if (p2.equals("°¡À§"))
				System.out.println("Ã¶¼ö, ½Â!");
			else
				System.out.println("¿µÈñ, ½Â!");
		} else if (p1.equals("º¸")) {
			if (p2.equals("°¡À§"))
				System.out.println("¿µÈñ, ½Â!");
			else
				System.out.println("Ã¶¼ö, ½Â!");
		}
	}

}
