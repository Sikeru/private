package sec07;

public class que08 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	static int factorial(int n) {
		int fac = 1;
//		int a = 1;

		switch (n) {
		case 10:
			fac *= n;
			n = n - 1;
		case 9:
			fac *= n;
			n = n - 1;
		case 8:
			fac *= n;
			n = n - 1;
		case 7:
			fac *= n;
			n = n - 1;
		case 6:
			fac *= n;
			n = n - 1;
		case 5:
			fac *= n;
			n = n - 1;
		case 4:
			fac *= n;
			n = n - 1;
		case 3:
			fac *= n;
			n = n - 1;
		case 2:
			fac *= n;
			n = n - 1;
		case 1:
			fac *= n;
			n = n - 1;
		}
		return fac;
	}

}
