package healthwatcher;

import java.sql.Connection;
import java.sql.DriverManager;


public class BDTest {
	
	public static final String DB_URL = "jdbc:odbc:test";
	public static final String DB_LOGIN = "";
	public static final String DB_PASS = "";
	public static final String DB_DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";	
	
	public static void main(String[] args) {
	      try {
	        Connection con = DriverManager.getConnection("jdbc:ucanaccess://test.mdb", "", "");
	        con.close();
	      } catch (Exception e) {
	        System.out.println(e);
	      }	
	}

}
