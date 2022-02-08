package sec07;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		final double PI = 3.14159;
		double r = 0.0, h = 0.0, v = 0.0;
		Scanner in = new Scanner(System.in);

		System.out.print("원기둥의 밑면의 반지름은? ");
		r = in.nextDouble();
		System.out.print("원기둥의 밑면의 높이는? ");
		h = in.nextDouble();
		v = PI * r * r * h;

		System.out.print("원기둥의 밑면의 부피는? " + v);

	}

}
