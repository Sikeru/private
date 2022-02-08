package sec07;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int maj = 0, lib = 0, gen = 0;
		int sum = 0;
		String res;

		System.out.print("전공 이수 학점 : ");
		maj = in.nextInt();
		System.out.print("교양 이수 학점 : ");
		lib = in.nextInt();
		System.out.print("일반 이수 학점 : ");
		gen = in.nextInt();
		sum = maj + lib + gen;
		res = (sum >= 140 && maj >= 70 && lib >= 30 && gen >= 30 || lib + gen >= 80) ? "졸업 가능" : "졸업 불가";

		System.out.println(res);
	}

}
