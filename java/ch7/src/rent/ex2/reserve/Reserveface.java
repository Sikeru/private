package rent.ex2.reserve;

public interface Reserveface {

	String reserveCar(ResVo vo);

	void modReserveInfo(ResVo vo);

	void cancelReserveInfo(ResVo vo);

}