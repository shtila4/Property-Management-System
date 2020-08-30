package pro.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pro.dao.DepartmentDao;
import pro.pojo.Department;

import pro.utils.DButil;

public class Departmentimpl implements DepartmentDao {

	
	@Override
	public Department GetaDepartment(String dno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Department de = null;
		String sql = "select * from department where Dno=?";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dno);		
			rs = pstmt.executeQuery();
			if(rs.next()) {
				 de=new Department(rs.getString("Dno"),rs.getString("Dname"),
						rs.getString("Dman"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeAll(rs, pstmt, conn);
		}
		return de;
	}

}
