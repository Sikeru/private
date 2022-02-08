package rent.ex3.reserve;

public interface Reserveface {

	String reserveCar(ResVo vo);

	void modReserveInfo(ResVo vo);

	void cancelReserveInfo(ResVo vo);

}