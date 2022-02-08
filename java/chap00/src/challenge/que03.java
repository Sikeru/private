package challenge;

public class que03 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}

	public static int factorial(int x) {
		int r = 1;

		while (x > 0) {
			r *= x;
			x--;
		}
		return r;
	}

	public static int factorial(int x, int y) {
		int r = 1;

		while (y >= x) {
			r *= y;
			y--;
		}
		return r;
	}
}
