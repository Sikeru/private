package rent.ex3.member;
//package rent.ex2.member;
//
//import rent.ex2.base.Base;
//import rent.ex2.common.DataUtil;
//
//public class Member extends Base {
//	String memData;
//
//	public void regMember(MemberVo vo) {
//		memData = "회원 아이디 : " + vo.id + "'  " + "회원 비번 : " + vo.password + "'  " + "회원 이름 : " + vo.name + "'  "
//				+ "회원 전화번호 : " + vo.phoneNum;
//		DataUtil.encodeData(memData);
//		System.out.println("회원 등록시간 : ");
//		System.out.println("회원 가입합니다.");
//	}
//
//	public String viewMember(MemberVo vo) {
//		memData = vo.id + "' " + vo.name + "' " + vo.password + "' " + vo.phoneNum;
//		DataUtil.decodeData(memData);
//		System.out.println("회원 조회시간 : " + showTime());
//		return memData;
//	}
//
//	public void modMember(MemberVo vo) {
//		memData = vo.id + "' " + vo.name + "' " + vo.password + "' " + vo.phoneNum;
//
//		DataUtil.encodeData(memData);
//		System.out.println("회원 수정시간 : " + showTime());
//		System.out.println("회원 정보를 수정합니다.");
//	}
//
//	public void delMember(MemberVo vo) {
//		memData = vo.id + "' " + vo.name + "' " + vo.password + "' " + vo.phoneNum;
//		DataUtil.decodeData(memData);
//
//		System.out.println("회원 삭제시간 : " + showTime());
//		System.out.println("회원 정보를 삭제합니다.");
//	}
//}
