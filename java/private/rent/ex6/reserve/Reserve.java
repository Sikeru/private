package ex6.reserve;

public class Reserve {
	String resCarNumber;
	String resDate;
	String useBeginDate;
	String returnDate;

	public void reserveCar() {
		System.out.println("차를 예약합니다.");
	}

	public void modReserveInfo() {
		System.out.println("예약정보를 수정합니다.");
	}

	public void canlReserveInfo() {
		System.out.println("예약을 취소합니다.");
	}
}
