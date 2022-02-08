package sec07;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0;

		System.out.print("정수를 입력하세요 : ");
		n = in.nextInt();

		System.out.println(n + "의 제곱은 " + n * n);

	}

}
