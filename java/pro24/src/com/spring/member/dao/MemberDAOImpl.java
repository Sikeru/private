package com.spring.member.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;
import com.spring.member.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List selectAllMemberList() throws DataAccessException {
		List<MemberVO> membersList = null;
		membersList = sqlSession.selectList("mapper.member.selectAllMemberList");
		return membersList;
	}

	@Override
	public int insertMember(MemberVO memberVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.member.insertMember", memberVO);
		return result;
	}

	@Override
	public int deleteMember(String id) throws DataAccessException {
		int result =  sqlSession.delete("mapper.member.deleteMember", id);
		return result;
	}
	
	@Override	
	public MemberVO selectMemberById(String id) throws DataAccessException {
		MemberVO memberVO = (MemberVO) sqlSession.selectOne("mapper.member.selectMemberById", id);
		return memberVO;
		}

	@Override
	public int updateMember(MemberVO memberVO) throws DataAccessException {
		int result = sqlSession.update("mapper.member.updateMember", memberVO);
		return result;
		}

}
