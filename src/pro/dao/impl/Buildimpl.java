package pro.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pro.dao.BuildDao;
import pro.pojo.Build;

import pro.utils.DButil;

public class Buildimpl implements BuildDao {


	@Override
	public List<Build> GetallBuilds() {
		Connection conn=null;
	     PreparedStatement pstmt=null;
	     ResultSet rs=null;
	     String sql="select * from build";
	     List<Build>builds=new ArrayList();
	     try {
		       conn=DButil.getConn();
		       pstmt=conn.prepareStatement(sql);
		
		       rs=pstmt.executeQuery();
		       while(rs.next())
		       {
		         Build build=new Build(rs.getString("Lid"),rs.getString("Lname"),rs.getString("Lnum"),rs.getString("Ldata"));
		         builds.add(build);
		       }
	       } catch (SQLException e) {
		    e.printStackTrace();
	       }finally {
		   DButil.closeAll(rs, pstmt, conn);
	      }
	  return builds;
	}
	public Build GetaABuilds(String lid){
		Connection conn=null;
	     PreparedStatement pstmt=null;
	     ResultSet rs=null;
	     String sql="select * from build where Lid=?";
	    Build builds=null;
	     try {
		       conn=DButil.getConn();
		       pstmt=conn.prepareStatement(sql);
		       pstmt.setString(1, lid);
		       rs=pstmt.executeQuery();
		       if(rs.next())
		       {
		        builds=new Build(rs.getString("Lid"),rs.getString("Lname"),rs.getString("Lnum"),rs.getString("Ldata"));
		      
		       }
	       } catch (SQLException e) {
		    e.printStackTrace();
	       }finally {
		   DButil.closeAll(rs, pstmt, conn);
	      }
	  return builds;
	}
	public int XiugaiABuild(String lid,String lname,String lnum,String ldata,String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		String sql = "update build set Lid=?, Lname=?, Lnum=?, Ldata=? where Lid=?";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, lid);	
			pstmt.setString(2, lname);
			pstmt.setString(3, lnum);
			pstmt.setString(4, ldata);
			pstmt.setString(5, id);
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
