package interfacetest;

class Child implements Itest1, Itest2 {

	public void func1() {
		System.out.println("func1 메서드 호출");
	}

	public void func2() {
		System.out.println("func2 메서드 호출");
	}
}
