package com.myspring.pro30.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.pro30.board.dao.BoardDAO;
import com.myspring.pro30.board.vo.ArticleVO;
import com.myspring.pro30.board.vo.ImageVO;

@Service("boardService")
@Transactional(propagation = Propagation.REQUIRED)
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
//	public List<ArticleVO> listArticles() throws Exception{
//		List<ArticleVO> artclesList = boardDAO.selectAllArticlesList();
//		return artclesList;
//	}
	
	//이미지가 하나일때 추가
	@Override
	public int addNewArticle(Map articleMap){
		return boardDAO.insertNewArticle(articleMap);
	}
	
	@Override
	public ArticleVO viewArticle(int articleNO) throws Exception {
		ArticleVO articleVO = boardDAO.selectArticle(articleNO);
		return articleVO;
	}

	public Map listArticles(Map  pagingMap) throws Exception{
		Map articlesMap = new HashMap();
		List<ArticleVO> articlesList = boardDAO.selectAllArticlesList(pagingMap);
		int totArticles = boardDAO.selectTotArticles();
		articlesMap.put("articlesList", articlesList);
		articlesMap.put("totArticles", totArticles);
		//articlesMap.put("totArticles", 170);
        return articlesMap;
	}

}
