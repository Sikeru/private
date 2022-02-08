package ex09;

public class Rectangle extends Shape {
//	private float area;

//	public void printArea() {
//		System.out.println("사각형의 넓이는 " + this.area + "입니다.");
//	}

	public void calcRectangle(float width, float height) {
		this.area = width * height;
	}

}
