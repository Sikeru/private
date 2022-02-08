package sec04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("문자열 입력: ");
		String str = in.nextLine();
		System.out.println(str);

		System.out.print("정수 입력: ");
		int i = in.nextInt();
		System.out.println(i);

		System.out.print("실수 입력: ");
		double j = in.nextDouble();
		System.out.println(j);

	}

}
