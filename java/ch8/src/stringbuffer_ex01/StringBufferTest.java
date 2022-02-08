package stringbuffer_ex01;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer city1 = new StringBuffer("대한시");
		StringBuffer city2 = city1.append(" 민국군");
		System.out.println("city1 : " + city1);
		System.out.println("city2 : " + city2);

		city2.append(" 하나구");
		System.out.println("city1 : " + city1);
		System.out.println("city2 : " + city2);
	}

}
