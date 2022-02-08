package ex04;

public class MyUtil {
	public void summarize(int num1) {
		int sum = 0;

		for (int i = 0; i <= num1; i++) {
			sum += i;
		}

		System.out.println("1에서 " + num1 + "사이에 있는 자연수 들의 합은" + sum);
	}

	public void summarize(int num1, int num2) {
		int sum = 0;

		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println(num1 + "과" + num2 + "사이에 있는 자연수 들의 합은" + sum);
	}
}
