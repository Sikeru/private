package ex09;

public class Triangle extends Shape {
//	private float area;
//
//	public void printArea() {
//		System.out.println("삼각형의 넓이는 " + this.area + "입니다.");
//	}

	public void calcTriangle(float width, float height) {
		this.area = width * height / 2.0f;
	}

}
