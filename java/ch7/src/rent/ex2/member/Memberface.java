package rent.ex2.member;

public interface Memberface {
	public void regMember(MemberVo vo);

	public String viewMember(MemberVo vo);

	public void modMember(MemberVo vo);

	public void delMember(MemberVo vo);
}
