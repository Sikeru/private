//package rent.ex2.reserve;
//
//import rent.ex2.base.Base;
//import rent.ex2.common.DataUtil;
//
//public class Reserve extends Base implements Reserveface {
//	String resData;
//
//	public String reserveCar(ResVo vo) {
//		resData = "예약 차번호 : " + vo.resCarNumber + ", " + "예약 날짜 : " + vo.resDate + ", " + "이용 시작 일자" + vo.useBeginDate
//				+ ", " + "차 반납 일자 : " + vo.returnDate;
//
//		DataUtil.encodeData(resData);
//		System.out.println("렌터카 예약시간 : " + showTime());
//		System.out.println("차를 예약합니다.");
//		DataUtil.decodeData(resData);
//
//		return resData;
//	}
//
//	public String modReserveInfo(ResVo vo) {
//		resData = "예약 차번호 : " + vo.resCarNumber + ", " + "예약 날짜 : " + vo.resDate + ", " + "이용 시작 일자" + vo.useBeginDate
//				+ ", " + "차 반납 일자 : " + vo.returnDate;
//
//		DataUtil.encodeData(resData);
//		System.out.println("렌터카 예약 정보 수정 시간 : " + showTime());
//		System.out.println("차를 예약합니다.");
//		DataUtil.decodeData(resData);
//
//		return resData;
//
//	}
//
//	public String canlReserveInfo(ResVo vo) {
//		resData = "예약 차번호 : " + vo.resCarNumber + ", " + "예약 날짜 : " + vo.resDate + ", " + "이용 시작 일자" + vo.useBeginDate
//				+ ", " + "차 반납 일자 : " + vo.returnDate;
//
//		DataUtil.encodeData(resData);
//		System.out.println("렌터카 예약시간 : " + showTime());
//		System.out.println("차를 예약합니다.");
//		DataUtil.decodeData(resData);
//
//		return resData;
//	}
//}
