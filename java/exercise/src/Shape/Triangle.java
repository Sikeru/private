package Shape;

public class Triangle implements Shape {
	public float calcArea(float width, float height) {
		float area = width * height / 2.0f;
		return area;
	}
}
