package tax;

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
		Land my_land = new Land(my_land_type, my_land_size, my_land_own_year);
		my_total_tax = util.calcLandTax(my_land);
		System.out.printf("내 토지 보유 세금액은>>%5.1f원 입니다.\n", my_total_tax);

		Land your_land = new Land(your_land_type, your_land_size, your_land_own_year);
		your_total_tax = util.calcLandTax(your_land);
		System.out.printf("내 토지 보유 세금액은>>%5.1f원 입니다.", your_total_tax);
	}

}
