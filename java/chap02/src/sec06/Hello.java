package sec06;

public class Hello {

	public static void main(String[] args) {
		char ga = '°¡';
		int i = 1;
		float a = 1.0f;

		do {
			a += 1.0;
			i++;
		} while (i < 1000);

		System.out.printf("%f", a);
	}
}