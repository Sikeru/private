package ex6.member;

public class Member {
	String id;
	String password;
	String name;
	String phoneNum;

	public static void regMember() {
		System.out.println("회원 가입합니다.");
	}

	public static String viewMember() {
		System.out.println("회원정보를 조회합니다.");
		return null;
	}

	public static void modMember() {
		System.out.println("회원정보를 수정합니다.");
	}

	public static void delMember() {
		System.out.println("회원정보를 삭제합니다.");
	}

}
