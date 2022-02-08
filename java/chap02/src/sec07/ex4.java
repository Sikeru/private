package sec07;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = 0, m = 0, s = 0;

		System.out.print("초 단위 정수를 입력하세요 : ");
		s = in.nextInt();
		h = s / 3600;
		s = s - h * 3600;
		m = s / 60;
		s = s - m * 60;

		System.out.println(h + "시간" + m + "분" + s + "초");
	}

}
