package sec02;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("점수를 입력하세요 ");
		int s = in.nextInt();

		if (s >= 90)
			System.out.println("당신의 학점은 A");
		else {
			if (s >= 80)
				System.out.println("당신의 학점은 B");
			else {
				if (s >= 70)
					System.out.println("당신의 학점은 C");
				else {
					if (s >= 60)
						System.out.println("당신의 학점은 D");
					else
						System.out.println("당신의 학점은 F");
				}
			}
		}
	}

}
