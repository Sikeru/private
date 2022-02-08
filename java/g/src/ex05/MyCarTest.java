package ex05;

public class MyCarTest {

	public static void main(String[] args) {
		Car myCar;
		myCar = new Car();
		myCar.setCarName("소나타");
		myCar.setCarColor("은색");
		myCar.setCarSize(2000);
		myCar.setVelocity(60);

		String carName = myCar.getCarName();
		String carColor = myCar.getCarColor();
		int carSize = myCar.getCarSize();
		int velocity = myCar.getVelocity();
		myCar.speedUp();
		myCar.speedUp();
		velocity = myCar.getVelocity();

		System.out.println("내 차 정보 출력 : ");
		System.out.println("차 이름 : " + carName + ", 색상 : " + carColor + ", 배기량 : " + carSize + "cc" + ", 현재속도 : "
				+ velocity + "입니다.");
	}

}
