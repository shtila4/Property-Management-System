package pro.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pro.dao.BaocuoDao;
import pro.pojo.Baocuo;

import pro.utils.DButil;

public class Baocuoimpl implements BaocuoDao {

	
	@Override
	public List<Baocuo> GetallBaocuos() {
		Connection conn=null;
	     PreparedStatement pstmt=null;
	     ResultSet rs=null;
	     String sql="select * from baocuo";
	     List<Baocuo>baocuos=new ArrayList();
	     try {
		       conn=DButil.getConn();
		       pstmt=conn.prepareStatement(sql);
		      
		       rs=pstmt.executeQuery();
		       while(rs.next())
		       {
		        Baocuo baocuo=new Baocuo(rs.getString("Bid"),rs.getString("Id"),rs.getString("Wz"),rs.getString("Zq"),rs.getString("Sf"));
		        baocuos.add(baocuo);
		       }
	       } catch (SQLException e) {
		    e.printStackTrace();
	       }finally {
		   DButil.closeAll(rs, pstmt, conn);
	      }
	  return baocuos;
	}

	@Override
	public Baocuo GetaBaocuo(String bid) {
		Connection conn=null;
	     PreparedStatement pstmt=null;
	     ResultSet rs=null;
	     String sql="select * from baocuo where Bid=?";
	    Baocuo b=null;
	     try {
		       conn=DButil.getConn();
		       pstmt=conn.prepareStatement(sql);
		       pstmt.setString(1, bid);
		       rs=pstmt.executeQuery();
		     if(rs.next())
		       {
		        b=new Baocuo(rs.getString("Bid"),rs.getString("Id"),rs.getString("Wz"),rs.getString("Zq"),rs.getString("Sf"));
		        
		       }
	       } catch (SQLException e) {
		    e.printStackTrace();
	       }finally {
		   DButil.closeAll(rs, pstmt, conn);
	      }
	  return b;
	}

	@Override
	public int insertaBaocuo(String bid, String id, String wz, String zq,String sf) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		String sql = "insert into baocuo values(?,?,?,?,?)";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bid);		
			pstmt.setString(2, id);
			pstmt.setString(3, wz);
			pstmt.setString(4, zq);
			pstmt.setString(5, sf);
			int count=pstmt.executeUpdate();
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeAll(null, pstmt, conn);
		}
		return 0;
	}
	 public int Deletebaocuo(String bid) {
		 
		 Connection conn = null;
			PreparedStatement pstmt = null;
			
			
			String sql = "delete from baocuo where Bid=?";
			
			try {
				conn = DButil.getConn();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, bid);		
			

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
