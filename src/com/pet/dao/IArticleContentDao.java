package com.pet.dao;

import java.sql.Connection;
import java.sql.ResultSet;


/**
 * ĳ�����ӵ�������Ϣ�ӿ�
 * @author Cedo
 *
 */
public interface IArticleContentDao {

	public ResultSet getArticleContent(Connection con, String questionId) throws Exception;
}
