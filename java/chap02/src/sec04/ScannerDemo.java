package sec04;

import java.util.Scanner;

public class ScannerDemo {

	public static void range(int[] ran) {
		int t = 0;
		int i, j;

		for (j = 0; j < 5; j++) {
			for (i = 0; i < 4; i++) {
				if (ran[i] > ran[i + 1]) {
					t = ran[i];
					ran[i] = ran[i + 1];
					ran[i + 1] = t;
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		int i;
		System.out.println("숫자 5개를 입력해주세요");
		Scanner in = new Scanner(System.in);

		for (i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
		}

		range(arr);

		for (i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	}

}
