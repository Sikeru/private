package sec03.brd08;

import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	public BoardDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List selectAllArticles(Map pagingMap) {
		List articlesList = new ArrayList();
		int section = (Integer)pagingMap.get("section");
		int pageNum=(Integer)pagingMap.get("pageNum");
		try {
			conn = dataFactory.getConnection();
			String query ="SELECT * FROM (" + "select ROWNUM as recNum,"
						  +"LVL," + "ARTICLENO,"
						  +"PARENTNO," + "TITLE,"
						  +"id," + "WRITEDATE"
						  +" from (select LEVEL as LVL, "
						  +"ARTICLENO," + "PARENTNO," + "TITLE," + "ID,"
						  +"WRITEDATE" + " from t_board"
						  +" START WITH PARENTNO=0" + " CONNECT BY PRIOR ARTICLENO = PARENTNO"
						  +" ORDER SIBLINGS BY ARTICLENO DESC)" + ")"
						  +" where recNum between(?-1)*100+(?-1)*10+1 and (?-1)*100+?*10";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, section);
			pstmt.setInt(2, pageNum);
			pstmt.setInt(3, section);
			pstmt.setInt(4, pageNum);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int level = rs.getInt("level");
				int articleNO = rs.getInt("articleNO");
				int parentNO = rs.getInt("parentNO");
				String title = rs.getNString("title");
				String content = rs.getNString("content");
				String id = rs.getNString("id");
				Date writeDate=rs.getDate("writeDate");
				
				ArticleVO article = new ArticleVO();
				article.setLevel(level);
				article.setArticleNO(articleNO);
				article.setParentNO(parentNO);
				article.setTitle(title);
				article.setContent(content);
				article.setId(id);
				article.setWriteDate(writeDate);
				articlesList.add(article);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return articlesList;
	}
	
	private int getNewArticleNO() {
		try {
			conn=dataFactory.getConnection();
			String query ="SELECT max(articleNO) from t_board";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery(query);
			if(rs.next())
				return(rs.getInt(1)+1);
			rs.close();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int insertNewArticle(ArticleVO article) {
		int articleNO = getNewArticleNO();
		try {
			conn=dataFactory.getConnection();
			int parentNO=article.getParentNO();
			String title = article.getTitle();
			String content = article.getContent();
			String id = article.getId();
			String imageFileName = article.getImageFileName();
			String query="INSERT INTO t_board (articleNO, parentNO, title, content, imageFileName, id)"
					+ " VALUES (?, ? ,?, ?, ?, ?)";
			System.out.println(query);
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, articleNO);
			pstmt.setInt(2, parentNO);
			pstmt.setString(3, title);
			pstmt.setString(4, content);
			pstmt.setString(5, imageFileName);
			pstmt.setString(6, id);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return articleNO;
	}
	
	public ArticleVO selectArticle(int articleNO){
		ArticleVO article=new ArticleVO();
		try{
		conn = dataFactory.getConnection();
	String query ="select articleNO,parentNO,title,content,  NVL(imageFileName, 'null') as imageFileName, id, writeDate"
			                     +" from t_board" 
			                     +" where articleNO=?";
		System.out.println(query);
		pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, articleNO);
		ResultSet rs =pstmt.executeQuery();
		rs.next();
		int _articleNO =rs.getInt("articleNO");
		int parentNO=rs.getInt("parentNO");
		String title = rs.getString("title");
		String content =rs.getString("content");
		String imageFileName = URLEncoder.encode(rs.getString("imageFileName"), "UTF-8"); 
                                                                                                                   //?????????? ?????????? ???? ???? ????????????.
		if(imageFileName.equals("null")) {
			imageFileName = null;
		}
		String id = rs.getString("id");
		Date writeDate = rs.getDate("writeDate");

		article.setArticleNO(_articleNO);
		article.setParentNO (parentNO);
		article.setTitle(title);
		article.setContent(content);
		article.setImageFileName(imageFileName);
		article.setId(id);
		article.setWriteDate(writeDate);
		rs.close();
		pstmt.close();
		conn.close();
		}catch(Exception e){
			e.printStackTrace();	
			}
			return article;
		}
	
	public void updateArticle(ArticleVO article) {
		int articeNO = article.getArticleNO();
		String title = article.getTitle();
		String content = article.getContent();
		String imageFileName = article.getImageFileName();
		try {
			conn=dataFactory.getConnection();
			String query = "update t_board set title=?, content=?";
			if(imageFileName != null && imageFileName.length() !=0) {
				query+=",imageFileName=?";
			}
				query+="where articleNO=?";
				
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			if(imageFileName != null && imageFileName.length() != 0){
				pstmt.setString(3, imageFileName);
				pstmt.setInt(4, articeNO);
			}else {
				pstmt.setInt(3, articeNO);
			}
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteArticle(int articleNO) {
		try {
			conn=dataFactory.getConnection();
			String query = "DELETE FROM t_board";
			query += " WHERE articleNO in (";
			query += " SELECT articleNO FROM  t_board ";
			query += " START WITH articleNO = ?";
			query += " CONNECT BY PRIOR articleNO = parentNO)";

			System.out.println(query);
			pstmt =conn.prepareStatement(query);
			pstmt.setInt(1, articleNO);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Integer> selectRemovedArticles(int articleNO){
		List<Integer> articleNOList = new ArrayList<Integer>();
		try {
			conn=dataFactory.getConnection();
			String query="SELECT articleNO FROM t_board";
			query+="START WITH articleNO=?";
			query+="CONNECT BY PRIOR articleNO = parentNO";
			System.out.println(query);
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, articleNO);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				articleNO=rs.getInt("articleNO");
				articleNOList.add(articleNO);
			}
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return articleNOList;
	}
	
	public int selectTotArticles() {
		try {
			conn=dataFactory.getConnection();
			String query = "select count(articleNO) from t_board";
			System.out.println(query);
			pstmt=conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				return(rs.getInt(1));
			rs.close();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
