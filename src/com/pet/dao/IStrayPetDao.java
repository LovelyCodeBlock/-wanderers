package com.pet.dao;

import java.sql.Connection;
import java.sql.ResultSet;

public interface IStrayPetDao {
	/**
	 * �������˳�����Ϣ�����
	 * @param con
	 * @param kind
	 * @return
	 * @throws Exception
	 */
	public ResultSet strayPetList(Connection con, String kind) throws Exception;
	public ResultSet strayPetList(Connection con, String kind,int pageNo) throws Exception;
}
