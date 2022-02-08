package sec06;

public class IncrementDemo {

	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment() 메서드를 호출하기 전의 x는" + x);
		x = increment(x);
		System.out.println("increment() 메서드를 호출하기 후의 x는" + x);
	}

	public static int increment(int n) {
		System.out.println("increment() 메서드를 호출하기 전의 n는" + n);
		n++;
		System.out.println("increment() 메서드를 호출하기 후의 n는" + n);
		return n;
	}
}
