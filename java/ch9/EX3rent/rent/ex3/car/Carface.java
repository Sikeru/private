package rent.ex3.car;

public interface Carface {

	String checkCarInfo(CarVo vo);

	void regCarInfo(CarVo vo);

	void modCarInfo(CarVo vo);

	void delCarInfo(CarVo vo);

}