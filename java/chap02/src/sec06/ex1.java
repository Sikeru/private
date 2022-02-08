package sec06;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int[][] arr = new int[5][5];
		int i = 0, j = 0, k = 0;
		int a = 1;
		int m = 0;

		System.out.println("숫자를 입력해주세요");
		int n = in.nextInt();

		for (k = 0; k < 2; k++) {
			for (i = 0 + m; i < n - m; i++) {
				arr[i][j] = a;
				a++;
			}
			i = i - 1;

			for (j = 1 + m; j < n - m - 1; j++) {
				arr[i][j] = a;
				a++;
			}

			for (i = n - 1 - m; i >= 0 + m; i--) {
				arr[i][j] = a;
				a++;
			}

			i = i + 1;

			for (j = n - 2 - m; j >= 1 + m; j--) {
				arr[i][j] = a;
				a++;
			}
			j = j + 1;
			m++;
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}

	}
}
