package pro.utils;



import java.sql.*;


import com.mchange.v2.c3p0.ComboPooledDataSource;


public class DButil {
	
	private static ComboPooledDataSource ds=new ComboPooledDataSource();
	public static Connection getConn() throws SQLException {
		return ds.getConnection();
	}
	public static void closeAll(ResultSet rs,Statement st,Connection conn) 
	{
		if(rs!=null) 
		{
			try 
			{
				rs.close();
			} catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(st!=null) 
		{
			
			try 
			{
				st.close();
			} catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	if(conn!=null) 
	{
		try 
		{
		conn.close();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	}
		

}
