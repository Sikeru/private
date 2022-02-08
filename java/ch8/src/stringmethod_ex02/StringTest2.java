package stringmethod_ex02;

public class StringTest2 {

	public static void main(String[] args) {
		String fruitData = "사과 바나나 귤 수박";
		String deptData = "인사부, 회계부, 개발부, 관리부";
		String prodData = "스마트TV-스마트폰-노트북-태블릿";
		String[] data = null;

		data = fruitData.split(" ");

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

		data = deptData.split(",");

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

		data = prodData.split("-");

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
