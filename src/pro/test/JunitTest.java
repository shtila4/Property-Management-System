package pro.test;



import java.sql.SQLException;



import org.junit.Test;

import pro.utils.DButil;



public class JunitTest {
	
	  @Test public  void testConn() throws SQLException {
	  System.out.println(DButil.getConn()); }
	  
	
	
}
