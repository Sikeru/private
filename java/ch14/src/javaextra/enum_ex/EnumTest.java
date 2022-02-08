package javaextra.enum_ex;

public class EnumTest {

	public static void main(String[] args) {
		System.out.println(Day.SUN);
		System.out.println(Day.SUN.ordinal());
		System.out.println(Day.MON.ordinal());

		Day d = Day.SUN;
		switch (d) {
		case SUN:
			System.out.println("일요일");
			break;
		case MON:
			System.out.println("월요일");
			break;
		}
	}

}
