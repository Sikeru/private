package com.myspring.pro30.board.service;

import java.util.List;
import java.util.Map;

import com.myspring.pro30.board.vo.ArticleVO;

public interface BoardService {
	public int addNewArticle(Map articleMap);
	public ArticleVO viewArticle(int articleNO) throws Exception;
	public Map listArticles(Map pagingMap) throws Exception;
}
