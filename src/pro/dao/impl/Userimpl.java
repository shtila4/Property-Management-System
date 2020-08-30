package pro.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pro.utils.DButil;
import pro.dao.UserDao;
import pro.pojo.User;


public class Userimpl implements UserDao {

	
	@Override
	public User getUser(String account,String password,String identity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		String sql = "select account,pasword,identity from users where account=? and pasword=? and identity=?";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account);
			pstmt.setString(2, password);
			pstmt.setString(3, identity);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new User(rs.getString("account"), rs.getString("pasword"),rs.getString("identity"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeAll(rs, pstmt, conn);
		}
		return user;
	}
	@Override
	public User getcUser(String account) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		String sql = "select account,pasword,identity from users where account=? ";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account);		
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new User(rs.getString("account"), rs.getString("pasword"),rs.getString("identity"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeAll(rs, pstmt, conn);
		}
		return user;
	}
	public int addUser(String account,String password,String identity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		String sql = "insert into users(account,pasword,identity) values(?,?,?)";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account);		
			pstmt.setString(2, password);
			pstmt.setString(3, identity);
			int count=pstmt.executeUpdate();
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeAll(null, pstmt, conn);
		}
		return 0;
	}

}
