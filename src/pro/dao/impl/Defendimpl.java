package pro.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pro.dao.DefendDao;
import pro.pojo.Defend;
import pro.pojo.Gview;
import pro.utils.DButil;

public class Defendimpl implements DefendDao {

	
	@Override
	public List<Gview> getoneDefend(String gid) {
		Connection conn=null;
	     PreparedStatement pstmt=null;
	     ResultSet rs=null;
	     String sql="select * from gview where Gid=?";
	     List<Gview>defends=new ArrayList();
	     try {
		       conn=DButil.getConn();
		       pstmt=conn.prepareStatement(sql);
		       pstmt.setString(1, gid);
		       rs=pstmt.executeQuery();
		       while(rs.next())
		       {
		        Gview defend=new Gview(rs.getString("Gid"),rs.getString("Gname"),rs.getString("Gword"),rs.getString("Lid"));
		         defends.add(defend);
		       }
	       } catch (SQLException e) {
		    e.printStackTrace();
	       }finally {
		   DButil.closeAll(rs, pstmt, conn);
	      }
	  return defends;
	}
	public int addDefend(String gid,String lid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		String sql = "insert into defend values(?,?)";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gid);		
			pstmt.setString(2, lid);
			
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
