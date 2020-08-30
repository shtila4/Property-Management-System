package pro.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pro.dao.RoomDao;

import pro.pojo.Room;
import pro.utils.DButil;

public class Roomimpl implements RoomDao {

	

	@Override
	public List<Room> GetallRooms() {
		Connection conn=null;
	     PreparedStatement pstmt=null;
	     ResultSet rs=null;
	     String sql="select * from room";
	     List<Room>rooms=new ArrayList();
	     try {
		       conn=DButil.getConn();
		       pstmt=conn.prepareStatement(sql);
		
		       rs=pstmt.executeQuery();
		       while(rs.next())
		       {
		         Room room=new Room(rs.getString("Lid"),rs.getString("Fid"),rs.getString("Yn"),rs.getString("Yare"),rs.getString("Yid"));
		         rooms.add(room);
		       }
	       } catch (SQLException e) {
		    e.printStackTrace();
	       }finally {
		   DButil.closeAll(rs, pstmt, conn);
	      }
	  return rooms;
	}

	@Override
	public Room GetaARoom(String lid, String fid) {
		Connection conn=null;
	     PreparedStatement pstmt=null;
	     ResultSet rs=null;
	     String sql="select * from room where Lid=? and Fid=?";
	    Room room=null;
	     try {
		       conn=DButil.getConn();
		       pstmt=conn.prepareStatement(sql);
		       pstmt.setString(1, lid);
		       pstmt.setString(2, fid);
		       rs=pstmt.executeQuery();
		       if(rs.next())
		       {
		        room=new Room(rs.getString("Lid"),rs.getString("Fid"),rs.getString("Yn"),rs.getString("Yare"),rs.getString("Yid"));
		      
		       }
	       } catch (SQLException e) {
		    e.printStackTrace();
	       }finally {
		   DButil.closeAll(rs, pstmt, conn);
	      }
	  return room;
	}

	@Override
	public int XiugaiARoom(String lid, String fid, String yn, String yare,String yid,String a,String b) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		String sql = "update room set Lid=?,Fid=?, Yn=?, Yare=?,Yid=? where Lid=? and Fid=?";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, lid);
			pstmt.setString(2, fid);
			pstmt.setString(3, yn);
			pstmt.setString(4, yare);
			pstmt.setString(5, yid);
			pstmt.setString(6, b);
			pstmt.setString(7, a);
			
			
			int count=pstmt.executeUpdate();
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeAll(null, pstmt, conn);
		}
		return 0;
	}
	public int GetRoomSum() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		 ResultSet rs=null;
		
		String sql = "CALL p()";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
	
		    rs=pstmt.executeQuery();
			  if(rs.next()) {
				  
				 int  count =rs.getInt("count(Yn)");
				 return count;
			  }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeAll(null, pstmt, conn);
		}
		return 0;
		
	}
	public int UpdateFid(String lid,String oldfid,String newfid) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		String sql = "CALL updateroom(?,?,?)";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, lid);
			pstmt.setString(2, oldfid);
			pstmt.setString(3, newfid);
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
