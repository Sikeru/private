package product;

public class ObjectArray {
	public static void main(String args) {
		String code = null;
		String name = null;
		String color = null;
		int qty = 0;

		Object object[] = new Object[5];
		Product prod0 = new Product();
		Product prod1 = new Product();
		Product prod2 = new Product();

		object[0] = "홍길동";
		object[1] = prod0;
		object[2] = prod1;
		object[3] = prod2;
		object[4] = new Integer(123);
		System.out.println("Object 배열에 저장한 제품 정보 출력");
		System.out.println();
	}
}
