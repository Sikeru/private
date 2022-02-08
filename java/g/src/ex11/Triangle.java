package ex11;

public class Triangle extends Shape {
	public Triangle() {
		System.out.println("Triangle");
	}

	public void calcArea(float width, float height) {
		super.area = width * height / 2.0f;
	}
}
