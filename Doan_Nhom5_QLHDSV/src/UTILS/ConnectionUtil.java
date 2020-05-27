package UTILS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	static String hostName="localhost";
	static String dbName="user";
	static String userName="root";
	static String password="";
	public ConnectionUtil() {
		// TODO Auto-generated constructor stub
	}
	public Connection getConnection() throws SQLException {
		String connectionURL="jdbc:mysql://"+hostName+":3306/"+dbName;
		Connection conn= DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}
}
