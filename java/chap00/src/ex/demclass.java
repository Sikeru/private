package ex;

public class demclass {
	int a;
	int b;
	int c;

	demclass() {
		this(5, 10, 15);
	}

	demclass(int a) {
		this(a, 10, 15);
	}

	demclass(int a, int b) {
		this(a, b, 15);
	}

	public demclass(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

}
