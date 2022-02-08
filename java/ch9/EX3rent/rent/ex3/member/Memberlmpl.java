package rent.ex3.member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import rent.ex3.base.Base;
import rent.ex3.common.DataUtil;
import rent.ex3.common.exception.RentException;

public class Memberlmpl extends Base implements Memberface {

	public void regMember(MemberVo vo) throws RentException, IOException, MemberException {
		String id = vo.id;
		File file = new File("memberData.txt");
		PrintWriter out = new PrintWriter(new FileWriter(file, true));

		if (id == null || id.equals("")) {
			throw new MemberException("아이디는 필수 입력 정보입니다.");
		} else {
			id = vo.id + ", " + vo.password + ", " + vo.name + ", " + vo.phoneNum;

			DataUtil.encodeData(id);
			System.out.println("회원 등록 시간" + showTime());

			out.print(id);
			out.close();
			System.out.println("회원 정보를 파일 저장했습니다.");
		}
	}

	public String viewMember(MemberVo vo) throws MemberException, IOException {

		File file = new File("memberData.txt");
		BufferedReader in = new BufferedReader(new FileReader(file));
		String memData = "";
		String data = in.readLine();
		while (data != null) {
			memData += data + "\n";
			data = in.readLine();
		}
		return memData;
	}

}
