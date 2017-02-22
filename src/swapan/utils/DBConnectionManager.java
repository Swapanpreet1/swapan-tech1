package swapan.utils;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	
	public class DBConnectionManager {
	   private static Connection connection;

	   public DBConnectionManager(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{
	       Class.forName("com.mysql.jdbc.Driver");
	       this.connection = DriverManager.getConnection(dbURL, user, pwd);
	   }

	   public static Connection getConnection(){
	       return connection;
	   }
	}


