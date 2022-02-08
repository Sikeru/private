package rent.ex3.member;

import java.io.IOException;

import rent.ex3.common.exception.RentException;

public interface Memberface {
	public void regMember(MemberVo vo) throws MemberException, RentException, IOException;

	public String viewMember(MemberVo vo) throws MemberException, IOException;

//	public void modMember(MemberVo vo) throws MemberException;
//
//	public void delMember(MemberVo vo) throws MemberException;
}
