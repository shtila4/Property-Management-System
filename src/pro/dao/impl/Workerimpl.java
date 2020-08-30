package pro.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pro.dao.WorkerDao;

import pro.pojo.Worker;
import pro.utils.DButil;

public class Workerimpl implements WorkerDao {

	@Override
	public Worker getoneWorker(String gid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Worker work = null;
		String sql = "select * from worker where Gid=?";
		
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gid);		
			rs = pstmt.executeQuery();
			if(rs.next()) {
				 work=new Worker(rs.getString("Gid"),rs.getString("Gname"),
						rs.getString("Gsex"),rs.getString("Gtel"),rs.getString("Gdate"),rs.getString("Gads"),rs.getString("Gword"),
						rs.getString("Seleary"),rs.getString("Dno"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeAll(rs, pstmt, conn);
		}
		return work;
	}
	public List<Worker>GetallWorkers(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from worker ";
		List<Worker>workers=new ArrayList();
		try {
			conn = DButil.getConn();
			pstmt = conn.prepareStatement(sql);
					
			rs = pstmt.executeQuery();
			while(rs.next()) {
			Worker	worker = new Worker(rs.getString("Gid"),rs.getString("Gname"),
					rs.getString("Gsex"),rs.getString("Gtel"),rs.getString("Gdate"),rs.getString("Gads"),rs.getString("Gword"),
					rs.getString("Seleary"),rs.getString("Dno"));
			workers.add(worker);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeAll(rs, pstmt, conn);
		}
		return workers;
	}
	 public int UpdateaWorker(String gid,String gname,String gsex,String gtel,String gdate,String gads,String gword,String seleary,String dno,String id) {
		 Connection conn = null;
			PreparedStatement pstmt = null;
			
			
			String sql = "update worker set Gid=?, Gname=?,Gsex=?, Gtel=?, Gdate=?, Gads=?,Gword=? ,Seleary=?,Dno=? where Gid=?";
			
			try {
				conn = DButil.getConn();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, gid);	
				pstmt.setString(2, gname);
				pstmt.setString(3, gsex);
				pstmt.setString(4, gtel);
				pstmt.setString(5, gdate);
				pstmt.setString(6, gads);
				pstmt.setString(7, gword);
				pstmt.setString(8, seleary);
				pstmt.setString(9, dno);
				pstmt.setString(10, id);
				
				int count=pstmt.executeUpdate();
				return count;
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DButil.closeAll(null, pstmt, conn);
			}
			return 0;
		 
		 
	 }
	 public  int Addaworker(String gid,String gname,String gsex,String gtel,String gdate,String gads,String gword,String seleary,String dno) {
		 Connection conn = null;
			PreparedStatement pstmt = null;
			
			
			String sql = "insert into worker values(?,?,?,?,?,?,?,?,?)";
			
			try {
				conn = DButil.getConn();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, gid);	
				pstmt.setString(2, gname);
				pstmt.setString(3, gsex);
				pstmt.setString(4, gtel);
				pstmt.setString(5, gdate);
				pstmt.setString(6, gads);
				pstmt.setString(7, gword);
				pstmt.setString(8, seleary);
				pstmt.setString(9, dno);
		
				
				int count=pstmt.executeUpdate();
				return count;
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DButil.closeAll(null, pstmt, conn);
			}
			return 0;
		 
	 }
	 public int DeleteaWorker(String gid) {
		 Connection conn = null;
			PreparedStatement pstmt = null;
			
			
			String sql = "delete from worker where Gid=?";
			
			try {
				conn = DButil.getConn();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, gid);	
				
		
				
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
