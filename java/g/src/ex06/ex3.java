package ex06;

public class ex3 {

	public static void main(String[] args) {
		int[] num = { 34, 56, 78, 99, 23, 46, 21, 46, 76, 55 };
		int temp = 0;
		int i, j;
		System.out.println("정렬 전 배열값");
		for (i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}

		for (i = 0; i < num.length; i++) {
			for (j = i; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("\n정렬 후 배열값");
		for (i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}

}
