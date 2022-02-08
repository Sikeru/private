package interfaceex;

public class MyCarTest {

	public static void main(String[] args) {
		MyCar c = new MySportsCar();
		MySportsCar s = new MySportsCar();
		MyTruck t = new MyTruck();
		System.out.println("Car.SAFE_SPEED=" + MyCar.SAFE_SPEED);

		c.speedUp();
		c.speedDown();
		c.stop();

		System.out.println();
		s.speedUp();
		s.speedDown();
		s.turbo();
		s.stop();
	}

}
