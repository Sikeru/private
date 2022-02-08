package sec07;

import java.util.Scanner;

public class que02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rank = 0;

		System.out.print("등수를 입력해주세요 ");
		rank = in.nextInt();

		switch (rank) {
		case 1 -> System.out.println("아주잘했습니다.");
		case 2, 3 -> System.out.println("잘했습니다.");
		case 4, 5, 6 -> System.out.println("보통입니다.");
		default -> System.out.println("노력이 필요합니다.");
		}

	}

}
