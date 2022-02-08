package ex04;

public class MyTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 100;

		MyUtil my = new MyUtil();
		my.summarize(num1);
		my.summarize(num1, num2);
	}

}
