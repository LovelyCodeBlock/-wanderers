package com.pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * �����ݿ⽻������ѯ��������
 * @author Cedo
 *
 */
public class ArticleContentDao implements IArticleContentDao {

	/**
	 * ���ز������ӵ���������Ϣ
	 */
	@Override
	public ResultSet getArticleContent(Connection con, String questionId) throws Exception {
		StringBuffer sql = new StringBuffer("select * from t_exchangedetails");
		sql.append(" and exchangeId="+questionId);
		PreparedStatement pstmt = con.prepareStatement(sql.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}

}
