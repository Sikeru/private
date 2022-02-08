package sec07;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean res1, res2, res3;
		int n = 0;

		System.out.print("정수를 입력해주세요 : ");
		n = in.nextInt();
		res1 = n % 4 == 0 || n % 5 == 0;
		res2 = n % 4 == 0 && n % 5 == 0;
		res3 = res1 && !res2;

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

}
