//package rent.ex2.car;
//
//import rent.ex2.base.Base;
//import rent.ex2.common.DataUtil;
//
//public class Car extends Base implements Carface {
//	String carData;
//
//	
//	public String checkCarInfo(CarVo vo) {
//		carData = "차번호 : " + vo.carNumber + ", " + "차이름 : " + vo.carName + ", " + "차크기 : " + vo.carSize + ", " + "차색상"
//				+ vo.carColor + ", " + "제조사 : " + vo.carMaker;
//
//		DataUtil.decodeData(carData);
//		System.out.println("렌터카 정보 조회시간 : " + showTime());
//		System.out.println("렌터가 정보를 조회합니다.");
//
//		return carData;
//	}
//
//	
//	public void regCarInfo(CarVo vo) {
//		carData = "차번호 : " + vo.carNumber + ", " + "차이름 : " + vo.carName + ", " + "차크기 : " + vo.carSize + ", " + "차색상"
//				+ vo.carColor + ", " + "제조사 : " + vo.carMaker;
//
//		DataUtil.decodeData(carData);
//		System.out.println("렌터카 정보 등록시간 : " + showTime());
//		System.out.println("렌터가 정보를 등록합니다.");
//	}
//
//	
//	public void modCarInfo(CarVo vo) {
//		carData = "차번호 : " + vo.carNumber + ", " + "차이름 : " + vo.carName + ", " + "차크기 : " + vo.carSize + ", " + "차색상"
//				+ vo.carColor + ", " + "제조사 : " + vo.carMaker;
//
//		DataUtil.decodeData(carData);
//		System.out.println("렌터카 정보 수정시간 : " + showTime());
//		System.out.println("렌터가 정보를 수정합니다.");
//	}
//
//	
//	public void delCarInfo(CarVo vo) {
//		carData = "차번호 : " + vo.carNumber + ", " + "차이름 : " + vo.carName + ", " + "차크기 : " + vo.carSize + ", " + "차색상"
//				+ vo.carColor + ", " + "제조사 : " + vo.carMaker;
//
//		DataUtil.decodeData(carData);
//		System.out.println("렌터카 정보 삭제시간 : " + showTime());
//		System.out.println("렌터가 정보를 삭제합니다.");
//	}
//}
