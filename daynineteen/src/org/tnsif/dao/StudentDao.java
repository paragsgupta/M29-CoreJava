package org.tnsif.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDao {
	/*A connection (session) with a specificdatabase. 
	 * SQL statements are executed and results are returnedwithin the context of a connection. */
	public Connection createConnection()
	{
		String url="jdbc:mysql://localhost";
		String username="root";
		String password="300100";
		
		try {
			/*if driver class name is an incorrect then it will
			 * be handled by try and catch block*/
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Invalid driver class name");
		}
		Connection connection;
		try {
			connection=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println("Invali Credentials");
			connection=null;
		}
		return connection;
		
		//return null;
	}

}
