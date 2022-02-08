package ex6;

import ex6.car.Car;
import ex6.member.Member;
import ex6.reserve.Reserve;

public class test {

	public static void main(String[] args) {
		Member member = new Member();
		member.regMember();

		Car car = new Car();
		car.checkCarInfo();

		Reserve reserve = new Reserve();
		reserve.reserveCar();
	}

}
