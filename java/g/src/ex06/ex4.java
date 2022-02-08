package ex06;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();

		if (year % 4 == 0) {
			if (year % 100 != 0)
				System.out.println("¿±≥‚¿Ã æ∆¥’¥œ¥Ÿ.");
			else
				System.out.println("¿±≥‚¿Ã ¿‘¥œ¥Ÿ.");
			if (year % 400 == 0)
				System.out.println("¿±≥‚¿Ã æ∆¥’¥œ¥Ÿ.");
			else
				System.out.println("¿±≥‚¿Ã ¿‘¥œ¥Ÿ.");
		} else
			System.out.println("¿±≥‚¿Ã ¿‘¥œ¥Ÿ.");
	}

}
