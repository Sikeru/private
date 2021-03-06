package com.spring.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.spring.member.vo.MemberVO;
import com.sun.java.browser.dom.DOMAccessException;

public interface MemberService {
	 public List listMembers() throws DOMAccessException;
	 public int addMember(MemberVO membeVO) throws DataAccessException;
	 public int removeMember(String id) throws DataAccessException;
	public int updateMember(MemberVO memberVO);
	MemberVO selectMemberById(String id) throws DataAccessException;

}
