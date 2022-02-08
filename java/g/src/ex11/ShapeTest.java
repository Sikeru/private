package ex11;

public class ShapeTest {

	public static void main(String[] args) {
		int width = 10;
		int hight = 20;

		Rectangle rec = new Rectangle();
		rec.calcArea(width, hight);
		rec.printArea();
//		System.out.println("사각형의 넓이는 " + rec.printArea());

		Triangle tri = new Triangle();
		tri.calcArea(width, hight);
		tri.printArea();
//		System.out.println("삼각형의 넓이는 " + tri.printArea());
	}

}
