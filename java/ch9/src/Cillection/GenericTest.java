package Cillection;

public class GenericTest {

	public static void main(String[] args) {
		GOrigin<String> t = new GOrigin<String>();
		String str = "æ»≥Á«œººø‰";
		t.set(str);
		t.getData();

		GOrigin<Integer> t1 = new GOrigin<Integer>();
		int num = 1;
		t1.set(num);
		t1.getData();

		GOrigin t3 = new GOrigin();

		t3.set(str);
		t3.getData();
		t3.set(num);
		t3.getData();
	}

}
