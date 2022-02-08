package ex1;

public class Number {
	private int num;
	static int numCounter = 10;

	public static int getNumCounter() {
		return numCounter;
	}

	public Number() {
		num = numCounter;
	}

	public static int getNumber() {
		int num1 = 0;
		num1 = numCounter;
		return 0;
//		return num;
	}

	public void increaseNum() {
		numCounter++;
	}

}
