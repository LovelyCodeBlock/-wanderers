package com.pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StrayPetDao implements IStrayPetDao {
	/**
	 * �������˳�����Ϣ�����
	 */
	@Override
	public ResultSet strayPetList(Connection con, String kind) throws Exception {
		StringBuffer sql = new StringBuffer("select * from");
		if("dog".equals(kind)) {
			sql.append(" t_straydogs");
		}else if("cat".equals(kind)) {
			sql.append(" t_straycats");
		}
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		return pstmt.executeQuery();
	}

}
