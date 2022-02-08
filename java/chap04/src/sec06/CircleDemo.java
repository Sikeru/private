package sec06;

class Circle {
	double radius;
	String color;

	public Circle(double r, String c) {
		radius = r;
		color = c;
	}

	public Circle(double r) {
		radius = r;
		color = "ÆÄ¶û";
	}

	public Circle(String c) {
		radius = 10.0;
		color = c;
	}

	public Circle() {
		radius = 10.0;
		color = "»¡°­";
	}
}

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0, "»¡°­");
		Circle c2 = new Circle(5.0);
		Circle c3 = new Circle("³ë¶û");
		Circle c4 = new Circle();

	}

}
