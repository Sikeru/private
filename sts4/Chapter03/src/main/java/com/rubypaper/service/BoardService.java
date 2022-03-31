package com.rubypaper.service;

import java.util.List;

import com.rubypaper.domain.BoardVO;

public interface BoardService {

	String hello(String name);

	BoardVO getBoard();

	List<BoardVO> getBoardList();

}
