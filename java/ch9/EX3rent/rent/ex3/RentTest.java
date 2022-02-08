package rent.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import rent.ex3.common.exception.RentException;
import rent.ex3.member.MemberException;
import rent.ex3.member.MemberVo;
import rent.ex3.member.Memberface;
import rent.ex3.member.Memberlmpl;

public class RentTest {

	public static void main(String[] args) {
		String memInfo;
		String carInfo;
		String resInfo;
		int selectltem = 1;

		while (true) {
			System.out.println("기능을 선택하세요 . \n 1.회원관리, 2.렌터카 관리, 3.예약관리, 4.완료");
			Scanner scanner = new Scanner(System.in);
			selectltem = Integer.parseInt(scanner.nextLine());
			switch (selectltem) {
			case 1:
				try {
					member();
				} catch (RentException e) {
					e.getRentExceptionInfo();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.exit(1);
				break;
			}
		}

	}

	private static void member() throws IOException, RentException, MemberException {
		Memberface member = new Memberlmpl();
		MemberVo memVo = null;
		int selectltem = 1;

		System.out.println("세부 기능을 선택하세요. \n 1.회원 등록, 2.회원조회, 3.회원 수정, 4.회원 삭제, 5.되돌아가기");

		Scanner scanner = new Scanner(System.in);
		selectltem = Integer.parseInt(scanner.nextLine());
		switch (selectltem) {
		case 1:
			String data = null;
			System.out.println("회원 정보를 입력하세요.");
			memVo = new MemberVo();

			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("아이디를 입력하세요 :");
			data = in.readLine();
			memVo.setId(data);

			System.out.print("비밀번호을 입력하세요 :");
			data = in.readLine();
			memVo.setPassword(data);

			System.out.print("이름을 입력하세요 :");
			data = in.readLine();
			memVo.setName(data);

			System.out.print("주소를 입력하세요 :");
			data = in.readLine();
			memVo.setAddress(data);

			System.out.print("전화번호를 입력하세요 :");
			data = in.readLine();
			memVo.setPhoneNum(data);

			member.regMember(memVo);
			break;

		case 2:
			String memData = member.viewMember(memVo);
			System.out.println("회원정보 : ");
			System.out.println("===============");
			System.out.println(memData);
			break;

		case 5:
			break;
		}

	}

}
