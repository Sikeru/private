package Shape;

public class ShapeTest {

	public static void main(String[] args) {
		float area = 0.0f;
		int width = 20;
		int height = 30;

		Shape s = new Rectangle();
		area = s.calcArea(width, height);
		System.out.println("사각형의 넓이는" + area);

		s = new Triangle();
		area=s.calcArea(width, height);
		System.out.println("삼각형의 넓이는"+area);
	}

}
