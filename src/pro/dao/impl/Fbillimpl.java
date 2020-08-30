package pro.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import pro.dao.FbillDao;
import pro.pojo.FandOandB;
import pro.pojo.Fbill;
import pro.pojo.Yzview;
import pro.utils.DButil;

public class Fbillimpl implements FbillDao {

	
	@Override
	public List<Yzview> getoneFbill(String yid) {
		 Connection conn=null;
	     PreparedStatement pstmt=null;
	     ResultSet rs=null;
	     String sql="select * from yview where Yid=?";
	     List<Yzview>fbills=new ArrayList();
	     try {
		       conn=DButil.getConn();
		       pstmt=conn.prepareStatement(sql);
		       pstmt.setString(1, yid);
		       rs=pstmt.executeQuery();
		       while(rs.next())
		       {
		    	    Yzview fbill=new Yzview(rs.getString("Jid"),rs.getString("Yid"),rs.getString("Yname"),rs.getString("Type"),rs.getString("Date"),rs.getString("Mon"));
		         fbills.add(fbill);
		       }
	       } catch (SQLException e) {
		    e.printStackTrace();
	       }finally {
		   DButil.closeAll(rs, pstmt, conn);
	      }
	  return fbills;
    }
	public Fbill getonejiaofeijilu(String jid) {
		Connection conn=null;
	     PreparedStatement pstmt=null;
	     ResultSet rs=null;
	     String sql="select * from fbill where Jid=?";
	     Fbill f=null;
	     try {
		       conn=DButil.getConn();
		       pstmt=conn.prepareStatement(sql);
		       pstmt.setString(1, jid);
		       rs=pstmt.executeQuery();
		     if(rs.next())
		       {
		        f=new Fbill(rs.getString("Jid"),rs.getString("Yid"),rs.getString("Type"),rs.getString("Date"),rs.getString("Mon"));
		        
		       }
	       } catch (SQLException e) {
		    e.printStackTrace();
	       }finally {
		   DButil.closeAll(rs, pstmt, conn);
	      }
	  return f;
		
		
	}
	public int addFbill(String jid,String yid,String type,String date,String mon) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		String sql = "insert into fbill(Jid,Yid,Type,Date,Mon) values(?,?,?,?,?)";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, jid);		
			pstmt.setString(2, yid);
			pstmt.setString(3, type);
			pstmt.setString(4, date);
			pstmt.setString(5, mon);
			int count=pstmt.executeUpdate();
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeAll(null, pstmt, conn);
		}
		return 0;
	}
	
	public List<Yzview>GetamonFbill(String yid,String stime,String ftime){
		 Connection conn=null;
	     PreparedStatement pstmt=null;
	     ResultSet rs=null;
	     String sql="select * from yview where Yid=? and Date between ? and ?";
	     List<Yzview>fbills=new ArrayList();
	     try {
		       conn=DButil.getConn();
		       pstmt=conn.prepareStatement(sql);
		       pstmt.setString(1, yid);		
				pstmt.setString(2, stime);
				pstmt.setString(3, ftime);
		       rs=pstmt.executeQuery();
		       while(rs.next())
		       {
		    	   Yzview fbill=new Yzview(rs.getString("Jid"),rs.getString("Yid"),rs.getString("Yname"),rs.getString("Type"),rs.getString("Date"),rs.getString("Mon"));
		         fbills.add(fbill);
		       }
	       } catch (SQLException e) {
		    e.printStackTrace();
	       }finally {
		   DButil.closeAll(rs, pstmt, conn);
	      }
	  return fbills;
	}
	public List<FandOandB> GetoneFbill(String yid) {
		 Connection conn=null;
	     PreparedStatement pstmt=null;
	     ResultSet rs=null;
	     String sql="select Jid,fbill.Yid,Yname,Type,Date,Ytel,Mon,build.Lname,owners.Fid from build,owners,fbill where fbill.Yid=owners.Yid AND owners.Lid=build.Lid and owners.Yid=?";
	     List<FandOandB>fbills=new ArrayList();
	     try {
		       conn=DButil.getConn();
		       pstmt=conn.prepareStatement(sql);
		       pstmt.setString(1, yid);
		       rs=pstmt.executeQuery();
		       while(rs.next())
		       {
		    	   FandOandB fbill=new FandOandB(rs.getString("Jid"),rs.getString("Yid"),rs.getString("Yname"),rs.getString("Type"),rs.getString("Date"),rs.getString("Ytel"),rs.getString("Mon"),rs.getString("Lname"),rs.getString("Fid"));
		         fbills.add(fbill);
		       }
	       } catch (SQLException e) {
		    e.printStackTrace();
	       }finally {
		   DButil.closeAll(rs, pstmt, conn);
	      }
	  return fbills;
	}

	

}
