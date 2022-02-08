package ex03;

public class LandTest {

	public static void main(String[] args) {
		float my_total_tax = 0f;
		int my_land_type = 1;
		int my_land_size = 25000;
		int my_land_own_year = 5;
		float your_total_tax = 0f;
		int your_land_type = 2;
		int your_land_size = 15000;
		int your_land_own_year = 3;

		LandTaxUtil util = new LandTaxUtil();
		my_total_tax = util.calcLandTax(my_land_type, my_land_size, my_land_own_year);
		System.out.println("내 토지 보유세액은" + my_total_tax + "입니다");
		System.out.printf("내 토지 보유액은>>%5.1f원 입니다.\n", my_total_tax);

		your_total_tax = util.calcLandTax(your_land_type, your_land_size, your_land_own_year);
		System.out.println("내 토지 보유세액은" + your_total_tax + "입니다");
		System.out.printf("내 토지 보유액은>>%5.1f원 입니다.", your_total_tax);
	}

}
