package sec07;

import java.util.Scanner;

public class que01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age;

		System.out.print("나이를 입력해주세요 : ");
		age = in.nextInt();

		if (age >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");
	}

}
