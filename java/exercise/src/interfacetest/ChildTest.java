package interfacetest;

public class ChildTest {

	public static void main(String[] args) {
		Child c = new Child();
		Itest1 i1 = new Child();
		i1.func1();
//		i1.func2();

		c.func1();
		c.func2();
	}
}
