package sec07;

import java.util.Scanner;

public class que06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String p1 = null, p2 = null;

		System.out.print("Ã¶¼ö : ");
		p1 = in.nextLine();
		System.out.print("¿µÈñ : ");
		p2 = in.nextLine();

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
