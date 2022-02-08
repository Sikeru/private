package ex05;

public class YourCarTest {

	public static void main(String[] args) {
		Car yourCar;
		yourCar = new Car("그랜저", "검은색", 2500, 60);

//		yourCar.setCarName("그랜저");
//		yourCar.setCarColor("검은색");
//		yourCar.setCarSize(2500);
//		yourCar.setVelocity(60);

		String carName = yourCar.getCarName();
		String carColor = yourCar.getCarColor();
		int carSize = yourCar.getCarSize();
		int velocity = yourCar.getVelocity();
		yourCar.speedUp();
		yourCar.speedUp();
		velocity = yourCar.getVelocity();

		System.out.println("당신 차 정보 출력 : ");
		System.out.println("차 이름 : " + carName + ", 색상 : " + carColor + ", 배기량 : " + carSize + "cc" + ", 현재속도 : "
				+ velocity + "입니다.");
	}

}
