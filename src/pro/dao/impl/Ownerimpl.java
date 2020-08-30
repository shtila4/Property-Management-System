package pro.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pro.dao.OwnerDao;
import pro.pojo.Owner;
import pro.pojo.Yzxinxi;
import pro.utils.DButil;

public class Ownerimpl implements OwnerDao {

	
	@Override
	public Owner getoneOwner(String yid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Owner owner = null;
		String sql = "select * from owners where Yid=?";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, yid);		
			rs = pstmt.executeQuery();
			if(rs.next()) {
				owner = new Owner(rs.getString("Yid"), rs.getString("Yname"),rs.getString("Ysex"),rs.getString("Ytel"),
						rs.getString("Ytim"),rs.getString("Fid"),rs.getString("Lid"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeAll(rs, pstmt, conn);
		}
		return owner;
	}
	public List<Yzxinxi>GetALLowners(){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "CALL yzxinxi() ";
		List<Yzxinxi>owners=new ArrayList();
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
					
			rs = pstmt.executeQuery();
			while(rs.next()) {
			Yzxinxi	owner = new Yzxinxi(rs.getString("yid"), rs.getString("yname"),rs.getString("ysex"),rs.getString("ytel"),
						rs.getString("ytim"),rs.getString("lname"),rs.getString("fid"));
			owners.add(owner);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeAll(rs, pstmt, conn);
		}
		return owners;
		
	}
	 public int AddaOwner(String yid,String yname,String ysex,String ytel,String ytim,String fid,String lid) {
		 
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			
			String sql = "insert into owners values(?,?,?,?,?,?,?)";
			
			try {
				conn = DButil.getConn();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, yid);		
				pstmt.setString(2, yname);
				pstmt.setString(3, ysex);
				pstmt.setString(4, ytel);
				pstmt.setString(5, ytim);
				pstmt.setString(6, fid);
				pstmt.setString(7, lid);
				int count=pstmt.executeUpdate();
				return count;
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DButil.closeAll(null, pstmt, conn);
			}
			return 0;
		}
	 public int DeleteaOwner(String yid) {
		 
		 Connection conn = null;
			PreparedStatement pstmt = null;
			
			
			String sql = "delete from owners where Yid=?";
			
			try {
				conn = DButil.getConn();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, yid);		
				
				int count=pstmt.executeUpdate();
				return count;
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DButil.closeAll(null, pstmt, conn);
			}
			return 0;
		 
	 }
	 public int UpdateaOwner(String yid,String yname,String ysex,String ytel,String ytim,String fid,String lid,String id) {
		 
		 Connection conn = null;
			PreparedStatement pstmt = null;
			
			
			String sql = "update owners set Yid=?, Yname=?,Ysex=?, Ytel=?, Ytim=?, Fid=?,Lid=? where Yid=?";
			
			try {
				conn = DButil.getConn();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, yid);	
				pstmt.setString(2, yname);
				pstmt.setString(3, ysex);
				pstmt.setString(4, ytel);
				pstmt.setString(5, ytim);
				pstmt.setString(6, fid);
				pstmt.setString(7, lid);
				pstmt.setString(8, id);
				
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
